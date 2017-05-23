package ee.agri.alkor.util.convert;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

import ee.agri.alkor.model.Address;
import ee.agri.alkor.model.Decision;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.IEntity;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.ProductEnterpriseRole;
import ee.agri.alkor.model.ProductExamples;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.model.classes.ApplicationState;
import ee.agri.alkor.model.classes.ApplicationType;
import ee.agri.alkor.model.classes.Capacity;
import ee.agri.alkor.model.classes.Classificator;
import ee.agri.alkor.model.classes.Country;
import ee.agri.alkor.model.classes.EnterpriseRole;
import ee.agri.alkor.model.classes.PackingMaterial;
import ee.agri.alkor.model.classes.ProductExamplesDecisionType;
import ee.agri.alkor.model.classes.ProductType;
import ee.agri.alkor.model.classes.RegistryEntryDecisionType;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.util.convert.model.alkor1.ArAaRel;
import ee.agri.alkor.util.convert.model.alkor1.ArActor;
import ee.agri.alkor.util.convert.model.alkor1.ArActorAddCont;
import ee.agri.alkor.util.convert.model.alkor1.ArCapacity;
import ee.agri.alkor.util.convert.model.alkor1.ArCountry;
import ee.agri.alkor.util.convert.model.alkor1.ArDocAddAppl;
import ee.agri.alkor.util.convert.model.alkor1.ArDocAddCommiprot;
import ee.agri.alkor.util.convert.model.alkor1.ArItem;
import ee.agri.alkor.util.convert.model.alkor1.ArMaterial;
import ee.agri.alkor.util.convert.model.alkor1.ArProducttype;
import ee.agri.alkor.util.convert.model.alkor1.ArVeDocAddCommiprot;

public class Alkor1Converter implements InitializingBean {

	//Logger
	private static Logger LOGGER = Logger.getLogger(Alkor1Converter.class);

	// Used interfaces configured by spring
	private Alkor1Export alkor1Export;
	private IClassificatorService classService;
	private IAlkor2Service registryService;

	// Classificators map
	private Map<String, Country> countryMap;
	private Map<Integer, ProductType> productTypeMap;
	private Map<String, Capacity> capacityMap;
	private Map<String, EnterpriseRole> enterpriseRoleMap;
	private Map<String, PackingMaterial> packingMaterials;

	// *old id* - *new id* reference maps
	//private HashMap<Integer, Long> personIdMap = new HashMap<Integer, Long>();
	//private HashMap<Integer, Long> enterpriseIdMap = new HashMap<Integer, Long>();

	// *id* - *object* reference maps
	private HashMap<Integer, Person> personMap = new HashMap<Integer, Person>();
	private HashMap<Integer, Enterprise> enterpriseMap = new HashMap<Integer, Enterprise>();
	private HashMap<Integer, Product> productIdMap = new HashMap<Integer, Product>();
	private HashMap<Integer, ExpiredProductHelper> expiredProductMap = new HashMap<Integer, ExpiredProductHelper>();
	private HashMap<Integer, RegistryApplication> applicationIdMap = new HashMap<Integer, RegistryApplication>();

	/**
	 * Conversion entry point method.
	 * @throws Exception
	 */
	public void convert() throws Exception {
		convertActors();
		bindPersonToEnterprise();
		convertItems();
		convertAppls();

//		convertCountries();
//		convertVolumeClassificators();

	}

	private boolean convertVolumeClassificators() {

		List<ArCapacity> capacities = getAlkor1Export().fetchCapacities();
		File f = new File("classesTest.xml");
		PrintWriter out = null;
		try {

			out = new PrintWriter(f);
			out.println("    <!-- Mahud -->");
			out.println("    <bean id=\"capacitites\" class=\"ee.agri.alkor.model.ListHolder\">");
			out.println("        <property name=\"list\">");
			out.println("            <list>");

			for (ArCapacity arCapacity : capacities) {
				out.println("                <ref bean=\"capacity.cap" + arCapacity.getId() + "\"/>");
			}

			out.println("            </list>");
			out.println("        </property>");
			out.println("    </bean>");
			for (ArCapacity arCapacity : capacities) {
				out.println("    <bean id=\"capacity.cap" + arCapacity.getId() + "\" class=\"ee.agri.alkor.model.classes.Capacity\">");
				out.println("        <property name=\"categoryName\" value=\"Maht\"/>");
				out.println("        <property name=\"code\" value=\"CAP" + arCapacity.getId() + "\"/>");
				String name = arCapacity.getName().replaceAll("�", "&#245;")
						.replaceAll("�", "&#228;").replaceAll("�", "&#246;").replaceAll("�", "&#252;")
						.replaceAll("�", "&#213;").replaceAll("�", "&#196;").replaceAll("�", "&#214;")
						.replaceAll("�", "&#220;").replaceAll("�", "&#352;").replaceAll("�", "&#353;");
				out.println("        <property name=\"name\" value=\"" + name + "\"/>");
				out.println("        <property name=\"active\" value=\"TRUE\"/>");
				out.println("    </bean>");
			}

			out.close();

		} catch (IOException fnfe) {

		}

		return false;
	}

	private boolean convertAppls() {
		Date start = new Date();
		List<IEntity> entrys = new LinkedList<IEntity>();

		//Converts in batches - reads and inserts 1000 entries at a time
		int batchSize = 50;
		for (int c = 0; ; c += batchSize ) {

			//Gets the next batch of entries starting from c.
			Iterator alkor1Iterator = getAlkor1Export().fetchEntities("ArDocAddAppl", c, batchSize).iterator();

			if (!alkor1Iterator.hasNext()) {
				break;
			}

			while (alkor1Iterator.hasNext()) {
				RegistryApplication application = null;

				//Convert application
				ArDocAddAppl arDocAddAppl = (ArDocAddAppl) alkor1Iterator.next();
				application = convertApplication(arDocAddAppl);

				//Get the product for the application
				Product product = productIdMap.get(arDocAddAppl.getArItem().getId());
				application.setProduct(product);
				
				//if the product is in the expiredProductMap then we change the validUntil and ChangeReason of the registryEntry connected to this application
				if(expiredProductMap.get(arDocAddAppl.getArItem().getId()) != null && application.getRegistryEntry() != null) {
					application.getRegistryEntry().setChangeReason(expiredProductMap.get(arDocAddAppl.getArItem().getId()).getExpireNote());
					application.getRegistryEntry().setValidUntil(expiredProductMap.get(arDocAddAppl.getArItem().getId()).getExpireTime());
				}

				//saveApplication(application);
				entrys.add(application);
				//Bind the application to the product
				product.setRegistryEntryApplication(application);
				entrys.add(product);
				//saveProduct(product);
				if(product.getType() != null && "1".equals(product.getType().getCode())){
					ProductExamples ex = application.getProductExamples();
					if(ex == null) {
						ex = new ProductExamples();
					}
					ex.setCount(1);
					application.setProductExamples(ex);
				}

				//Put the application into an applicationMap for easy reference later on.
				applicationIdMap.put(arDocAddAppl.getId(), application);

			}
			getRegistryService().saveList(entrys);
			entrys.clear();

		}
		Date end = new Date();
		LOGGER.debug("Time take for convertApps " + (end.getTime() - start.getTime()));
		return true;
	}

	private RegistryApplication saveApplication(RegistryApplication application) {
		getRegistryService().save(application);
		return application;
	}

	private boolean convertItems() {
		Date start = new Date();
		List<IEntity> entrys = new LinkedList<IEntity>();
		//Converts in batches - reads and inserts 1000 entries at a time
		int batchSize = 50;
		for (int c = 0; ; c += batchSize ) {

			//Get the next batch of items starting from c.
			Iterator alkor1Iterator = getAlkor1Export().fetchEntities("ArItem", c, batchSize).iterator();
			if (!alkor1Iterator.hasNext()) {
				break;
			}

			while (alkor1Iterator.hasNext()) {
				Product product = null;

				ArItem item = (ArItem) alkor1Iterator.next();
				product = convertProduct(item);
				//saveProduct(product);
				entrys.add(product);
				//puts the products in a hashmap for easy linking with applications later on.
				productIdMap.put(item.getId(), product);
				if(item.getOutTime() != null) {
					expiredProductMap.put(item.getId(), new ExpiredProductHelper(item.getOutTime(), item.getOutRemarks()));
				}

			}
			getRegistryService().saveList(entrys);
			entrys.clear();
			//Prints the product map - for testing/debugging purposes only.
//			Set<Integer> keySet = productIdMap.keySet();
//			System.out.println("-------PRODUCTS-------");
//			for(Integer i : keySet) {
//				System.out.println("productIdMap key:" + i + ", value:" + productIdMap.get(i).getId());
//			}
//			System.out.println("Total productKeys: " + keySet.size());

		}
		Date end = new Date();
		LOGGER.debug("Time take for convertItems " + (end.getTime() - start.getTime()));

		return true;
	}

	private Product saveProduct(Product product) {
		getRegistryService().save(product);
		return product;
	}

	private Product convertProduct(ArItem item) {

		Product product = new Product();
		product.setName(item.getName());

		// Convert product type and log errors if found:
		ProductType type = convert(item.getArProducttype());
		if (type == null) {
			ArProducttype arProdType = item.getArProducttype();
			Integer prodTypeId = (arProdType != null) ? arProdType
					.getCustomId() : null;
			String typeName = (arProdType != null) ? arProdType.getName() : null;
			LOGGER.error("Couldn't find ProductType from Alkor1 productType, code: '"
							+ prodTypeId
							+ " name: '"
							+ typeName
							+ " for product: '" + product.getName());
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.debug("Found ProductType, code: '" + type.getCode()
						+ " name: '" + type.getName() + " for product: '"
						+ product.getName());
			product.setType(type);
		}

		//Convert capacities and log errors if found:
		Capacity capacity = convert(item.getArCapacity());
		if (capacity == null)
			LOGGER.error("PackingVolume == null for product: '"
					+ product.getName());
		else
			product.setPackingVolume(capacity);

		//Convert ethanol rates and log errors if found:
		BigDecimal etanRate = item.getVolume();
		if (etanRate == null) {
			LOGGER.error("etanRate == null for product: "
					+ item.getName());
			product.setEthanolRate(new BigDecimal(0));
		} else if (etanRate.compareTo(new BigDecimal(1000)) >= 0) {
			LOGGER.error("etanRate too big (larger than 1000) for product: "
					+ item.getName());
			product.setEthanolRate(new BigDecimal(0));
		} else {
			product.setEthanolRate(etanRate);
		}

		//Convert product origin country
		product.setOriginCountry(convert(item.getArCountry()));

		Set<ArDocAddAppl> arSet = item.getArDocAddAppls();
		if (arSet.size() > 1)
			throw new RuntimeException(
					"Fatal: alkor1 has > 1 application per product");

		if (arSet.size() == 1) {
			ArDocAddAppl arrr = ((ArDocAddAppl) arSet.iterator().next());

			/* Commented out by Sven - Importer != Applicant */
//			ArActor actor = arrr.getArActorByAppActorId();
//			Enterprise importer = enterpriseMap.get(enterpriseIdMap.get(actor.getId()));
//			if (importer != null)
//				product.setImporter(importer);
//			else {
//				LOGGER.error("Didn't find importer with name: '"
//						+ actor.getName() + "'" + " regNr: '" + actor.getCode()
//						+ "' for product '" + product.getName());
//			}

			//Convert producer
			ArActor actor = arrr.getArActorByManActorId();
			Enterprise producer = enterpriseMap.get(actor.getId());
			if (producer != null)
				product.setProducer(producer);
			else {
				LOGGER.error("Didn't find producer with name: '"
						+ actor.getName() + "'" + " regNr: '" + actor.getCode()
						+ "' for product '" + product.getName());
			}

			/* These belong to Application logically so they are converted at convertAppls() */
//			if (arrr.getArDocAddCommiprots().size() > 1)
//				LOGGER.info("Product '" + product.getName()
//						+ "' has > 1 registry entries per application");
//
//			RegistryApplication application = convert(arrr);
//			product.addApplication(application);
//
//			// TODO what the hell
//			for (ArDocAddCommiprot ar1RegistryEntry : arrr
//					.getArDocAddCommiprots()) {
//				RegistryEntry registryEntry = convert(application,
//						ar1RegistryEntry);
//				application.addRegistryEntry(registryEntry);
//			}
		}
		
		product.setPackingMaterial(convert(item.getArMaterial()));
		
		product.setCreated(item.getInsTime());
		product.setModified(item.getUpdTime());
		product.setCode((item.getArEkn() != null) ? item.getArEkn().getCode(): "-");
		product.setNotes(item.getComment()); //import comments
		return product;
	}

	private PackingMaterial convert(ArMaterial arMaterial) {
		if(arMaterial == null) {
			return null;
		} else {
			if(packingMaterials == null) {
				List list = classService.findClassItems("PackingMaterial");
				packingMaterials = new HashMap<String, PackingMaterial> ();
				for(Object mat : list) {
					packingMaterials.put(((PackingMaterial)mat).getName(), (PackingMaterial)mat);
				}
			}
			return packingMaterials.get(arMaterial.getName());
		}
		
	}

	private boolean convertActors() {
		Date start = new Date();
		//Converts in batches - reads and inserts 1000 entries at a time
		int batchSize = 50;
		List<IEntity> entrys = new LinkedList<IEntity>();
		for (int c = 0; ; c += batchSize ) {

			//Get the next batch of entries starting from index c
			Iterator alkor1Iterator = getAlkor1Export().fetchEntities("ArActor", c, batchSize).iterator();
			if (!alkor1Iterator.hasNext()) {
				break;		//break when there is nothing more to get
			}

			while (alkor1Iterator.hasNext()) {

				Enterprise enterprise = null;
				Person person = null;
				ArActor actor = (ArActor) alkor1Iterator.next();

				if (actor.getForenames() != null) { 				/* Actor is person */

					person = convertActorToPerson(actor);
					//savePerson(person);
					entrys.add(person);
					//populates the personIdMap, which holds the (key) *old id* and (value) *new id* pairs
					//personIdMap.put(actor.getId(), person.getId());

					//puts the person object into a map which holds the (key) *new id* and (value) *person obj.*
					personMap.put(actor.getId(), person);

					//these maps are for easy enterprise-person relation linking afterwards.

				} else { 											/* Actor is enterprise */
					enterprise = convertActorToEnterprise(actor);

					//Saves the enterprise if it doesnt exist, or gets the enterprise if it does exist already
					entrys.add(enterprise);

						//same as with person -these maps are for easy enterprise-person relation linking afterwards.
						//enterpriseIdMap.put(actor.getId(), enterprise.getId());
						enterpriseMap.put(actor.getId(), enterprise);
				}

			}
			getRegistryService().saveList(entrys);
			entrys.clear();

		}
		Date end = new Date();
		LOGGER.debug("Time take for convertActors " + (end.getTime() - start.getTime()));
		//Prints the stored person id-s and enterprise id-s - for testing/debugging purposes only.
//		Set<Integer> keySet = personIdMap.keySet();
//		System.out.println("-------PERSONS-------");
//		for(Integer i : keySet) {
//			System.out.println("personMap key:" + i + ", value:" + personIdMap.get(i));
//		}
//		System.out.println("Total personKeys: " + keySet.size());
//
//		keySet = enterpriseIdMap.keySet();
//		System.out.println("-------ENTERPRISES-------");
//		for(Integer i : keySet) {
//			System.out.println("enterpriseMap key:" + i + ", value:" + enterpriseIdMap.get(i));
//		}
//		System.out.println("Total enterpriseKeys: " + keySet.size());

		return false;
	}

	private Enterprise saveEnterprise(Enterprise ent) {
		getRegistryService().save(ent);
		return ent;
	}

	private boolean savePerson(Person person) {
		getRegistryService().save(person);
		return false;
	}

	/**
	 * Converts an ArActor type object that we have previously determined to be a person to a Person type object.
	 * @param alk1Person
	 * @return
	 */
	private Person convertActorToPerson(ArActor alk1Person) {
		Person person = new Person();
		person.setFirstName(alk1Person.getForenames());
		person.setLastName(alk1Person.getName());
		try{
			Integer.parseInt(alk1Person.getCode());
			person.setRegistrationId(alk1Person.getCode());
		} catch (NumberFormatException nfe) {

		}
		person.setCreated(alk1Person.getInsTime());
		person.setModified(alk1Person.getUpdTime());

		return person;
	}

	/**
	 * Converts an ArActor type object that we have previously determined to be an enterprise to an Enterprise type object.
	 * @param alk1Enterprise
	 * @return
	 */
	private Enterprise convertActorToEnterprise(ArActor alk1Enterprise) {
		Enterprise enterprise = new Enterprise();

		enterprise.setName(alk1Enterprise.getName());
		enterprise.setRegistrationId(alk1Enterprise.getCode());
		enterprise.setMTRCode(alk1Enterprise.getRegNr());
		enterprise.setAcknowledgementNr(alk1Enterprise.getAckDecision());
		enterprise.setAcknowledgementDate(alk1Enterprise.getAckDecisionTime());
		enterprise.setExciseStoreHouseNr(alk1Enterprise.getAstorageLnr());
		enterprise.setCreated(alk1Enterprise.getInsTime());
		enterprise.setModified(alk1Enterprise.getUpdTime());

		//convert Address
		ArActorAddCont actorAddress = alk1Enterprise.getArActorAddCont();
		if (actorAddress != null){
			enterprise.setAddress(convertAddress(actorAddress));
		}

		//convert Enterprise roles
		enterprise.setEnterpriseRoles(convertProductEnterpriseRolesFromFlag(enterprise, alk1Enterprise.getFlags()));

		return enterprise;
	}

	/**
	 * Converts and ArActorAddCont type object to an Address object
	 * @param actorAddress
	 * @return
	 */
	private Address convertAddress(ArActorAddCont actorAddress) {
		Address entAddress = new Address();

		ArCountry arCountry = actorAddress.getArCountry();
		Country entCountry = convert(arCountry);
		if (entCountry != null)
			entAddress.setCountry(entCountry);
		else {
			String contryCode = (arCountry != null) ? arCountry.getIso2() : null;
			LOGGER.error("Couldn't find Country with code'" + contryCode
//					+ "' for Enterprise '" + alk1Enterprise.getName() + "'"
//					+ " with regNr: '" + alk1Enterprise.getCode() + "'"
					);
		}
		entAddress.setDistrict(actorAddress.getState());
		entAddress.setStreet(actorAddress.getAddress());
		//entAddress.setAddress(actorAddress.getAddress());
		entAddress.setOrgUnit(actorAddress.getCity());
		entAddress.setPostalIndex(actorAddress.getZip());
		return entAddress;
	}

	/**
	 * Converts old enterprise role flags to new enterprise-enterpriseRole relation objects.
	 * @param enterprise
	 * @param flag
	 * @return
	 */
	private Set<ProductEnterpriseRole> convertProductEnterpriseRolesFromFlag(Enterprise enterprise, int flag) {
		Set<ProductEnterpriseRole> roles = new HashSet<ProductEnterpriseRole>();
		switch (flag) {
			case 2:
			case 2050:{ 		/* Enterprise has an applicant role (old flag 2) */
				roles.add(createEnterpriseRole(enterprise, "APL"));

			} break;
			case 4:
			case 2052:{ 		/* Enterprise has an producer role (old flag 4) */
				roles.add(createEnterpriseRole(enterprise, "PRO"));

			} break;
			case 6:
			case 2054:{ 		/* Enterprise has an importer role (old flag 6) */
				roles.add(createEnterpriseRole(enterprise, "IMP"));

			} break;
			case 8:
			case 2056:{ 		/* Enterprise has an marketer role (old flag 8) */
				roles.add(createEnterpriseRole(enterprise, "MAR"));

			} break;
			
		}
		return roles;
	}

	/**
	 * Creates a Enterprise-EnterpriseRole relation object between an enterprise specified by "enterprise" and
	 * enterpriseRole specified and retrieved by "roleClassCode"
	 * @param enterprise
	 * @param roleClassCode
	 * @return
	 */
	private ProductEnterpriseRole createEnterpriseRole(Enterprise enterprise, String roleClassCode) {
		ProductEnterpriseRole role = new ProductEnterpriseRole();
		role.setEnterprise(enterprise);
		role.setEnterpriseRoleClass(enterpriseRoleMap.get(roleClassCode));
		return role;
	}

	/**
	 * Binds persons to enterprises
	 * @return
	 */
	private boolean bindPersonToEnterprise() {
		Date start = new Date();
		int count = 0;
		List<IEntity> entrys = new LinkedList<IEntity>();
		Iterator alkor1Iterator = getAlkor1Export().findNext("ArAaRel", count).iterator();
		while(alkor1Iterator.hasNext()) {
			ArAaRel relation = (ArAaRel)alkor1Iterator.next();
			int actorEntId = relation.getArActorByActor1Id().getId();
			int actorRepId = relation.getArActorByActor2Id().getId();
			LOGGER.info("Binding enterprise with ID: " + actorEntId + " and representative ID " + actorRepId);
			Enterprise enterprise = enterpriseMap.get(actorEntId);
			Person person = personMap.get(actorRepId);
			if (enterprise != null && person != null) {
				enterprise.setEnterpriseRepresentative(person);
				entrys.add(enterprise);
				if(entrys.size() > 49) {
					getRegistryService().saveList(entrys);
					entrys.clear();
				}
			}

		}
		Date end = new Date();
		LOGGER.debug("Time take for bindPersonToEnterprise " + (end.getTime() - start.getTime()));
		return true;

	}

	/**
	 * Converts an ArDocAddAppl type object to a RegistryApplication type object.
	 * @param ar1Application
	 * @return
	 */
	private RegistryApplication convertApplication(ArDocAddAppl ar1Application) {

		RegistryApplication application = new RegistryApplication();

		application.setCreated(ar1Application.getInsTime());
		application.setModified(ar1Application.getUpdTime());
		application.setArrived(ar1Application.getArrTime());
		application.setNr(new Long(ar1Application.getDocNr()).toString());

		//Convert applicant
		ArActor actor = ar1Application.getArActorByAppActorId();
		Enterprise applicant = enterpriseMap.get(actor.getId());
		if (applicant != null)
			application.setApplicant(applicant);
		else {
			LOGGER.error("Didn't find applicant with name: '" + actor.getName()
					+ "'" + " regNr: '" + actor.getCode()
					+ "' for application nr: '" + application.getNr());
		}

		//Convert registry entries.
		if (ar1Application.getArDocAddCommiprots().size() == 0) {
			LOGGER.error("application: '" + application.getNr()
					+ " has no decisions/entries");
			return application;
		} else {
			ArVeDocAddCommiprot ar1Desicion = null;
			boolean hasMultipleDecisions = false;
			for(ArVeDocAddCommiprot app : ar1Application.getArDocAddCommiprots()) {
				if(ar1Desicion == null) {
					ar1Desicion = app; 
				} else {
					hasMultipleDecisions = true;
					if((ar1Desicion.getProTime() == null && app.getProTime() != null) || (app.getProTime() != null && app.getProTime().after(ar1Desicion.getProTime()))) {
						ar1Desicion = app;
					}
				}
			}
			
				application.setRegistryEntry(convertRegistryEntry(application, ar1Desicion));

				Decision decision = new Decision();
				application.setDecision(decision);

				RegistryEntryDecisionType decType = new RegistryEntryDecisionType();

				decision.setNr(ar1Desicion.getDecisionNr());

				//Convert the decision explanation.
				if (ar1Desicion != null && ar1Desicion.getDecisionStory()!=null &&
						ar1Desicion.getDecisionStory().length() > 2000) {
					decision.setExplanation(ar1Desicion.getDecisionStory().substring(0, 2000));
				} else {
					decision.setExplanation(ar1Desicion.getDecisionStory());
				}

				//Convert the decision date.
				decision.setDate(ar1Desicion.getProTime());
				
				
				//set application type
				ApplicationType type = new ApplicationType();
				type.setCode(IClassificatorService.APPL_TYPE_ARE);
				application.setType(type);

				//convert the decision type / application state
				ApplicationState state = new ApplicationState();
				switch (ar1Desicion.getDecisionAnal()) {
					case 0:
						//Application state - checking
						state.setCode(IClassificatorService.APPL_STATE_CTL);
						application.setState(state);
						break;
					case 1:
						//Application state - entered to registry
						decType.setCode(IClassificatorService.REGENTRY_DECISION);
						decision.setRegEntryDecision(decType);
						state.setCode(IClassificatorService.APPL_STATE_RGE);
						application.setState(state);
						break;
					case 2:
						//Application state - not entered to registry
						decType.setCode(IClassificatorService.APPL_STATE_RGN);
						decision.setRegEntryDecision(decType);
						state.setCode(IClassificatorService.APPL_STATE_RGN);
						application.setState(state);
						break;
					default:

				}

				//Convert product examples
				decision.setProdExamplesDecision(convertProductExamplesDecisionType(ar1Desicion.getDecisionItem()));

		}

		// TODO state etc
		return application;
	}

	/**
	 * Convert product examples decision type
	 * @param decisionItem
	 * @return
	 */
	private ProductExamplesDecisionType convertProductExamplesDecisionType(short decisionItem) {

		ProductExamplesDecisionType exDecType = new ProductExamplesDecisionType();

		switch (decisionItem) {
			case 1:
				//keep product examples
				exDecType.setCode(IClassificatorService.EXAMPLES_DECISION_KEEP);
				break;
			case 2:
				return null;
				// TODO Vanas baasisi oli see osaliselt tagastada
			case 3:
				//return product examples
				exDecType.setCode(IClassificatorService.EXAMPLES_DECISION_RETURN);
				break;
			default:
				return null;
		}

		return exDecType;

	}

	/**
	 * Converts an ArDocAddCommiprot object to a RegistryEntry object.
	 * @param application
	 * @param ar1RegistryEntry
	 * @return
	 */
	private RegistryEntry convertRegistryEntry(RegistryApplication application,
			ArVeDocAddCommiprot ar1RegistryEntry) {

		RegistryEntry entry = null;

		if (ar1RegistryEntry.getRegBookNr() != null) {
			entry = new RegistryEntry();
			entry.setNr(ar1RegistryEntry.getRegBookNr());
			entry.setValidFrom(ar1RegistryEntry.getRecTime());
			try {
				entry.setValidUntil(convertRegistryEntryValidUntil(ar1RegistryEntry.getRecTime()));
			} catch (ParseException e) {
				LOGGER.error("Error parsing valid until date for Registry Entry of " +
						"application with nr: "+ application.getNr());
			}
			entry.setCreated(ar1RegistryEntry.getInsTime());
			entry.setModified(ar1RegistryEntry.getUpdTime());

		}
		return entry;
	}

	/**
	 * Converts a valid until date for a registry entry from a given valid from date.
	 * The rule is as follows:
	 * 		1.)If the "valid from/recTime" date is less than 2004.06.01 then
	 * 		"valid until" date will be 2009.06.01
	 *  	2.)Otherwise the "valid until" date will be "valid from/recTime" date + 5 years.
	 *
	 * @param recTime Valid from date
	 * @return Valid until date or null if recTime is null
	 * @throws ParseException if a parse exception occurs.
	 */
	private static Date convertRegistryEntryValidUntil(Date recTime) throws ParseException {
		Date result = null;
		if (recTime == null) {
			return null;
		}

		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

		Date epoch = format.parse("01.06.2004");
		if (recTime.before(epoch)) {
			result = format.parse("01.06.2009");
		} else {
			/* Increase the year by 5 */
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(recTime);
			calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR)+5);
			result = calendar.getTime();
		}

		return result;
	}

	/**
	 * Converts an ArCountry type object to a Country type object (classificator)
	 * @param alkor1Country
	 * @return
	 */
	private Country convert(ArCountry alkor1Country) {

		if (alkor1Country == null) {
			return null; 
		}else {
			Classificator countryClass;
			if(alkor1Country.getIso2() != null && !alkor1Country.getIso2().equals("null")) {
				countryClass = findClass(alkor1Country.getIso2(),
						this.countryMap);
			} else {
				//Scotland has a ISO2 value of null in the previous DB
				countryClass = findClass("SCO", this.countryMap);
			} 
			return (Country)countryClass;
		}

	}

	/**
	 * Converts an ArProducttype type object to a Product type object (classificator)
	 * @param alkor1ProdType
	 * @return
	 */
	private ProductType convert(ArProducttype alkor1ProdType) {

		if (alkor1ProdType == null)
			return null;
		Classificator productClass = findClass(alkor1ProdType.getCustomId(),
				this.productTypeMap);
		ProductType type = new ProductType();
		if(productClass != null) {
			type.setCode(productClass.getCode());
		}
		return type;

	}

	/**
	 * Converts an ArCapacity type object to a Capacity type object (classificator)
	 * @param volume
	 * @return
	 */
	private Capacity convert(ArCapacity volume) {
		if (volume == null)
			return null;

		Classificator capacity = findClass("CAP" + volume.getId(), this.capacityMap);

		Capacity cap = new Capacity();
		if (capacity != null) {
			cap.setCode(capacity.getCode());
		}
		return cap;


//		String capacity = volume.getName();
//		String[] caps = (capacity != null) ? capacity.split(" ") : null;
//		capacity = (caps != null) ? caps[0] : null;
//		capacity = (capacity != null) ? capacity.replace(',', '.') : null;
//
//		/* ADDED BY SVEN - our db uses Integer for capacity! */
//		int loc = capacity.indexOf(".");
//		if (loc > 0)
//			capacity = capacity.substring(0, loc);
//		Integer result = null;
//		try {
//			result = (capacity != null) ? new Integer(capacity) : null;
//		} catch (NumberFormatException nfe) {
//			LOGGER.error("Capacity format error: '" + capacity);
//		}
//		return result;
	}

	/**
	 * Called after propertise has set by Spring.
	 *
	 * @throws Exception
	 */
	public void afterPropertiesSet() throws Exception {

		List<Classificator> classes = getClassService().findClassItems(
				"Country");
		this.countryMap = new HashMap<String, Country>();
		for (Classificator classItem : classes) {
			this.countryMap.put(classItem.getCode(), (Country)classItem);
		}
		this.productTypeMap = new HashMap<Integer, ProductType>();
		classes = getClassService().findClassItems("ProductType");
		for (Classificator classItem : classes) {
			this.productTypeMap.put(new Integer(classItem.getCode()), (ProductType)classItem);
		}
		this.capacityMap = new HashMap<String, Capacity>();
		classes = getClassService().findClassItems("Capacity");
		for (Classificator classItem : classes) {
			this.capacityMap.put(classItem.getCode(), (Capacity)classItem);
		}
		this.enterpriseRoleMap = new HashMap<String, EnterpriseRole>();
		classes = getClassService().findClassItems("EnterpriseRole");
		for (Classificator classItem : classes) {
			this.enterpriseRoleMap.put(classItem.getCode(), (EnterpriseRole)classItem);
		}

	}

	private Classificator findClass(Object inValue, Map classMap) {
		Classificator classItem = null;
		if(inValue instanceof String)
			inValue = ((String)inValue).trim();
		if (inValue == null)
			LOGGER.error("Classificator code == null");
		else
			classItem = (Classificator) classMap.get(inValue);
		if (classItem == null)
			LOGGER.error("Couldn't find classificator value for code='"
					+ inValue + "'");
		return classItem;
	}

	boolean stringCompare(String arg0, String arg1) {
		boolean match = arg0.equals(arg1);
		if (!match) {
			if (arg0.length() < arg1.length()) {
				match = arg1.indexOf(arg0) >= 0;
			} else
				match = arg0.indexOf(arg1) >= 0;

		}
		return match;
	}

	public Alkor1Export getAlkor1Export() {
		return alkor1Export;
	}

	public void setAlkor1Export(Alkor1Export alkor1Export) {
		this.alkor1Export = alkor1Export;
	}

	public IClassificatorService getClassService() {
		return classService;
	}

	public void setClassService(IClassificatorService classService) {
		this.classService = classService;
	}

	public IAlkor2Service getRegistryService() {
		return registryService;
	}

	public void setRegistryService(IAlkor2Service registryService) {
		this.registryService = registryService;
	}
	
	/**
	 * Private class used to hold expired product information
	 * @author Kaupo Parmas
	 *
	 */
	private class ExpiredProductHelper {
		
		/**
		 * Product expire date that should be put to the
		 * product application registry entry validUntil
		 * date 
		 */
		private Date expireTime;
		
		/**
		 * Product expire note that should be put to the 
		 * product application registry entry changeReason
		 */
		private String expireNote;
		
		public ExpiredProductHelper(Date expire, String note) {
			this.expireTime = expire;
			this.expireNote = note;
		}
		
		public Date getExpireTime() {
			return expireTime;
		}
		public void setExpireTime(Date expireTime) {
			this.expireTime = expireTime;
		}
		public String getExpireNote() {
			return expireNote;
		}
		public void setExpireNote(String expireNote) {
			this.expireNote = expireNote;
		}
		
		
	}

}

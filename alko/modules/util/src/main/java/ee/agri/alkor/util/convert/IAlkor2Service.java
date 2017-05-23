package ee.agri.alkor.util.convert;

import java.util.Hashtable;
import java.util.List;

import ee.agri.alkor.model.IEntity;
import ee.agri.alkor.model.RegistryEntry;

public interface IAlkor2Service {

	void save(IEntity entity);

	Object find(Class entityClazz, String propName, Object value);

	void saveList(List <IEntity> iEntityList);

	void callFlush();

	Hashtable<String, RegistryEntry> findAllRegEntry();
}
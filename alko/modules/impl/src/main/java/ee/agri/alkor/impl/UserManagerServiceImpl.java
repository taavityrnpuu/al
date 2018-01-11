package ee.agri.alkor.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.transaction.annotation.Transactional;

import com.google.gwt.core.client.GWT;

import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.model.UserGroup;
import ee.agri.alkor.model.classes.SystemGroup;
import ee.agri.alkor.service.ConstraintViolationException;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IUserManagerService;
import ee.agri.alkor.service.ObjectNotFoundException;
import ee.agri.alkor.service.SystemException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import ee.piksel.util.*;

/**
 * User manager service implementation.
 * 
 * @author ivar
 * 
 */
public class UserManagerServiceImpl extends BaseBO implements IUserManagerService {

	private static Logger LOGGER = Logger.getLogger(UserManagerServiceImpl.class);

	@Transactional(rollbackFor = org.hibernate.exception.ConstraintViolationException.class)
	public SystemUser saveUser(final SystemUser user) throws ConstraintViolationException {
		// getHibernateTemplate().setEntityInterceptor(new AuditInterceptor());
		try {
			System.out.println(user.getId());
			getHibernateTemplate().execute(new HibernateCallback() {
				public Object doInHibernate(Session session) {
					// We have to merge with existing roles.
					if (user.getId() != null) {
						// List<UserGroup> roles = (List<UserGroup>) session
						// .createQuery(
						// "from UserGroup r where r.user.id = ?")
						// .setParameter(0, user.getId()).list();
						//
						// SystemUser old = findUser(user.getName());
						//
						// Set newRoles = new HashSet();
						// for (UserGroup role : user.getGroups()) {
						// UserGroup foundRole = null;
						// for (UserGroup existingRole : roles) {
						// if (role.getGroupClass()
						// .getCode()
						// .equals(existingRole.getGroupClass()
						// .getCode()))
						// foundRole = existingRole;
						// }
						// if (foundRole != null) {
						// newRoles.add(foundRole);
						// roles.remove(foundRole);
						// } else {
						// newRoles.add(role);
						// }
						// }
						// session.clear();
						// //
						// for (UserGroup existingRole : roles) {
						// if (LOGGER.isDebugEnabled())
						// LOGGER.debug("deleting: "
						// + existingRole.getGroupClass()
						// .getCode());
						//
						// session.delete(existingRole);
						// }
						// user.setGroups(newRoles);
						PostgreUtils.delete("DELETE FROM user_group where user_id = " + user.getId());
						session.saveOrUpdate(user);

					} else {
						/**
						 * SystemGroup defaultRole = new
						 * SystemGroup(IClassificatorService.ROLE_ANONYMOUS);
						 * UserGroup ug = new UserGroup(); ug.setUser(user);
						 * ug.setGroupClass(defaultRole);
						 */
						/*
						 * Kontroll kas kasutaja on olemas
						 */
						user.setPassword(getMD5(user.getPassword()));
						boolean sent = false;

						try {
							SystemUser old = findUser(user.getName());
						}

						catch (Exception ex) {
							try {
								SystemUser old = findUserByPerson(user.getPerson().getRegistrationId());
							}

							catch (Exception exa) {
								if (sent == false) {
									sendEmail(user);
									sent = true;
								}
							}
						}
						
						try {
							SystemUser old = findUserByPerson(user.getPerson().getRegistrationId());
						}

						catch (Exception ex) {
							try {
								SystemUser old = findUser(user.getName());
							}

							catch (Exception exo) {
								if (sent == false) {
									sendEmail(user);
									sent = true;
								}
							}

						}
						user.setActive(false);
						session.save(user);
					}

					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(user.getName());
		} catch (Throwable e) {
			e.printStackTrace();
			throw new SystemException(e);
		}

		// if (user.getId() == null) {

		// }

		return user;
	}

	@Transactional(rollbackFor = org.hibernate.exception.ConstraintViolationException.class)
	public SystemUser saveUser2(final SystemUser user) throws ConstraintViolationException {
		// getHibernateTemplate().setEntityInterceptor(new AuditInterceptor());
		try {
			getHibernateTemplate().execute(new HibernateCallback() {
				public Object doInHibernate(Session session) {
					// We have to merge with existing roles.
					if (user.getId() != null) {
						List<UserGroup> roles = (List<UserGroup>) session
								.createQuery("from UserGroup r where r.user.id = ?").setParameter(0, user.getId())
								.list();

						SystemUser old = findUser(user.getName());

						user.setPassword(getMD5(user.getPassword()));

						if ((old.getPassword() != user.getPassword())
								&& (user.getPassword() != null || user.getPassword() != "")) {
							sendEmail(user);
							user.setActive(false);
						}

						Set newRoles = new HashSet();
						for (UserGroup role : user.getGroups()) {
							UserGroup foundRole = null;
							for (UserGroup existingRole : roles) {
								if (role.getGroupClass().getCode().equals(existingRole.getGroupClass().getCode()))
									foundRole = existingRole;
							}
							if (foundRole != null) {
								newRoles.add(foundRole);
								roles.remove(foundRole);
							} else {
								newRoles.add(role);
							}
						}
						session.clear();
						//
						for (UserGroup existingRole : roles) {
							if (LOGGER.isDebugEnabled())
								LOGGER.debug("deleting: " + existingRole.getGroupClass().getCode());

							session.delete(existingRole);
						}
						user.setGroups(newRoles);
						session.saveOrUpdate(user);
					} else {
						/**
						 * SystemGroup defaultRole = new
						 * SystemGroup(IClassificatorService.ROLE_ANONYMOUS);
						 * UserGroup ug = new UserGroup(); ug.setUser(user);
						 * ug.setGroupClass(defaultRole);
						 */
						/*
						 * Kontroll kas kasutaja on olemas
						 */
						boolean sent = false;
						try {
							SystemUser old = findUser(user.getName());
						}

						catch (Exception ex) {
							try {
								SystemUser old = findUserByPerson(user.getPerson().getRegistrationId());
							}

							catch (Exception exa) {
								if (sent == false) {
									sendEmail(user);
									sent = true;
								}
							}
						}

						try {
							SystemUser old = findUserByPerson(user.getPerson().getRegistrationId());
						}

						catch (Exception ex) {
							try {
								SystemUser old = findUser(user.getName());
							}

							catch (Exception exo) {
								if (sent == false) {
									sendEmail(user);
									sent = true;
								}
							}

						}

						user.setActive(false);
						session.save(user);
					}

					return null;
				}
			});
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(user.getName());
		} catch (Throwable e) {
			throw new SystemException(e);
		}

		// if (user.getId() == null) {

		// }

		return user;
	}

	public void sendEmail(SystemUser user) {

		String email = user.getPerson().getContactInfo().getEmail();
		String pwd = user.getPassword();

		String contextPath = "";
		String from = "";
		String host = "";
		ResultSet rs = PostgreUtils.query("SELECT * FROM config WHERE type = 'email'");
		try {
			while (rs.next()) {
				switch (rs.getString("key")) {
				case "EMAIL_FROM_MAIL":
					from = rs.getString("value");
					break;
				case "EMAIL_SMTP_HOST":
					host = rs.getString("value");
					break;
				case "EMAIL_BASE_URL":
					contextPath = rs.getString("value");
					break;
				default:
					continue;
				}
			}
		} catch (Exception cs) {
			cs.printStackTrace();
		}

		Mailer m = new Mailer();
		m.setTo(email);
		m.setFrom(from);
		m.setSubject("Alkoholiregistri kasutajaandmed");
		m.setText("Tere tulemast Alkoholiregistri süsteemi!\n\nTeie kasutajatunnus on: " + user.getName()
				+ "\nTeie aktiveerimiskood on: " + pwd + "\n\nPalume seadistada endale parool aadressil: " + contextPath
				+ "changepass?uname=" + user.getName() + "");
		m.setSmtpHost(host);
		m.sendEmail();

	}

	@Transactional(rollbackFor = org.hibernate.HibernateException.class)
	public void deleteUser(final Long userId) {
		super.delete(SystemUser.class, userId);
	}

	@Transactional(rollbackFor = org.hibernate.HibernateException.class)
	public void addGroupToUser(final String userName, final String groupCode) {
		// getHibernateTemplate().setEntityInterceptor(new AuditInterceptor());
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) {
				SystemUser user = findUserWithGroups(session, userName);
				UserGroup group = new UserGroup();
				SystemGroup groupClass = new SystemGroup();
				groupClass.setCode(groupCode);
				group.setGroupClass(groupClass);
				user.addGroup(group);
				session.saveOrUpdate(user);
				return null;
			}

		});
	}

	public void removeGroupFromUser(final String userName, final String groupCode) {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) {
				SystemUser user = findUserWithGroups(session, userName);
				UserGroup groupToDelete = null;
				for (UserGroup group : user.getGroups()) {
					if (groupCode.equals(group.getGroupClass().getCode()))
						groupToDelete = group;
				}
				if (groupToDelete != null) {
					user.getGroups().remove(groupToDelete);
					session.delete(groupToDelete);
				}
				return null;
			}

		});

	}

	public SystemUser findUser(String userName) {
		try {
			return (SystemUser) getHibernateTemplate().find("from SystemUser u where u.name = ?", userName).get(0);
		} catch (IndexOutOfBoundsException ioe) {
			throw new ObjectNotFoundException(SystemUser.class, userName);
		}
	}

	public SystemUser findUserByPerson(String registrationId) {
		try {
			return (SystemUser) getHibernateTemplate()
					.find("from SystemUser u where u.person.registrationId = ?", registrationId).get(0);
		} catch (IndexOutOfBoundsException ioe) {
			throw new ObjectNotFoundException(SystemUser.class, registrationId);
		}
	}

	public SystemUser findUserWithGroups(final String userName) {
		return (SystemUser) getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session) throws HibernateException {
				return findUserWithGroups(session, userName);
			}
		});
	}

	public List<SystemGroup> findSystemGroups() {

		List<SystemGroup> withoutEIT = new ArrayList<SystemGroup>();

		List<SystemGroup> list = (List<SystemGroup>) getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session) throws HibernateException {
				return ClassificatorServiceImpl.findClassItems(session, "SystemGroup");
			}
		});

		for (SystemGroup g : list) { // jätame EIT'i välja
			if (!g.getCode().equals("EIT_GRP")) {
				withoutEIT.add(g);
			}
		}

		return withoutEIT;
	}

	public static SystemUser findUserWithGroups(Session session, String userName) {
		SystemUser user = findUser(session, userName);
		Hibernate.initialize(user.getGroups());
		return user;
	}

	public List<SystemUser> findUsersInGroup(final String groupCode) {
		return (List<SystemUser>) getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session) throws HibernateException {
				List results = session.createQuery("from SystemUser u join u.groups g where g.groupClass.code = ?")
						.setString(0, groupCode).list();
				List usersList = new ArrayList();
				for (Iterator it = results.iterator(); it.hasNext();) {
					Object[] row = (Object[]) it.next();
					SystemUser user = (SystemUser) row[0];
					usersList.add(user);
				}
				return usersList;
			}
		});
	}

	public static SystemUser findUser(Session session, String userName) {
		SystemUser user = (SystemUser) session.createQuery("from SystemUser u where u.name = ?").setString(0, userName)
				.list().get(0);
		return user;
	}

	public List<SystemUser> findUsers() {
		return (List<SystemUser>) getHibernateTemplate().find("from SystemUser su");
	}

	private String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(input.getBytes());

			byte byteData[] = md.digest();

			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}

			return sb.toString().substring(0, 19);
		} catch (NoSuchAlgorithmException ex) {
			return input;
		}
	}

}

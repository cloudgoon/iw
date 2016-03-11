package com.xnx3.j2ee.dao;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import com.xnx3.j2ee.entity.User;

/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.xnx3.j2ee.entity.User
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class UserDAO {
	private static final Logger log = LoggerFactory.getLogger(UserDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String EMAIL = "email";
	public static final String PASSWORD = "password";
	public static final String HEAD = "head";
	public static final String NICKNAME = "nickname";
	public static final String AUTHORITY = "authority";
	public static final String REGTIME = "regtime";
	public static final String LASTTIME = "lasttime";
	public static final String REGIP = "regip";
	public static final String LASTIP = "lastip";
	public static final String REFERRERID = "referrerid";
	public static final String PHONE = "phone";
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(User transientInstance) {
		log.debug("saving User instance");
		try {
			getCurrentSession().saveOrUpdate(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(User persistentInstance) {
		log.debug("deleting User instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public User findById(java.lang.Integer id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) getCurrentSession().get(
					"com.xnx3.j2ee.entity.User", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<User> findByExample(User instance) {
		log.debug("finding User instance by example");
		try {
			List<User> results = (List<User>) getCurrentSession()
					.createCriteria("com.xnx3.j2ee.entity.User")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<User> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<User> findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List<User> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<User> findByHead(Object head) {
		return findByProperty(HEAD, head);
	}

	public List<User> findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List<User> findByReferrerid(Object referrerid) {
		return findByProperty(REFERRERID, referrerid);
	}

	public List<User> findByRegtime(Object regtime) {
		return findByProperty(REGTIME, regtime);
	}

	public List<User> findByLasttime(Object lasttime) {
		return findByProperty(LASTTIME, lasttime);
	}

	public List<User> findByRegip(Object regip) {
		return findByProperty(REGIP, regip);
	}

	public List<User> findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List<User> findByLastip(Object lastip) {
		return findByProperty(LASTIP, lastip);
	}
	
	public List findAll() {
		log.debug("finding all User instances");
		try {
			String queryString = "from User";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public User merge(User detachedInstance) {
		log.debug("merging User instance");
		try {
			User result = (User) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(User instance) {
		log.debug("attaching dirty User instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(User instance) {
		log.debug("attaching clean User instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UserDAO) ctx.getBean("UserDAO");
	}
}
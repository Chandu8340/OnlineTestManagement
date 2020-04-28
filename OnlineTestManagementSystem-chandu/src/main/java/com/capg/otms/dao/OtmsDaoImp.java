package com.capg.otms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.otms.entity.UserBean;

@Repository
@Transactional
public class OtmsDaoImp implements IOtmsDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public UserBean addUser(UserBean userBean) {
		em.persist(userBean);
		;
		return userBean;
	}

	@Override
	public UserBean updateUser(UserBean userBean) {

		userBean = em.merge(userBean);
		return userBean;
	}

	@Override
	public void deleteUser(long userId) {

		UserBean bean = em.find(UserBean.class, userId);

		em.remove(bean);

	}

	@Override
	public List<UserBean> getAllUser() {

		TypedQuery<UserBean> query = em.createQuery("from UserBean", UserBean.class);
		return query.getResultList();

	}

}

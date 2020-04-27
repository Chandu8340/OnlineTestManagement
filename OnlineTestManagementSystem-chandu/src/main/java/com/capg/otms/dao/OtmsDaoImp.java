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
	public UserBean registerUser(UserBean userBean) {
		
		em.persist(userBean);
		
		return userBean;
	}
	@Override
	public UserBean updateUser(UserBean userBean) {
		em.merge(userBean);
		return userBean;
	}
	@Override
	public UserBean deleteUser(int userId) {
		
		
		UserBean b=em.find(UserBean.class, userId);
		
		 em.remove(b);
		return b;
		 
		
	}
	@Override
	public List<UserBean> getAllUser() {
		
		TypedQuery<UserBean> query = em.createQuery("from UserBean", UserBean.class);
		return query.getResultList();
		
	
	}
	
	

	
	

}

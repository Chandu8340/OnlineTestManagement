package com.capg.otms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
	public UserBean updateUser(int userId) {
	UserBean update=em.find(UserBean.class, userId);
		em.merge(update);
		return update;
	}
	@Override
	public UserBean deleteUser(int userId) {
		 UserBean delete= em.find(UserBean.class,userId);
		em.remove(delete);
			
			return delete;
		
	}
	
	

	
	

}

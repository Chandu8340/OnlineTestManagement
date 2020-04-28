package com.capg.otms.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.dao.IOtmsDao;
import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;
@Service
public  class OtmsServiceImp implements IOtmsService {
	@Autowired
	IOtmsDao dao;
	public Questions update(Questions question) {
		return dao.update(question);
	}

	@Override
	public Questions getResult(Test test) {
		// TODO Auto-generated method stub
		return null;
	}

}

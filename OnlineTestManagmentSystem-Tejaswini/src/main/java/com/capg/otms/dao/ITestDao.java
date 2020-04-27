package com.capg.otms.dao;

import java.util.Set;

import com.capg.otms.entity.TestBean;
import com.capg.otms.entity.questions;

public interface ITestDao {
	public TestBean CreateTest(TestBean test);
	 public TestBean updateTest(TestBean test);
	 public TestBean findTestById(int testId);
	 public Set<questions> assignTest(int userId, int testId);
	}

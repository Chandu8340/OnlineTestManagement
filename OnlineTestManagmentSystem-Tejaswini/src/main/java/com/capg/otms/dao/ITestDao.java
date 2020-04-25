package com.capg.otms.dao;

import java.util.Set;

import com.capg.otms.entity.TestBean;
import com.capg.otms.entity.questions;

public interface ITestDao {

	 public TestBean updateTest(TestBean test, String testTitle);

	public Set<questions> assignTest(int userId, int testId);

}

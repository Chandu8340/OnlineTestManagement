package com.capg.otms.dao;

import java.util.List;

import com.capg.otms.entity.TestBean;

public interface ITestDao {
public TestBean addTest(TestBean bean );
public void removeTest(int testId);
public List<TestBean>getAllTests();

}

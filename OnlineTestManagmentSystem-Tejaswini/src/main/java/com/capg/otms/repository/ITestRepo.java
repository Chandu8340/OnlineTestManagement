package com.capg.otms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.otms.entity.TestBean;



public interface ITestRepo extends JpaRepository< TestBean, Long>{

}

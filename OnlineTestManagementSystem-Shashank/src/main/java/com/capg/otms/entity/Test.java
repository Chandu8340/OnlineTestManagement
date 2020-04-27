package com.capg.otms.entity;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")

public class Test {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private BigInteger TestId;
	private String TestTitle;
	private BigDecimal TotalMarks;
	private BigDecimal marksScored;
	public BigInteger getTestId() {
		return TestId;
	}
	public void setTestId(BigInteger testId) {
		TestId = testId;
	}
	public String getTestTitle() {
		return TestTitle;
	}
	public void setTestTitle(String testTitle) {
		TestTitle = testTitle;
	}
	public BigDecimal getTotalMarks() {
		return TotalMarks;
	}
	public void setTotalMarks(BigDecimal totalMarks) {
		TotalMarks = totalMarks;
	}
	public BigDecimal getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(BigDecimal marksScored) {
		this.marksScored = marksScored;
	}
	
	
	
	
	
	

}

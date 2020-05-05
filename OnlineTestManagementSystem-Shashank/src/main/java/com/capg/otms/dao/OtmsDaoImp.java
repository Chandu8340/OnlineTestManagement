package com.capg.otms.dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.otms.entity.Questions;
import com.capg.otms.entity.Test;
@Repository
@Transactional

public  class OtmsDaoImp implements IOtmsDao{
	
	@PersistenceContext
	EntityManager em;
	
	/*
	 * public int getResult(int choosenAnswer1,int choosenAnswer2,int total) { int
	 * marks=0; Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	 * map.put(1,choosenAnswer1); map.put(2,choosenAnswer2); Map<Integer, Integer>
	 * map2 = new HashMap<Integer, Integer>(); map2.put(1,0); map2.put(2,1);
	 * Set<Integer> set1 = map.keySet(); Set<Integer> set2 = map2.keySet(); int[]
	 * chosenAnswer = new int[set1.size()]; int[] givenAnswer = new
	 * int[set2.size()];
	 * 
	 * int j = 0; for (int i : set1) { chosenAnswer[j] = i;
	 * 
	 * j++; } int k = 0; for (int i : set2) {
	 * 
	 * givenAnswer[k] = i; k++;
	 * 
	 * } for (int l = 0; l < chosenAnswer.length; l++) {
	 * 
	 * if (chosenAnswer[l] == givenAnswer[l]) {
	 * 
	 * 
	 * total=marks+5;
	 * 
	 * 
	 * } else { total=marks; }
	 * 
	 * } return marks;
	 * 
	 * }
	 * 
	 */

	@Override
	public Questions update(Questions questions) {
		/*
		 * Questions question=new Questions(); question.setQuestionId(1);
		 * question.setQuestionTitle("what is 1+1");
		 * 
		 * question.setQuestionMarks(5); question.setQuestionAnswer(0); String[]
		 * questionOption = {"0","1","2","4"}; question.setChosenAnswer(1);
		 * question.setMarksScored(4);
		 * 
		 * question.setQuestionOption(questionOption); em.persist(question);
		 */
		return em.merge(questions);
	
	}

	
		// TODO Auto-generated method stub
		public int getResult(Questions question) { 
			int choosenAnswer1;
			int choosenAnswer2;
			int total;
			
			
			
			
			
			
			
			 int marks=0; Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			  map.put(1,1); 
			  map.put(2,2);
			  Map<Integer, Integer> map2 = new HashMap<Integer, Integer>(); 
			  map2.put(1,0); 
			  map2.put(2,1);
			  Set<Integer> set1 = map.keySet(); 
			  Set<Integer> set2 = map2.keySet(); 
			  
			 int[] chosenAnswer = new int[set1.size()]; 
			 int[] givenAnswer = new int[set2.size()];
			  
			  int j = 0; 
			  for (int i : set1) {
				  chosenAnswer[j] = i;
			  
			  j++;
			  } 
			  int k = 0;
			  for (int i : set2) {
			  
			  givenAnswer[k] = i;
			  k++;
			  
			 } 
			  for (int l = 0; l < chosenAnswer.length; l++) {
			  
			  if (chosenAnswer[l] == givenAnswer[l]) {
			  
			  
			  total=marks+5;
			  
			  
			  } else { total=marks; }
			  
			  } return marks;
			  
		
	}

	@Override
	public Questions addQuestions(Questions question) {
		// TODO Auto-generated method stub
		em.persist(question);
		System.out.println(question);
		return question;
	}

	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		TypedQuery<Questions> query=em.createQuery("from Questions",Questions.class);
		return query.getResultList();
	}
}





	
	
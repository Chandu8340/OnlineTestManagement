package com.capg.otms.entity;
import java.util.*;
public class QuestionBean {
public static void main(String args[]) {
	HashSet<String> Question= new HashSet<String>();
	Question.add("whait is java?");
	Question.add("what is spring");
	System.out.println("the questions are:");
	for(String Questions:Question)
		System.out.println(Questions);
}}

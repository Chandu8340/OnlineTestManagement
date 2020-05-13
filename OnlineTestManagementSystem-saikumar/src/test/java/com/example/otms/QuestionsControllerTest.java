package com.example.otms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.capg.otms.dao.OtmsDaoImp;
import com.capg.otms.entity.Questions;
import com.capg.otms.service.OtmsServiceImp;

public class QuestionsControllerTest extends OnlineTestManagementSystemSaikumarApplicationTests {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;
	@Autowired
	OtmsServiceImp service;
	@Autowired
	OtmsDaoImp daoImp;

	@Before
	public void setup() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void testCreateQuestion() throws Exception {
		String url = "/Questions/create";
		String json = "{\r\n" + "  \r\n" + "	\"questionTitle\":\"3+4\",\r\n"
				+ "	\"questionOption\":[\"0\",\"7\",\"4\"],\r\n" + "	\"questionAnswer\":7,\r\n"
				+ "	\"questionMarks\":5\r\n" + "	\r\n" + "}";
		mockMvc.perform(
				post(url).contentType(MediaType.APPLICATION_JSON).content(json).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	
	}

	@Test
	public void testRemoveQuestion() throws Exception {

		String url = "/Questions/remove/81";

		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete(url)).andReturn();
		
		int status = mvcResult.getResponse().getStatus(); 
		int expected = service.hereWeAre(); 

		if(expected==200) { 
			assertEquals(status,200); 
			} 
		
		else if (expected == 400) {
			assertEquals(status, 400);
		}

	}

	@Test
	public void testGetAllQuestions() {
		
	List<Questions> questionList=service.getAllQuestions();
	assertEquals(questionList.size(),4);
	}

}

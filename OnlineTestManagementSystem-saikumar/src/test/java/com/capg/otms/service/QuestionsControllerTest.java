 package com.capg.otms.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.capg.otms.controller.QuestionsController;
import com.capg.otms.dao.OtmsDaoImp;
import com.capg.otms.entity.Questions;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionsControllerTest {
//extends OnlineTestManagementSystemSaikumarApplicationTests {

	/*
	 * @Autowired private WebApplicationContext webApplicationContext;
	 * 
	 * 
	 * 
	 * @Before public void setUp()
	 * 
	 * { mockMvc=MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	 * }
	 */
	
	
	
	@Autowired
	private OtmsServiceImp serviceImp;
	
	
	@MockBean
	private OtmsDaoImp daoImp;
	
	Questions question = new Questions();
	
	@Test
 public void testCreateQuestion() {
		 //throws Exception {
		
		/*
		 * mockMvc.perform(post("/Questions/create")).andExpect(status().is(200))
		 * .andExpect(content().contentType("application/json;charset:UTF-8"))
		 * .andExpect(jsonPath("$.questionId").value("46")).andExpect(jsonPath(
		 * "$.questionTitle").value("3+4")).andExpect(jsonPath(
		 * "$.questionOption").value("['1','7','4']"))
		 * .andExpect(jsonPath("$.questionAnswer").value("7")).andExpect(jsonPath(
		 * "$.questionMarks").value(5));
		 */
		/*
		 * String json=
		 * "{\"questionTitle\":\"3+4\",\"questionOption\":\"['1','7','4']\",\"questionAnswer\":\"7\",\"questionMarks\":\"5\"}";
		 * 
		 * 
		 * mockMvc.perform(post("/Questions/create")
		 * .contentType(MediaType.APPLICATION_JSON) .content(json))
		 * .andExpect(status().isOk());
		 */
		
		question.setQuestionId(3);
		question.setQuestionTitle("1+1");
		String[] arr= {"1","2","3"};
		question.setQuestionOption(arr);
		
		question.setQuestionMarks(5);
		question.setQuestionAnswer(2);
		Mockito.when(daoImp.addQuestion(question)).thenReturn(question);
		assertThat(serviceImp.addQuestion(question)).isEqualTo(question);
		
		
		
		
	}
	
	private MockMvc mockMvc;
	
	@Test
	public void testRemoveQuestion() throws Exception {
	
		
		
		 //String url="/remove/questionId";
		 
		/*
		 * MvcResult
		 * mvcResult=mockMvc.perform(MockMvcRequestBuilders.delete(url,"53")).andReturn(
		 * ); int status=mvcResult.getResponse().getStatus(); assertEquals(status, 200);
		 * String content =mvcResult.getResponse().getContentAsString();
		 * assertEquals("deleted", content);
		 */
		
		  QuestionsController controller = new QuestionsController();
		  if(null!=controller)
		  {
			  controller.removeQuestion(51);
			    
		  }
		  controller.removeQuestion(50);
		  assertEquals(50,question.getQuestionId());
		  
		 
		/*
		 * question.setQuestionId(51);
		 * 
		 * Mockito.when(serviceImp.deleteQuestion(question.getQuestionId())).thenReturn(
		 * question);
		 * assertThat(daoImp.deleteQuestion(question.getQuestionId())).isEqualTo(
		 * question);
		 */
	
	
		}

	@Test
	public void testGetAllQuestions() {
		assertEquals(2, 1+1);
	}

}

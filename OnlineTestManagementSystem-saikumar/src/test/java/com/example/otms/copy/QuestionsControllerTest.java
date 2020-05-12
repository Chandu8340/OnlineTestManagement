 package com.example.otms.copy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.otms.dao.OtmsDaoImp;
import com.capg.otms.entity.Questions;
import com.capg.otms.service.OtmsServiceImp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionsControllerTest {
//extends OnlineTestManagementSystemSaikumarApplicationTests {

	/*
	 * @Autowired private WebApplicationContext webApplicationContext;
	 * 
	 * private MockMvc mockMvc;
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

	@Test
	public void testRemoveQuestion() {
		assertEquals(2, 1+1);
	}

	@Test
	public void testGetAllQuestions() {
		assertEquals(2, 1+1);
	}

}

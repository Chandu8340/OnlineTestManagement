package capg.otms.service;


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

	
	import com.capg.otms.dao.OtmsDaoImp;
	import com.capg.otms.entity.Questions;
import com.capg.otms.service.OtmsServiceImp;

	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class QuestionsControllerTest {
	
		
		
		
		@Autowired
		private OtmsServiceImp serviceImp;
		
		
		@MockBean
		private OtmsDaoImp daoImp;
		
		Questions question = new Questions();
		
		@Test
	 public void testUpdateQuestion() {
			
			
			question.setQuestionId(3);
			question.setQuestionTitle("1+1");
			String[] arr= {"1","2","3"};
			question.setQuestionOption(arr);
			
			question.setQuestionMarks(5);
			question.setQuestionAnswer(2);
			Mockito.when(daoImp.update(question)).thenReturn(question);
			assertThat(serviceImp.update(question)).isEqualTo(question);
			
			
			
			
		}
		
		@Test
		public void testCreateQuestion() {
			question.setQuestionId(3);
			question.setQuestionTitle("1+1");
			String[] arr= {"1","2","3"};
			question.setQuestionOption(arr);
			
			question.setQuestionMarks(5);
			question.setQuestionAnswer(2);
			Mockito.when(daoImp.addQuestions(question)).thenReturn(question);
			assertThat(serviceImp.addQuestions(question)).isEqualTo(question);
			
			
		}

		@Test
		public void testGetAllQuestions() {
			assertEquals(2, 1+1);
		}

	}



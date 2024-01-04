package com.mysite.sbb;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	

	@Test
	void contextLoads() {
		Question q1 = new Question();
		q1.setSubject("what is sbb?");
		q1.setContent("Want to know about sbb");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1); // save the first question

		Question q2 = new Question();
		q2.setSubject("what is spring boot model?");
		q2.setContent("id gets automatically created? ");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2); // save the second question
	}

}

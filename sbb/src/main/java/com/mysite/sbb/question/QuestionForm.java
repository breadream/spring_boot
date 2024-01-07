package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
	
	@NotEmpty(message="Title can't be empty")
	@Size(max=200)
	private String subject;
	
	@NotEmpty(message="Content can't be empty")
	private String content;
}

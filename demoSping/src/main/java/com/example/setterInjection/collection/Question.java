package com.example.setterInjection.collection;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String question;
	private List<String> answers;
	
	
	public int getId() {
		return id;
	}

    //Optional getters(not required for injection)
	public void setId(int id) {
		this.id = id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<String> getAnswers() {
		return answers;
	}


	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}


	void displayInfo() {
		System.out.println(id +" "+question);
		System.out.println("answers are : ");
		
		for(String ans : answers) {
			System.out.println(ans);	
		}
	}
}

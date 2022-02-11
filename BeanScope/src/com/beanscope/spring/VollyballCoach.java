package com.beanscope.spring;

public class VollyballCoach implements Coach {

	private Fortune fortune;
	
	
	
	public VollyballCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String dailyRoutin() {
		// TODO Auto-generated method stub
		return "here is a vollyball coach";
	}

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return fortune.getquote();
	}

}

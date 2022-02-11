package com.beanscope.spring;

public class CricketCoach implements Coach {

	private Fortune fortune;
	
	
	
	

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String dailyRoutin() {
		// TODO Auto-generated method stub
		return "Hello cricket coach here";
	}

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return fortune.getquote();
	}

}

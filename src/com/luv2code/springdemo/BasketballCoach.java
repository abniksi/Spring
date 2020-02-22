package com.luv2code.springdemo;

public class BasketballCoach implements Coach{
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}


	public BasketballCoach() {
		System.out.println("No arg constructor Basketball Coach");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method Basketball Coach");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice free throws and make 80% of them";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

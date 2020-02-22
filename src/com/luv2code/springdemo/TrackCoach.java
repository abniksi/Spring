package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 2 miles";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//add init method (called hooks)
	public void doMyStartupStuff() {
		System.out.println("Birth of a Bean.");
	}
	
	//add destroy method
	public void doMyCleanupStuff() {
		System.out.println("Destruction of bean occuring.");
	}
}

package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach : no-arg constructor");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : setter - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach : setter - setTeam");
		this.team = team;
	}


	// Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : setter method");

		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

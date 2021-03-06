package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		
		ArrayList<String> randomFortunes = new ArrayList<String>();
		randomFortunes.add("You will get wealth.");
		randomFortunes.add("You will find love.");
		randomFortunes.add("Today is your lucky day.");
		randomFortunes.add("Something good is about to happen.");
		randomFortunes.add("Your heart will lead to trouble.");
		
		Random random = new Random();
		int x = random.nextInt(5);
		
		return randomFortunes.get(x);
 	}

}

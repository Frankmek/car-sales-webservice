package com.aipalbot.carsales.webservice.util;

import java.util.Random;

public class CommonUtil {
	
	static Random rand = new Random();
	
	public static int generateNumber() {
		
		int n = rand.nextInt(50000000);
		
		return n;
	}

}

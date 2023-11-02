package com.foreach;

import java.util.ArrayList;
import java.util.List;

public class LambdaExprForeach {

	public static void main(String[] args) {
		
		List<String> cityNames = new ArrayList<String>();
		
		cityNames.add("NewDelhi");
		cityNames.add("Chennai");
		cityNames.add("Mumbai");
		cityNames.add("Agra");
		cityNames.add("Jaipur");
		cityNames.add("Delhi");
		cityNames.forEach(
				(city)->System.out.println(city)
				);
				
			

	}

}

package mainProgram;

import dataManager.Middleware;

public class Main {

	public static void main(String[] args) {
		
		Middleware middleware = new Middleware(); 
		
		middleware.serialize();
		
		middleware.deserialize();
				
		System.out.println("The program runs perfectly!!");

	}

}

package noon.controller;

import java.util.Scanner;

public class NoonController 
{
	
	public void start()
	{
		System.out.println("I am an very boring person");
		
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite poisoned berry?");
		String answer = firstScanner.nextLine();
		System.out.println("Oh cool, you like " + answer + ".");
	}
}

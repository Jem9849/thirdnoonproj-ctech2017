package noon.controller;

import java.util.Scanner;
import noon.model.PlayDohCircle;

public class NoonController 
{
	
	public void start()
	{
		System.out.println("I am an very boring person");
		
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("LOOK I MADE A CURCLE!");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
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

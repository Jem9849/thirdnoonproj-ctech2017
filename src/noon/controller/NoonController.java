package noon.controller;

import java.util.Scanner;
import noon.model.PlayDohCircle;
import noon.model.PlayDohKiddo;

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
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("HOWBIGOFACIRCLEDOYOUWANT?");
		int circleSize = myScanner.nextInt();
		
		PlayDohCircle thirdCircle = new PlayDohCircle(circleSize);
		System.out.println(thirdCircle);
		
		System.out.println("What size should we change the 2nd to?");
		int updated = myScanner.nextInt();
		secondCircle.setSize(updated);
		System.out.println("The circle now is....");
		System.out.println(secondCircle);
		
		PlayDohKiddo firstkid = new PlayDohKiddo();
		PlayDohKiddo secondkid = new PlayDohKiddo();
		PlayDohKiddo thirdkid = new PlayDohKiddo(5,17,9);
		System.out.println(firstkid);
		System.out.println(secondkid);
		System.out.println(thirdkid);
		
		
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

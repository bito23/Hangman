package ro.jademy.hm.ui;

import java.util.Scanner;

public class UserInterface {

	private Scanner keyboard;
	private String name;
	
	
	public UserInterface(Scanner keyboard){
		this.keyboard = keyboard;
	}
	
	
	public void startMessage(){
		System.out.println("\tWelcome!\n...Classic Hangman game...\n");
	}
	
	public String insertName(){
		System.out.println("Please enter your name here: ");
		this.name = keyboard.next();
		return name;
	}
	

	public void showTheRules(String name){
		System.out.println("\nThe rules of hangman game are: ");
		System.out.println("1.You can insert only one letter at a time;");
		System.out.println("2.You have only 8 lives at your disposal in order to win.");
		System.out.println("Good luck " + name + "!");
	}
	
	
	
	
	
	
	
	
	
	
}

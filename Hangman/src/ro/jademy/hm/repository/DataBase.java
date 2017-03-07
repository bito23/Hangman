package ro.jademy.hm.repository;

import java.util.Random;

public class DataBase {

	public static String selectedWord(){
		
		String[] words = {"house","keyboard","dog","book","blue","word"};
		
		Random random = new Random();
		
		
		int arrayLength = words.length;
		int randomNumber = random.nextInt(arrayLength);
		
		String selectedWord = words[randomNumber];
		
		return selectedWord;
	}
	
	
	
}

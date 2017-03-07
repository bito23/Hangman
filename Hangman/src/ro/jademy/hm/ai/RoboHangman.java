package ro.jademy.hm.ai;

import java.util.ArrayList;
import java.util.Scanner;

import ro.jademy.hm.main.App;
import ro.jademy.hm.repository.DataBase;
import ro.jademy.hm.ui.UserInterface;

public class RoboHangman {

	Scanner keyboard = new Scanner(System.in);

	UserInterface userInit = new UserInterface(keyboard);
	App myApp = new App();
	DataBase db = new DataBase();

	String guessTheWord;
	String selectedWord;
	String name;
	int noMistakes = 0;

	// init game(ask the user for a name)
	public void initGame() {
		this.name = userInit.insertName();
	}

	// Home menu of the app
	public void showMenu() {
		do {
			System.err.println("\n Welcome " + name);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("------------------");
			System.out.println("[1] Start Game");
			System.out.println("[2] Rules");
			System.out.println("[3] Exit\n");

			int choose = keyboard.nextInt();

			switch (choose) {
			case 1:
				hiddenWord();
				think();
				System.out.println("\nCongratulations!");
				break;
			case 2:
				userInit.showTheRules(this.name);
				showMenu();

			case 3:
				System.out.println("...Good Bye...");
				break;
			default:
				System.err.println("Please enter a valid command!");
				showMenu();
				break;
			}

		} while (keyboard.nextInt() != 3);
	}

	// selected word(hidden)
	public String hiddenWord() {
		this.selectedWord = db.selectedWord();
		guessTheWord = "";

		for (int i = 0; i < selectedWord.length(); i++) {
			this.guessTheWord = guessTheWord.concat("-");
		}
		return guessTheWord;
	}

	// graphic
	public void showHangman(int noMistakes) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (noMistakes) {
		case 0:
			System.out.println("    ___________   ");
			System.out.println("    | /       |");
			System.out.println("    |/        |");
			System.out.println("    |          ");
			System.out.println("    |          ");
			System.out.println("    |          ");
			System.out.println("    |          ");
			System.out.println("    |          ");
			System.out.println("    |          ");
			System.out.println("    |          ");
			System.out.println("    |          ");
			System.out.println("    |          ");
			System.out.println("____|_______________");
			break;
		case 1:
			System.out.println("    ___________ ");
			System.out.println("    | /       | ");
			System.out.println("    |/       _|_");
			System.out.println("    |      (|. .|)");
			System.out.println("    |       |_-_| ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("____|_______________");
			break;
		case 2:
			System.out.println("    ___________   ");
			System.out.println("    | /       |");
			System.out.println("    |/       _|_");
			System.out.println("    |      (|. .|)");
			System.out.println("    |       |_-_| ");
			System.out.println("    |         | ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |          ");
			System.out.println("____|_______________");
			break;
		case 3:
			System.out.println("    ___________   ");
			System.out.println("    | /       |");
			System.out.println("    |/       _|_");
			System.out.println("    |      (|. .|)");
			System.out.println("    |       |_-_| ");
			System.out.println("    |         | ");
			System.out.println("    |        /  ");
			System.out.println("    |       /   ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("____|_______________");
			break;
		case 4:
			System.out.println("    ___________   ");
			System.out.println("    | /       |");
			System.out.println("    |/       _|_");
			System.out.println("    |      (|. .|)");
			System.out.println("    |       |_-_| ");
			System.out.println("    |         | ");
			System.out.println("    |        / \\ ");
			System.out.println("    |       /   \\");
			System.out.println("    |           ");
			System.out.println("    |            ");
			System.out.println("    |            ");
			System.out.println("    |           ");
			System.out.println("____|_______________");
			break;
		case 5:
			System.out.println("    ___________   ");
			System.out.println("    | /       |");
			System.out.println("    |/       _|_");
			System.out.println("    |      (|. .|)");
			System.out.println("    |       |_-_| ");
			System.out.println("    |         | ");
			System.out.println("    |        /|\\ ");
			System.out.println("    |       / | \\");
			System.out.println("    |         |");
			System.out.println("    |           ");
			System.out.println("    |           ");
			System.out.println("    |          ");
			System.out.println("____|_______________");
			break;
		case 6:
			System.out.println("    ___________   ");
			System.out.println("    | /       |");
			System.out.println("    |/       _|_");
			System.out.println("    |      (|. .|)");
			System.out.println("    |       |_-_| ");
			System.out.println("    |         | ");
			System.out.println("    |        /|\\ ");
			System.out.println("    |       / | \\");
			System.out.println("    |         |");
			System.out.println("    |        /   ");
			System.out.println("    |       /    ");
			System.out.println("    |            ");
			System.out.println("____|_______________");
			break;
		case 7:
			System.out.println("    ___________   ");
			System.out.println("    | /       |");
			System.out.println("    |/       _|_");
			System.out.println("    |      (|. .|)");
			System.out.println("    |       |_-_| ");
			System.out.println("    |         | ");
			System.out.println("    |        /|\\ ");
			System.out.println("    |       / | \\");
			System.out.println("    |         |");
			System.out.println("    |        / \\");
			System.out.println("    |       /   \\");
			System.out.println("    |          ");
			System.out.println("____|_______________");
			break;
		}
	}

	// all the logic
	public void think() {

		ArrayList<Character> usedChars = new ArrayList<Character>();

		String selected = this.selectedWord;
		String guess = this.guessTheWord;

		StringBuilder sb = new StringBuilder(guess);

		char search;

		while ((guess.contains("-")) && noMistakes < 9) {

			if (this.noMistakes == 8) {
				System.err.println("...GAME OVER...");
				this.noMistakes = 0;
				showMenu();
			}

			// graphic
			showHangman(noMistakes);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Used: " + usedChars);

			System.err.println("\nThis is your word:\n" + sb + "\n");

			String userInsert = keyboard.next();

			usedChars.add(userInsert.charAt(0));

			if (userInsert.length() == 1) {

				if (selected.contains(userInsert.toLowerCase())) {

					for (int i = 0; i < guess.length(); i++) {

						search = selected.charAt(i);

						if (search == userInsert.charAt(0)) {

							sb.setCharAt(i, search);
						}
					}

					guess = sb.toString();

				} else {
					this.noMistakes++;
					System.out.println();
					System.err.println("Bad luck...Try again! ");
				}
			} else {
				System.err.println("Please insert only one letter at a time!");
			}
		}
	}
}

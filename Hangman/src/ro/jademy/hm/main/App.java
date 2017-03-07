package ro.jademy.hm.main;

import java.util.Scanner;

import ro.jademy.hm.ai.RoboHangman;
import ro.jademy.hm.ui.UserInterface;

public class App {

	public void runApp() {

		// init
		Scanner keyboard = new Scanner(System.in);

		UserInterface userInt = new UserInterface(keyboard);

		RoboHangman robot = new RoboHangman();
		// show start message
		userInt.startMessage();

		// init game
		robot.initGame();

		// start game
		robot.showMenu();

	}
}

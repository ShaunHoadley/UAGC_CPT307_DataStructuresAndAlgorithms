/*
 * 		SortedListProgram.java
 * 		Shaun Hoadley
 * 		CPT-307 Data Structures and Algorithms
 * 		Professor Pete Limon
 * 		July 26, 2020
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortedListProgram {

	private static void sleep(int time) {
		
		try {
			Thread.sleep(time);
		}
		catch (Exception e) {
		}
	}
	
	public static void main(String[] args) {
		
		var myFavGames = new LinkedList<String>(
				Arrays.asList("Kerbal Space Program", "Space Engineers", "Oblivion", "World of Warcraft", "Civilization VI"));
		
		System.out.println("\nMy favorite games are:\n" + myFavGames);
		sleep(2000);
		Collections.sort(myFavGames);
		System.out.println("\nLet me put them in order:\n" + myFavGames);
		sleep(2000);
		System.out.println("\nWait a second, I forgot about Grand Theft Auto V:");
		
		myFavGames.add(0, "Grand Theft Auto V");
		
		sleep(2000);
		System.out.println("\nThese are my favorite games:\n" + myFavGames);
		sleep(2000);
		System.out.println("\nThey are out of order again.");
		
		Collections.sort(myFavGames);
		
		sleep(2000);
		System.out.println("\nThis is bettter:\n" + myFavGames);
		sleep(2000);
		System.out.println("\nI almost never play Oblivion anymore.\nI will remove it from the list.");
		
		myFavGames.remove(3);
		
		sleep(2000);
		System.out.println("\nThis is the final list:\n" + myFavGames);
	}

}

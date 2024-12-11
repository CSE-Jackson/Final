package main;

import java.util.Scanner;

public class ZodiacSign {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Ask the user for their birth month and birth day
		System.out.print("Enter your birth month:");
		int month = scanner.nextInt();
		System.out.print("Enter your birth day:");
		int day = scanner.nextInt();
		
		String zodiacSign = "";
		
		// Determine the zodiac sign based on the month and day as numbers
		if ((month == 3 && day >= 21) || (month == 4 && day <=18)) {
			zodiacSign = "Aries";			
		} else if ((month == 4 && day >=20) || (month == 5 && day <= 20)) {
			zodiacSign = "Taurus";
		} else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
			zodiacSign = "Gemini";
		} else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
			zodiacSign = "Cancer";
		} else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			zodiacSign = "Leo";
		} else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
			zodiacSign = "Virgo";
		} else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
			zodiacSign = "Libra";
		} else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
			zodiacSign = "Scorpio";
		} else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
			zodiacSign = "Sagittarius";
		} else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
			zodiacSign = "Capricorn";
		} else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
			zodiacSign = "Aquarius";
		} else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
			zodiacSign = "Pisces";
		} else {
			// Output of wrong numbers
			System.out.println("Invalid date!");
			return;
		}
		
		// Output the zodiac sign
		System.out.println("You are a " + zodiacSign);
		
		scanner.close();
	}
}
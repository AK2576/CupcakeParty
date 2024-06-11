package com.amena;

import java.util.Scanner;

/**
 * @author AmenaKassim
 * @date 02/09/2024
 * Calculating the amount of cupcakes that are leftover
 */

public class CupcakeParty {
	
	/**
	 * Main method
	 * @param args Command Line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Amount of cupcakes that are in regular boxes
		System.out.println("Enter number of regular boxes");
		System.out.println("> ");
		int regBox = input.nextInt();
		
		// Amount of cupcakes that are in small boxes
		System.out.println("Enter number of small boxes");
		System.out.println("> ");
		int smallBox = input.nextInt();
		
		// Calculates the total amount of cupcakes there are
		int total = 8 * regBox + smallBox * 3;
		
		// Number of students
		int students = 28;
		
		// Calculates the amount of cupcakes leftover
		int leftover;
		leftover = total % students;
		
		// Prints out the leftover amount
		System.out.println(leftover);
	}
}

/*
 * Calculates the average of 5 marks and returns it to user
 * 
 * date				20220415
 * @filename		AverageCalculator.java
 * @author			Ayah M.
 */

import java.util.Scanner;
public class AverageCalculator {

	public static void main(String[] args) {
		Scanner keyedInput = new Scanner (System.in);
        
        int [] grades = new int [10];
        int total = 0;
        double average;
        final int NUM_OF_MARKS = 5;
        
        System.out.println("");
        System.out.println("·̩̩̥͙＊*•̩̩͙✩•̩̩͙*˚　　˚*•̩̩͙✩•̩̩͙*˚＊·̩̩̥͙");
        System.out.println("Average Calculator");
        System.out.println("·̩̩̥͙＊*•̩̩͙✩•̩̩͙*˚　　˚*•̩̩͙✩•̩̩͙*˚＊·̩̩̥͙");
        System.out.println("");
        System.out.println("Enter five grades to find your average:");
        for (int i = 0; i <= 4; i = i + 1) {
        	// Place user input into index
        	grades[i] = keyedInput.nextInt(); 
        }
        
        for (int i = 0; i<= 4; i = i + 1) {
        	// Finds the index of i from grades and adds it
        }
        
        average = total/NUM_OF_MARKS;
        
        System.out.println("");
        System.out.println("·̩̩̥͙＊*•̩̩͙✩•̩̩͙*˚　　˚*•̩̩͙✩•̩̩͙*˚＊·̩̩̥͙");
        // %% Cancels each other out, prints % as Output
        System.out.printf("Your average mark is:" + "%.2f%%",average);
        System.out.println("");
        System.out.println("·̩̩̥͙＊*•̩̩͙✩•̩̩͙*˚　　˚*•̩̩͙✩•̩̩͙*˚＊·̩̩̥͙");
        

	}

}

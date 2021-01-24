package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number");

        int[] numbers = new int[10];

        for (int i = 0 ; i < 10 ; i++) {

            try {
                int number = Integer.parseInt(userInput.nextLine());  // Read user input
                numbers[i] = number;
                System.out.println("Enter another number");

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

}
package org.example; //DO NOT DELETE
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number corresponding to the code you want to run: \nFurther substring Fun - 1\nRun of Integers - 2\nSum of a Range of Sequential Integers - 3\nRepeatedly Echo a Word - 4\nWords Separated by Dots - 5\nAdding up Integers - 6\nShipping Cost Calculator - 7");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Enter a string: ");
            String text = input.nextLine();
            System.out.println("Enter beginning index: ");
            int a = input.nextInt();
            System.out.println("Enter ending index: ");
            int b = input.nextInt();
            System.out.println("Original String: \n" + text);
            System.out.println("Substring: \n" + text.substring(a,b));
        }
        if (choice == 2) {
            System.out.println("Enter Start: ");
            int start = input.nextInt();
            System.out.println("Enter End: ");
            int end = input.nextInt();
            int nextInteger = start;
            do {
                System.out.println(nextInteger);
                nextInteger += 1;
            } while (nextInteger <= end);
        }
        if (choice == 3) {
            System.out.println("Enter low: ");
            int low = input.nextInt();
            System.out.println("Enter high: ");
            int high = input.nextInt();
            int sum = high*(high+1)/2-low*(low+1)/2+low;
            System.out.println("Sum = " + sum);
        }
        if (choice == 4) {
            System.out.println("Enter a word: ");
            String newword = input.nextLine();
            newword = input.nextLine();
            System.out.println("");
            for (int i = 0; i<newword.length(); i++) {
                System.out.println(newword);
            }
        }

        if (choice == 5) {        
            System.out.println("Enter first word: ");
            String firstword = input.nextLine();
            System.out.println("Enter second word: ");
            String secondword = input.nextLine();
            String finalstring = firstword;
            for (int i=0; i<(30-firstword.length()-secondword.length()); i++) {
                finalstring += ".";
            }
            finalstring += secondword;
            System.out.println(finalstring);
        }
        if (choice == 6) {
            System.out.println("How many integers will be added: ");
            int totalints = input.nextInt();
            int totalamt = 0;
            for (int i = 0; i < totalints; i++) {
                System.out.println("Enter an integer: ");
                totalamt += input.nextInt();
            }
            System.out.println("The sum is " + totalamt);
        }
        if (choice == 7) {
            int weight;
            double extra;
            double total;
            do {
            System.out.println("Weight of Order: ");
                weight = input.nextInt();
                if (weight <= 10 & weight !=0){
                    System.out.println("Shipping cost: $3.00");
                }else if (weight > 10){
                    extra = (weight-10.0)/4;
                    total =extra +3;
                    System.out.println("Shipping cost:  $" + total);
                }
            } while (weight >0);
        }
    }
}
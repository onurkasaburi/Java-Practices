package SOLO;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.Scanner;

public class Problem1 {

    public static int findSum(int number1, int number2) {
        int sum = number1+number2;
        for (int i = 0; i >= number1; i++) {
            sum += number1 + number2;
        }
        return sum;
    }
    //Write a program to print the sum of two numbers entered by user by defining your own method.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = scan.nextInt();
        System.out.println("Enter your second number");
        int number2 = scan.nextInt();
        System.out.println("Sum of " + number1 + " + " + number2 + " is => " + findSum(number1,number2));

    }
}

package SOLO;

import java.util.Scanner;

public class Grade {
    public static String gradeLetter(int num) {
        if (num >= 91 && num <= 100) {
            return "AA";
        } else if (num >= 81 && num <= 90) {
            return "AB";
        } else if (num >= 71 && num <= 80) {
            return "BB";
        } else if (num >= 61 && num <= 70) {
            return "BC";
        } else if (num >= 51 && num <= 60) {
            return "CD";
        } else if (num >= 41 && num <= 50) {
            return "DD";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int grade = scan.nextInt();

        System.out.println("Your grade is: " + gradeLetter(grade));
    }
}

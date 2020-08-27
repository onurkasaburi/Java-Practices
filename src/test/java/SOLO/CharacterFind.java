package SOLO;

import java.util.Scanner;

public class CharacterFind {
// find a character from given String

    public static boolean isEven(int number) {
 /*
        if(number % 2 == 0){
            return true;
        }
        return false;

  */
        return (number % 2 == 0);
    }

    public static String findMidOfString(String str) {
        int midLength = str.length() / 2;
        if (isEven(str.length())) {
            return str.substring(midLength - 1, midLength + 1);
        } else {
            return str.substring(midLength, midLength + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your String value");

        String str = scan.nextLine();
        System.out.println("Your input's middle characters are >  " + findMidOfString(str));

    }
}

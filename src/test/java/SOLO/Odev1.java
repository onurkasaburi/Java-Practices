package SOLO;

import java.util.ArrayList;
import java.util.List;

public class Odev1 {
// Displaying Prime numbers between 1 and 100000

    public static int occuranceOfChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> getEvenNumbersInterval(int num) {
        List<Integer> primeNumbers = new ArrayList();
        for (int i = 2; i <= num; i++) {
            if (isEven(i)) {
                primeNumbers.add(i);

            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int num) {
        int counter = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) counter += 1;
        }
        if (counter == 2) {
            return true;
        }
        return false;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void beautifulPrint(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
            if (i % 20 == 0  && i != 0 ) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int number = 220;
        beautifulPrint(getEvenNumbersInterval(number));


    }
}

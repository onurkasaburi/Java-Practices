package SOLO;

import java.util.Scanner;

public class PowerNumber {

    public static int pow(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base number");
        int base = scan.nextInt();
        System.out.println("Enter power of the base: " + base);
        int power = scan.nextInt();

        System.out.println(pow(base, power));
    }
}

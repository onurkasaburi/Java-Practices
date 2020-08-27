package SOLO;

public class Multiply {
    // write a number that multiply with all numbers which come before itself (faktoriyel)

    public static int faktoriyel(int num) {
        int result = 1;
        for (int i = num; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        int number = 6;
        System.out.println(faktoriyel(number));

        //calculate the grade


    }
}

package SOLO;

public class EvenNumbersDisplay {

    // display even numbers

    public static boolean evenNumber(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 100;
        System.out.println(evenNumber(number));

    }
}

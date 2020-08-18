package SOLO;

public class SoruCozumu8 {


    public static void main(String[] args) {
        int number = 150;
        System.out.println(isArmstrong(number));
    }

    private static boolean isArmstrong(int number) {
        int sum = 0;
        String str = String.valueOf(number);
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            sum += Math.pow(digit, 3);
        }
        if (number == sum) {
            return true;
        }
        return false;
    }
}

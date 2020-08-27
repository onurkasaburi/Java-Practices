package PracticeDay3;

public class ReverseExam1 {
// do some reversing practices

    public static String reversing(String str) {

        String a1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            a1 += str.toCharArray()[i];

        }
        return a1;
    }


    public static void main(String[] args) {
    // =>1
        String a = "izmir";
        System.out.println(reversing(a));


    }
}

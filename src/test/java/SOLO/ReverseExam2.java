package SOLO;

public class ReverseExam2 {
// another reversing practice

    public static String reversing2(String str1){
        String b1 = "";
        for(int i = str1.length() - 1; i >= 0; i-- ){
            b1 += str1.toCharArray()[i];
        }
        return b1;
    }

    public static void main(String[] args) {
        String b = "texas";
        System.out.println(reversing2(b));

    }
}

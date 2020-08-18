package SOLO;

public class ReverseExam3 {

    public static String reversing3(String str3){
        String c1 ="";
        for(int i = str3.length()-1; i >= 0; i--){
            c1 += str3.toCharArray()[i];
        }
        return c1;
    }

    public static void main(String[] args) {
        String c = "Dallas";
        System.out.println(reversing3(c));
    }
}

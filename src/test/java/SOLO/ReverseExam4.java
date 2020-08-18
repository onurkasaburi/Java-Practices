package SOLO;

public class ReverseExam4 {

    public static String reversing4(String str4){
        String d1 ="";
        for(int i = str4.length()-1; i >= 0; i--){
            d1 += str4.toCharArray()[i];
        }
        return d1;
    }

    public static void main(String[] args) {
        String d = "benbukaderidegistirecem";
        System.out.println(reversing4(d));
    }
}

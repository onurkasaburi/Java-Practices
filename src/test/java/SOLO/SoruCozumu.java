package SOLO;

public class SoruCozumu {

    public static String reverseString(String str){

        //String [] arr = new String [20]
        String b = "";
        for(int i = str.length()-1;i >= 0; i-- ){
          b += str.charAt(i);
        }
        return b;
    }
    public static void main(String[] args){
        String a = "mucahit";

        System.out.println(reverseString(a));
    }

}

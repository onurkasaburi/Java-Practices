package SOLO;

import java.util.Arrays;
import java.util.Collections;

public class Frequency5 {

    public static String findFrequency(String str5){
        String nonDup5="", result5="";
        for(int i =0; i < str5.length(); i++){
            if(! nonDup5.contains(""+str5.charAt(i) ) ){
                nonDup5 += str5.charAt(i);
            }
        }
        for(int i =0; i < nonDup5.length(); i++){
            int num5 = Collections.frequency(Arrays.asList(str5.split("")), ""+nonDup5.charAt(i));
            result5 += ""+nonDup5.charAt(i)+num5;
        }
        return result5;
    }

    public static void main(String[] args) {
        String frequency5 ="sabrinsonu";
        System.out.println(findFrequency(frequency5));

    }
}

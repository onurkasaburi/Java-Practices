package SOLO;

import java.util.Arrays;
import java.util.Collections;

public class Frequency3 {

    public static String findFrequency3(String str3){
        String nonDup3="", result3="";
        for(int i =0; i < str3.length();i++) {
            if (!nonDup3.contains("" + str3.charAt(i))) {
                nonDup3 += str3.charAt(i);
            }
        }
            for(int i=0; i < nonDup3.length(); i++){
                int num2 = Collections.frequency(Arrays.asList(str3.split("")), ""+nonDup3.charAt(i));
                result3 += ""+nonDup3.charAt(i)+num2;
            }
            return result3;
    }

    public static void main(String[] args) {
        String frequency3 ="benimhalaumudumvar";
        System.out.println(findFrequency3(frequency3));

    }
}

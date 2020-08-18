package SOLO;

import java.util.Arrays;
import java.util.Collections;

public class Frequency4 {

    public static String findFrequency(String str4){
        String nonDup4="", result4="";
        for(int i =0; i < str4.length();i++){
            if(! nonDup4.contains(""+str4.charAt(i) ) ){
                nonDup4 += str4.charAt(i);
            }
        }
        for( int i=0; i < nonDup4.length(); i++){
            int num4 = Collections.frequency(Arrays.asList(str4.split("")), ""+nonDup4.charAt(i) );
            result4 += ""+nonDup4.charAt(i)+num4;
        }
        return result4;
    }

    public static void main(String[] args) {
        String frequency4 = "birgunolacak";
        System.out.println(findFrequency(frequency4));
    }
}

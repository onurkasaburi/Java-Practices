package SOLO;

import java.util.Arrays;
import java.util.Collections;

public class Frequency2 {

    public static String findFrequency2(String stf1){
        String nonDup2= "" , result2= "";
        for(int i =0; i < stf1.length(); i++){
            if(! nonDup2.contains(""+stf1.charAt(i))){
                nonDup2 += stf1.charAt(i);
            }
        }
        for(int i=0; i < nonDup2.length(); i++){
            int num = Collections.frequency(Arrays.asList(stf1.split("")), ""+nonDup2.charAt(i) );
            result2 += ""+nonDup2.charAt(i)+num;
        }
        return result2;

    }

    public static void main(String[] args) {
        String frequency2 = "birderdimvar";
        System.out.println(findFrequency2(frequency2));

    }
}

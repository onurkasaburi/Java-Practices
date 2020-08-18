package SOLO;

import java.util.Arrays;
import java.util.Collections;

public class Frequency1 {
 /*   Write a return method that can find the frequency of characters

    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
  */
/*
    public static String findFrequency(String stf){
        String nonDup = "";
        for(int i = 0; i < stf.length();i++){
            if(!nonDup.contains(""+stf.charAt(i))){
                nonDup += ""+stf.charAt(i);
            }
        }
        String expectedResult = "";
        for (int j = 0; j< nonDup.length(); j++){
            int count = 0;

            for(int i =0; i < stf.length();i++){
                if(stf.charAt(i) == nonDup.charAt(j)){
                    count++;
                }
                expectedResult += nonDup.charAt(j)+""+count;
            }

        }
        return  expectedResult;
    }
*/
 public static String findFrequency(String str) {

     String nonDup="", result="";
     for(int i=0; i < str.length(); i++)
         if(! nonDup.contains(""+str.charAt(i)))
             nonDup += ""+str.charAt(i);

     for(int i=0; i < nonDup.length(); i++) {
         int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );
         result += ""+nonDup.charAt(i) + num;
     }
     return result;
 }

    public static void main(String[] args) {
        String frequency1 = "aaabbcdd";
        System.out.println(findFrequency(frequency1));
    }
}

package SOLO;

public class Function {
    // Soru => write a function that gets 3 parameters
    // such as String , subString, subString
/*
    public static String subStr(String str, int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);


    }

*/


    // second method

    public static String subStr(String str, int beginIndex, int endIndex) {
        String result = "";
        for (int i = beginIndex; i < endIndex; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        String str = "benozledimgalibaseni";
        System.out.println(subStr(str, 1, 8));

    }
}

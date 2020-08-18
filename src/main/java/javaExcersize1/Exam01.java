package javaExcersize1;

public class Exam01 {


    // 1. soru
    public static void swapWithoutTemp(int a, int b) {
        a = a + b; //  toplam 30 oldu
        b = a - b; // b = 10 oldu
        a = a - b; // a = 20 oldu
        System.out.println(a + "  " + b);
    }

    // 2. Soru

    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i <= a.length() - 1; i++) {
            if (!b.contains(Character.toString(a.charAt(i)))) {
                return false;
            }

        }
        return true;

    }

    // 3. Soru

   public static String reverseSentence(String str) {
//for( str.length()-1 )
// for(int i = 5; i > 0; i--){}
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
        reversedStr+= str.charAt(i);
        }
        return reversedStr;

    }


    public static void main(String[] args) {


        //  swapWithoutTemp(10, 20);
//       boolean is_anagram = isAnagram("Onur", "Onun");
//        System.out.println(is_anagram);

        String str = "buyuk galatasaray";
        System.out.println(reverseSentence(str));

    }
}

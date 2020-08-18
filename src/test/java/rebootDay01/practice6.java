package rebootDay01;

public class practice6 {
    // anagram
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        a.toLowerCase().replace(" ", "");
        b.toLowerCase().replace(" ", "");

        if(a.length() != b.length()){
            System.out.println("Not Anagram");
            System.exit(0);
        }
        for(int i =0; i < a.length(); i++){
            b = b.replaceFirst("" + a.charAt(i), " ");
        }
        if(b.isEmpty()){
            System.out.println("Anagram");
        } else{
            System.out.println("NOt anagram");
        }

    }
}

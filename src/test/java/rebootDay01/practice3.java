package rebootDay01;

public class practice3 {
    public static void main(String[] args) {
        String st = "abcdcba";
        boolean check = true;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != st.charAt(st.length() - 1 - i)) {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Polindrome" : "not polindrome");
    }
}

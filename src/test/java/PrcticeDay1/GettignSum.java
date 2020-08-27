package PrcticeDay1;

public class GettignSum {
    //  getting sum
    public static void main(String[] args) {
        String str = "qwer12qwe34qwe1qw23";
        int sum = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
                if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                    sum += Integer.parseInt(num);
                    num = "";

                }
            }
        }
        System.out.println(sum);
    }
}

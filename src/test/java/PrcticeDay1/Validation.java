package PrcticeDay1;

public class Validation {
    // password valid
    public static void main(String[] args) {
        String password = "October22@";  // we can change it and see if it is valid or not
        boolean length = password.length() >= 8;
        boolean lover = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z]*.");
        boolean number = password.matches(".*[0-9]*.");
        boolean special = password.matches(".*[!@#$%].*");

        boolean valid = length && lover && upper && number && special;
        if(valid){
            System.out.println("valid password");
        } else{
            System.out.println("invalid password");
        }
    }
}

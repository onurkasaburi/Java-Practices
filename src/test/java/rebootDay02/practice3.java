package rebootDay02;

import static com.google.common.math.IntMath.isPrime;

public class practice3 {
    // prime number
    public static void main(String[] args) {
        PrintAllTo(100);
    }

    public static void PrintAllTo(int num){
        for(int i=2; i <= num; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number){
        for(int i=2; i < number; i++){
            if(number % i == 0) return false;
        }
        return  true;
    }

}

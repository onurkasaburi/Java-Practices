package rebootDay03_OOP;

public class Fibonacci {
    // fibonacci numbers


    public static void main(String[] args) {
        Fibonacci(15);
    }




    public static void Fibonacci(int num){
        int a=0;
        int b=1;
        System.out.print(a + " " + b);
        for (int i=2; i < num; i++){
            System.out.print(" " + b);
            int next = a + b;
            a = b;
            b = next;
            System.out.print(" " + next);
        }
    }
}

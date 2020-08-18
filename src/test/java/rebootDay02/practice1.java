package rebootDay02;

public class practice1 {
// constructors

    public static void main(String[] args) {
        new practice1(7,4);
    }
    public practice1(){
        System.out.println("no param");
    }
    public  practice1(int a){
        System.out.println(a);
    }
    public practice1(int a, int b){
        this(a);
        System.out.println(b);
    }
}

package PracticeDay2;

public class Constructors {
// constructors

    public static void main(String[] args) {
        new Constructors(7,4);
    }
    public Constructors(){
        System.out.println("no param");
    }
    public Constructors(int a){
        System.out.println(a);
    }
    public Constructors(int a, int b){
        this(a);
        System.out.println(b);
    }
}

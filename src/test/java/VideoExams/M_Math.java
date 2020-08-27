package VideoExams;

public class M_Math {

    public static void main(String[] args) {
        // int result = Math.round(5.1F); rounding the number
        //   int result = (int)Math.ceil(1.1F); // ceiling the number
        // int result = (int)Math.floor(1.1F); // largest or smallest int value
        //  int result = (int)Math.max(1,5);// returns max number
        //int result = (int)Math.round(Math.random() * 100); // gives randomly number if you don't want decimals use round
        int result = (int) (Math.random() * 100); // it's even possible with this example without rounding
        System.out.println(result);
    }
}

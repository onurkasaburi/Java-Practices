package VideoExams;

import java.text.NumberFormat;

public class Formatting {

    public static void main(String[] args) {
        //   NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(1234568989); // displaying number as a currency
        //System.out.println(result);


        String result = NumberFormat.getPercentInstance().format(0.1); //chaining multiple methods together
        System.out.println(result);
    }
}

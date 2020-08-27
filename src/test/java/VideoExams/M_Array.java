package VideoExams;

import java.util.Arrays;

public class M_Array {

    public static void main(String[] args) {

        //   int[] numbers = {2, 3, 5, 6, 8};
        //  System.out.println(numbers.length); //Array icinde kac tane deger varsa onu gosterir
        //   Arrays.sort(numbers); // ==> Array icindeki degerleri kucukten buyuge siralar BU GIBI ISLEMLERE OVERLOADING DENIR
        // System.out.println(Arrays.toString(numbers)); // Array icindeki degerleri siralar

        // *** MULTI DIMENSIONAL ARRAYS
        int[][] numbers = new int[2][3]; // 2 rows 3 dimensions
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers)); // bu sayede iki array grubunu da String olarak yazdirmis oldu

    }
}

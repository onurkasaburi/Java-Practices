package SOLO;

import java.util.ArrayList;
import java.util.List;

public class SoruCozumu7 {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    // leap years > if a year days divided by 4  and do not divided by 100 then it's a leap year

    public static List<Integer> leapYears(int startYear, int endYear) {
        ArrayList loopYears = new ArrayList<Integer>();
        for (int i = startYear; i <= endYear; i++) {
            if (isLeapYear(i)) {
                loopYears.add(i);
            }
        }
        return loopYears;
    }

    public static void main(String[] args) {
        int startYear = 1900;
        int endYear = 2100;
        System.out.println(leapYears(startYear, endYear));


    }
}

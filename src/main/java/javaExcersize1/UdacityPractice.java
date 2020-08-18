package javaExcersize1;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.w3c.dom.ls.LSOutput;

public class UdacityPractice {
    public static void main(String[] args) {
        int ticketPrice = 10;
        int age = 61;
        boolean isStudent = true;

        if (age <= 15 || age > 60 || isStudent) {
            ticketPrice = 5;
        }
    }
}

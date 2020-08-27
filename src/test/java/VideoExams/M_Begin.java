package VideoExams;

import java.awt.*;
import java.util.Date;

public class M_Begin {
    public static void main(String[] args) {
        /*
        byte myAge = 30;
        Date now = new Date();
        System.out.println(now);
*/
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}

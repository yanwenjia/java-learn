package date;

import java.text.ParseException;
import java.util.Date;

public class demo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String s1 = DateUtil.dateToString(date,"yyyy-MM-dd HH:mm:ss");
        System.out.println(s1);
        String s2 = DateUtil.dateToString(date,"HH:mm:ss");
        System.out.println(s2);

        String dateStr = "2020-10-10 10:10:10";
        Date d = DateUtil.stringToDate(dateStr,"yyyy-MM-dd HH:mm:ss");
        System.out.println(d);
    }
}

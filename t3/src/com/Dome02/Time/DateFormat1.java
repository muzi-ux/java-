package com.Dome02.Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat1 {

    public static void main(String[] args) throws ParseException {
        Date date = new Date(30000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年mm月dd日 HH:MM:SS");
        String f = simpleDateFormat.format(date);
        System.out.println(f);

        String str = "2020年12月07日 10:57:11";
        Date p1 = simpleDateFormat.parse(str);
        System.out.println(p1);
    }
}

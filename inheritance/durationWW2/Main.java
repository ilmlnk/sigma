package com.company.lesson8.ww2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        Date dateS = format.parse("01-09-1939");
        Date dateE = format.parse("02-09-1945");

        long delt = dateE.getTime() - dateS.getTime();

        String result = String.format("%d день", delt / 86400000);

        System.out.println(result);
    }
}

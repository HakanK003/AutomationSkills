package com.hk.tests1_TestNG.extra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateFormat {

    public static void main(String[] args) {


        SimpleDateFormat formatter= new SimpleDateFormat("hh:mm aa");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date).toLowerCase());

//
//        SimpleDateFormat formatter2= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
//        Date date2 = new Date(System.currentTimeMillis());
//        System.out.println(formatter.format(date2));
//

    }


}

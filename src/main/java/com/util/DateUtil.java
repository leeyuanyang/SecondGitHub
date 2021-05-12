package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class DateUtil {
    private static SimpleDateFormat sdf;
    static{
        ResourceBundle rb = ResourceBundle.getBundle("util.config.date.dateFormat");
        sdf = new SimpleDateFormat(rb.getString("pattern"));
    }

    public static String toString(Date date){
        return sdf.format(date);
    }
}

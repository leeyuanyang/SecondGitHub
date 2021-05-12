package com.util;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class DateUtilTest {

    @Test
    public void testToString(){
        System.out.println("当前时间：" + DateUtil.toString(new Date()));
    }

}

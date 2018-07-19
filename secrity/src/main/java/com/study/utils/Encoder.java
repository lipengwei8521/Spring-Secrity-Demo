package com.study.utils;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Created by  lpw'ASUS on 2018/7/17.
 */
public class Encoder {

    public static void main(String[] args) {
        String p = "123456";//$2a$10$HKfqGNjiGJJDrNpDRK7a2O0mll6PHizxadx98qt2BWH484ilpTfaa


        String ep = BCrypt.hashpw(p,BCrypt.gensalt());

        System.out.println("======="+ep);


        boolean psw = BCrypt.checkpw(p,"$2a$10$HKfqGNjiGJJDrNpDRK7a2O0mll6PHizxadx98qt2BWH484ilpTfaa");

        System.out.print("---------"+psw);
    }
}

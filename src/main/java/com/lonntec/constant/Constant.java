package com.lonntec.constant;

import java.util.Random;

public class Constant {
    public static String getUID(){
        StringBuilder sb=new StringBuilder();
        Random random=new Random();
        for(int i=0;i<4;i++){
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

}

package com.ysp.util;

public class StringUtil {
    public static boolean isEmptyOrNull(String s){
        if("".equals(s) || null==s){
            return false;
        }else {
            return true;
        }
    }
}

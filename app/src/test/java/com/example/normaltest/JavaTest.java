/**
 * Author: o_qiuyw
 * Date: 2022/3/29 10:07
 * Description:
 */
package com.example.normaltest;

import org.junit.Test;

public class JavaTest {
    public static void main(String[]args){
        String a = new String("xx");
        String b = new String("xx");
        String c = "xx";
        String d = "xx";
        String e = c+"x";
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = builder.append("oooo");
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(d==e);
        System.out.println(builder==builder1);
    }
}

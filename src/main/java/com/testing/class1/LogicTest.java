package com.testing.class1;

public class LogicTest {
    public static void main(String[] args) {
        int x=5;
        int y=15;
        int z=30;
       // boolean a=(x=10)>10;
       // System.out.println(a);
       // System.out.println(x);
        boolean a=(x=10)>10&&(y=30)>30;
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
    }
}

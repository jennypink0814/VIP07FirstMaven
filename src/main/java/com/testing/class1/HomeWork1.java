package com.testing.class1;

public class HomeWork1 {
    public static void main(String[] args) {
        int x=4;
        /*System.out.println(x>5&&x<<8-7>20||!(x++<15));
        System.out.println(x);
        x=9;
        System.out.println(x>5&&x<<8-7>20||!(x++<15));
        System.out.println(x);
        x=11;
        System.out.println(x>5&&x<<8-7>20||!(x++<15));
        System.out.println(x);*/
        x=4;
        //false
        System.out.println(x>5||x<<8-7>20&&!(x++<15));
        //4
        System.out.println(x);
        x=9;
        //false
        System.out.println(x>5||x<<8-7>20&&!(x++<15));
        //10
        System.out.println(x);
        x=11;
        //false
        System.out.println(x>5||x<<8-7>20&&!(x++<15));
        //12
        System.out.println(x);
    }
}

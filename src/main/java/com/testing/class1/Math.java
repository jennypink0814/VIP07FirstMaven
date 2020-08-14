package com.testing.class1;

public class Math {
    public static void main(String[] args) {
        byte ba=39;
        int a=3;
        int b=7;
        long l=21l;
        float f=9.5f;
        double d=18.3;
        long lresult=l/a;
        byte result1=(byte)(ba/a);
        int iresult=ba/a;
        float result2=(float)(f*d);
        float result3=b*f;
        float result=result1+result2+result3;
        System.out.println(ba/a);
        System.out.println(f*d);
        System.out.println(result1);
        System.out.println(result);
    }
}

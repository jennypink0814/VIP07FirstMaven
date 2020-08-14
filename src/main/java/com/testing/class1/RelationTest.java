package com.testing.class1;

public class RelationTest {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        boolean ab=a==b;
        System.out.println(a==b);
        System.out.println(a==3);

        String sa="roy";
        String sb="roy";
        String sc=new String("roy");
        System.out.println(sa==sb);
        System.out.println(sa==sc);
        System.out.println(sa.equals(sb));
        System.out.println(sa.equals(sc));
    }
}

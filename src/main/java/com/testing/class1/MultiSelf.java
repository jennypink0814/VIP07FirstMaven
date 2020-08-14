package com.testing.class1;

public class MultiSelf {
    public static void main(String[] args) {
        int x=1;
        int z=++x+ ++x+ ++x;
        System.out.println(z);
        System.out.println(x);
        int y=x++ + x++ + x++;
        System.out.println(y);
        System.out.println(x);
    }
}

package com.testing.class1;

public class SelfAdd {
    public static void main(String[] args) {
        int a=3,b=15;
        //a++;
        System.out.println("后自增过程中的："+ a++);
        System.out.println("后自增的结果："+ a++);
       // ++a;
       // System.out.println("前自增的结果："+ a);
      //  b--;
       // System.out.println("后自减的结果："+b);
       // --b;
        System.out.println("前自减过程中的："+ --b);
        System.out.println("前自减的结果："+ b);
    }
}

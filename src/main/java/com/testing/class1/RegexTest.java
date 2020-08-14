package com.testing.class1;

public class RegexTest {
    public static void main(String[] args) {
        String s="[1,2,3,5,4,6,9,7,8,0]";
//        s=s.replace("1","X");
//        System.out.println(s);
//        s=s.replace("2","X");
//        System.out.println(s);
//        for(int i=1;i<6;i++){
//            s=s.replace(i+"","X");
//        }
//        System.out.println(s);
        String regex="[1-5]";
        String all=s.replaceAll(regex,"X");
        System.out.println(all);
        String first=s.replaceFirst(regex,"X");
        System.out.println(first);

    }

}

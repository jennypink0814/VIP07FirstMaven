package com.testing.class1;

import java.util.Scanner;

public class PhoneRegex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="";
        String phone="1[3-9][0-9]{9}";
        for(int i=0;i<10;i++){
            System.out.println("请输入11位的数字：");
            s=sc.nextLine();
            if(s.matches(phone)){
                System.out.println(s+"是一个手机号");
            }
            else {
                System.out.println(s+"不是一个手机号");
            }
        }

    }
}

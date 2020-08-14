package com.testing.class1;

public class UseMobilePhone {
    public static void main(String[] args) {
        MobilePhone huawei;
        int a;
        huawei=new MobilePhone();
        a=1;
        huawei.call();
        String res=huawei.resolution;
        System.out.println(huawei.resolution);
        System.out.println(huawei.takePhoto());
        
    }
}

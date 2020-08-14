package com.testing.class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework5 {
    public static void main(String[] args) {
        Integer []a={1,2,3,5,4,6,9,7,8,0};
        List<Integer> list=new ArrayList<>();
        //数组转换成list
        for(Integer i:a){
            list.add(i);
        }
        System.out.println("数组的值赋给list：");
        System.out.println(list);
        //list转换成数组
        Integer[] result=new Integer[list.size()];
        result= (Integer[]) list.toArray();
        System.out.println("用list.toArray()转换后的数组为：");
        for(int i:result){
            System.out.print(i+"");
        }

    }
}

package com.testing.class1;

public class MobilePhone {
    public String produce;
    public String brand="华为";
    public int weight=300;
    public String size="5.3英寸";
    public String resolution="900*1600";
    public void call(){
        System.out.println("用手机打电话");
    }
    public int queryBattery(int useTime){
        if(useTime<30) {
            return 90;
        }
        else if(useTime<60){
            return 80;
        }else if(useTime<120){
            return 50;
        }else {
            return 10;
        }

    }
    public String takePhoto(){
        return "美颜的照片";
    }
}

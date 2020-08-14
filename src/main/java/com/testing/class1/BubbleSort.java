package com.testing.class1;

public class BubbleSort {
    public static void main(String[] args) {
        int []input={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int []result=bubbleSort(input);
        for(int i:result){
            System.out.println(i);
        }
    }
    public static int[] bubbleSort(int[]a){
        for(int lun=1;lun<=a.length-1;lun++)
            for(int index=0;index<=a.length-1-lun;index++){
                    if(a[index]>a[index+1]){
                        int tmp=a[index];
                        a[index]=a[index+1];
                        a[index+1]=tmp;
                    }
            }
        return a;
    }
}



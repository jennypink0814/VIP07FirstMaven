package com.testing.class1;

public class SelectionSort {
    public static void main(String[] args) {
        int []input={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int []result=selectionSort(input);
        for(int i:result){
            System.out.println(i);
        }
    }

    public static int[] selectionSort(int[]a) {
        for (int lun = 1; lun <= a.length - 1; lun++) {
            int min = a[lun - 1];
            int mini = lun - 1;
            for (int index=lun;index<=a.length-1;index++){
                if(min>a[index]){
                    min=a[index];
                    mini=index;
                }

            }
            if(min!=a[lun-1]){
                a[mini]=a[lun-1];
                a[lun-1]=min;
            }

        }
        return a;
    }
}

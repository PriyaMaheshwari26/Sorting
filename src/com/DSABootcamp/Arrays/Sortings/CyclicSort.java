package com.DSABootcamp.Arrays.Sortings;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        cyclicSort(arr);
        /*for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }*/
        System.out.println(Arrays.toString(arr));

    }

     static void cyclicSort(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else i++;
        }

    }

     static void swap(int[] arr, int i, int correctIndex) {
         int temp=arr[correctIndex];
         arr[correctIndex]=arr[i];
         arr[i]=temp;
    }

}

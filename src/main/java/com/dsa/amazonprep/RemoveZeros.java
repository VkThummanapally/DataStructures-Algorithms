package com.dsa.amazonprep;

import java.util.Arrays;

public class RemoveZeros {
    public static void main(String args[]){
        int[] arr = {1,4,5,5,6,7,8,8,8,9};
        int i=0;
        for(int j=0; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(i+1);
    }
}

package com.dsa.sdesheet;

import java.util.Arrays;

public class SortZerosOnesTwos {
    public static void main(String args[]){
        int[] arr = {1,0,1,2,0,1,2,0,0,1,1,0,1,2,2};
        sortZerosOnesTwos(arr);
    }

    static void sortZerosOnesTwos(int[] inputArray){
        int left = 0;
        int mid = 0;
        int right = inputArray.length-1;
        int temp = 0;
        while(mid <= right){
            switch (inputArray[mid]){
                case 0:
                    temp = inputArray[left];
                    inputArray[left] = inputArray[mid];
                    inputArray[mid] = temp;
                    left++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = inputArray[mid];
                    inputArray[mid] = inputArray[right];
                    inputArray[right] = temp;
                    right--;
                    break;
            }
        }
        Arrays.stream(inputArray).forEach(System.out::println);
    }
}

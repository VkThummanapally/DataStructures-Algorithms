package com.java.dsa.search;

public class BinarySearch {
    public static void main(String args[]){
        int[] arr = {1,2,6,7,9,10,12,19,20};
        int key = 12; /*index: 6*/
        System.out.println(binarySearch(arr, key));
    }

    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + (high-low)/2);
            if(arr[mid] == key) return mid;
            else if(arr[mid] > key) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }

}

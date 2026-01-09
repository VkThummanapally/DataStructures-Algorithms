package com.dsa.amazonprep;

public class MaxProductSubArray {
    public static void main(String args[]){
        int arr[] = {2,3,-2,4};
        int maxProduct = arr[0];
        int leftProduct=0, rightProduct=0;
        for(int i=0; i<arr.length; i++){
            leftProduct = (leftProduct == 0 ? 1 : leftProduct) * arr[i];
            rightProduct = (rightProduct == 0 ? 1: rightProduct) * arr[arr.length-i-1];
            maxProduct = Math.max(maxProduct, Math.max(leftProduct, rightProduct));
        }
        System.out.println(maxProduct);
    }
}

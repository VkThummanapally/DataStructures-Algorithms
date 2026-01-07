package com.dsa.amazonprep;

public class MissingNumber {
    public static void main(String args[]){
        int[] nums = {3,1,0};
        int xor = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            xor ^= nums[i];
        }
        for(int i=1; i<=n; i++)
            xor ^= i;
        System.out.println("Missing Number: "+xor);
    }
}

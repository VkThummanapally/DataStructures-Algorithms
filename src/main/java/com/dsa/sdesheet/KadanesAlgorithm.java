package com.dsa.sdesheet;

public class KadanesAlgorithm {
    public static void main(String args[]){
        int[] nums = {5,4,-1,7,8};
        int maxSum = nums[0];
        int curSum = nums[0];
        for(int i=1; i<nums.length; i++){
            curSum = Math.max(nums[i], curSum + nums[i]);
            maxSum = Math.max(curSum, maxSum);
        }
        System.out.println(maxSum);
    }
}

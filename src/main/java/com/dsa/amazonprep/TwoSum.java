package com.dsa.amazonprep;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]){
        int[] arr = {2,7,11,15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int firstNum = target - arr[i];
            if (map.containsKey(firstNum)) {
                System.out.println("Pair of indices that equals target are: " + Arrays.toString(new int[]{map.get(firstNum), i}));
                break;
            }
            map.put(arr[i], i);
        }
    }
}

package com.dsa.sdesheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    public static void main(String args[]){
        int[][] intervals = {{1,3}, {2,6}, {8,10},{15,18}};
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        for(int[] interval: intervals){
            if(merged.isEmpty() || merged.get(merged.size()-1)[1] < interval[0])
                merged.add(interval);
            else
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1], interval[1]);
        }
        String result = Arrays.deepToString(merged.toArray(new int[merged.size()][]));
        System.out.println(result);
    }
}

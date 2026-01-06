package com.dsa.sdesheet;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String args[]){
        int numRows = 5;
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) row.add(1);
                else{
                    int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }

        triangle.stream().forEach(list -> {
            list.stream().forEach(System.out::print);
            System.out.println();
        });
    }
}

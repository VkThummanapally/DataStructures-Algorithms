package com.dsa.sdesheet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateMatrix {

    public static void main(String args[]){
        int[][] mat = {{5,1,9,11},{2,4,8,10}, {13,3,6,7}, {15, 14, 12, 16}};
        rotateMatrix(mat);
    }

    static void rotateMatrix(int[][] mat){
        // transpose matrix
        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //reverse each row
        for(int i=0; i<mat.length; i++){
            mat[i] = reverseRow(mat[i]);
        }
        Arrays.stream(mat).forEach(row -> System.out.println(Arrays.toString(row)));
    }

    static int[] reverseRow(int[] row){
        int low = 0;
        int high = row.length-1;
        while(low < high){
            int temp = row[low];
            row[low] = row[high];
            row[high] = temp;
            low++;
            high--;
        }
        return row;
    }
}

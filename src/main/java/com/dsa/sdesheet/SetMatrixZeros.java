package com.dsa.sdesheet;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeros {
    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        //check first-row has any zero
        for(int i=0; i<cols; i++) if(matrix[0][i] == 0) firstRow = true;
        //check first-col has any zero
        for(int i=0; i<rows; i++) if(matrix[i][0] == 0) firstCol = true;

        //check the rest of matrix for any zeros and update first-row and first-col with zeros
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //now update the rows and col with zeros based on previous zeros set in first-row and first-col
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }

        if(firstRow) for(int i=0; i<cols; i++) matrix[0][i] = 0;
        if(firstCol) for(int i=0; i<rows; i++) matrix[i][0] = 0;

        Arrays.stream(matrix).flatMapToInt(Arrays::stream).forEach(val -> System.out.print(val+ "  "));
        }
}

package com.java.dsa.search;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 9, 5, 6, 0, 4, 8};
        int key = 5;
        System.out.println(linearSearch(arr, key));
    }

    public static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
}
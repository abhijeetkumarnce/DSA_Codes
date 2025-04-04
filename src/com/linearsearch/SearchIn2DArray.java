package com.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 32, 46},
                {1, 6, 54, 45, 76},
                {43, 4, 87}
        };
        int target = 76;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] subArr : arr) {
            for (int element : subArr) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

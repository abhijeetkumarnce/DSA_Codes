package com.linearsearch;

public class Example {
    public static void main(String[] args) {
        int[] arr = {23, 43, 12, 2, 6, 22, 56, 7};
        int target = 22;
        int ans1 = linearSearch1(arr, target);
        int ans2 = linearSearch2(arr, target);
        boolean ans3 = linearSearch3(arr, target);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static int linearSearch1(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for(int element : arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
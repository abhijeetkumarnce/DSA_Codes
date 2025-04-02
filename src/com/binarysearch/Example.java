package com.binarysearch;

public class Example {
    public static void main(String[] args) {
        int[] arr = {-25, -13,-5, 2, 4, 6, 8, 13, 24, 33, 47, 51, 63};
        int target = 33;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

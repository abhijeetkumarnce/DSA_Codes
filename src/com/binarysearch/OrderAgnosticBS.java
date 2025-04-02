package com.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-25, -13,-5, 2, 4, 6, 8, 13, 24, 33, 47, 51, 63};
        int[] arr1 = {98, 87, 76, 63, 53, 42, 33, 28, 10, 5};
        int target = 33;
        int ans = orderAgnosticBS(arr1, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

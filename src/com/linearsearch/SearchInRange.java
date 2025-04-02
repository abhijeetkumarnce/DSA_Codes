package com.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 35, 12, 45, 54, 21, 5, 7};
        int target = 54;
        int ans = search(arr, target, 2, 7);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

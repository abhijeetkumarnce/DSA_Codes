package com.binarysearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = pivotElement(nums) + 1;
        System.out.println(ans);
    }

    static int pivotElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if(nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

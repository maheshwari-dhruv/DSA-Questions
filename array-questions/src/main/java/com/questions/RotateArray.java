package com.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhruv Maheshwari
 * @version $Id: RotateArray.java, v 0.1 2023-03-09 05:00 PM Dhruv Maheshwari Exp $$
 * Question - 189
 */
public class RotateArray {

    static int[] newRotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle case when k > n

        // reverse the entire array
        reverse(nums, 0, n - 1);

        // reverse the first k elements
        reverse(nums, 0, k - 1);

        // reverse the remaining elements
        reverse(nums, k, n - 1);

        return nums;
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

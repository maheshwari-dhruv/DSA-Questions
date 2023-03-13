package com.questions;

/**
 * @author Dhruv Maheshwari
 * @version $Id: KthMissingPositiveNumber.java, v 0.1 2023-03-08 10:53 AM Dhruv Maheshwari Exp $$
 * Question Number - 1539
 */
public class KthMissingPositiveNumber {
    static int findKthPositive(int[] arr, int k) {
        int last = arr[arr.length - 1];
        boolean[] present = new boolean[last];

        for (int i = 0; i < arr.length; i++) {
            present[arr[i]-1] = true;
        }

        int count = 0;
        for (int i = 0; i < last; i++) {
            if (!present[i]) {
                count++;
                if (count == k) {
                    return i+1;
                }
            }
        }

        return last + (k - count);
    }
}

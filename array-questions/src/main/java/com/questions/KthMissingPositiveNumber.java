package com.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kaustubh Dongare
 * @version $Id: KthMissingPositiveNumber.java, v 0.1 2023-03-08 10:53 AM Kaustubh Dongare Exp $$
 * Question Number - 1539
 */
public class KthMissingPositiveNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        int[] arr2 = {1, 2, 3, 4};
        int k2 = 2;

        int[] arr3 = {5, 6, 7, 8, 9};
        int k3 = 9;

        int result = findKthPositive(arr3, k3);
        System.out.println(result);
    }

    private static int findKthPositive(int[] arr, int k) {
        List<Integer> tmp = new ArrayList<>();
        List<Integer> newArr = new ArrayList<>();
        int last = arr[arr.length - 1];

        for (int i = 1; i <= last; i++) {
            if (i <= arr.length) {
                newArr.add(arr[i - 1]);
            }

            if (!(newArr.contains(i))) {
                tmp.add(i);
            }
        }

        while (tmp.size() < k) {
            tmp.add(last + 1);
            last++;
        }

        return tmp.get(k - 1);

//        int last = arr[arr.length - 1];
//        boolean[] present = new boolean[last];
//
//        for (int i = 0; i < arr.length; i++) {
//            present[arr[i]-1] = true;
//        }
//
//        int count = 0;
//        for (int i = 0; i < last; i++) {
//            if (!present[i]) {
//                count++;
//                if (count == k) {
//                    return i+1;
//                }
//            }
//        }
//
//        return last + (k - count);
    }
}

package com.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.SimpleFormatter;

/**
 * @author Kaustubh Dongare
 * @version $Id: RotateArray.java, v 0.1 2023-03-09 05:00 PM Kaustubh Dongare Exp $$
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int count = 0;
        List<Integer> newArr = new ArrayList<>();

        for (int i: nums) {
            newArr.add(i);
        }

        while (count != k) {
            newArr.add(0, newArr.get(newArr.size() - 1));
            newArr.remove(newArr.size() - 1);
            count++;
        }

        for (int i = 0; i < newArr.size(); i++) {
            nums[i] = newArr.get(i);
        }

        for (int i: nums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);
    }
}

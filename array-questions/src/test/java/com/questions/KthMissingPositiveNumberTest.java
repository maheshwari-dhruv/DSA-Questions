package com.questions;

import org.junit.Test;

import static com.questions.KthMissingPositiveNumber.findKthPositive;
import static org.junit.Assert.assertEquals;

/**
 * @author Dhruv Maheshwari
 * @version $Id: KthMissingPositiveNumber.java, v 0.1 2023-03-13 10:24 AM Dhruv Maheshwari Exp $$
 * Question Number - 1539
 */
public class KthMissingPositiveNumberTest {

    @Test
    public void testKthKthMissingPositiveNumber() {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        int result = findKthPositive(arr, k);
        assertEquals(9, result);

        int[] arr2 = {1, 2, 3, 4};
        int k2 = 2;

        int result2 = findKthPositive(arr2, k2);
        assertEquals(6, result2);

        int[] arr3 = {5, 6, 7, 8, 9};
        int k3 = 9;

        int result3 = findKthPositive(arr3, k3);
        assertEquals(14, result3);
    }
}

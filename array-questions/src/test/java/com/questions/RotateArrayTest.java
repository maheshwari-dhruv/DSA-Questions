package com.questions;

import org.junit.Test;

import static com.questions.RotateArray.newRotate;
import static org.junit.Assert.assertEquals;

/**
 * @author Dhruv Maheshwari
 * @version $Id: RotateArray.java, v 0.1 2023-03-13 10:32 AM Dhruv Maheshwari Exp $$
 * Question - 189
 */
public class RotateArrayTest {

    @Test
    public void testRotateArray() {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        int[] actualResult = newRotate(nums, k);
        int[] expectedResult = {5,6,7,1,2,3,4};

        assertEquals(expectedResult[0], actualResult[0]);

        int[] nums2 = {1,2,3,4};
        int k2 = 1;

        int[] actualResult2 = newRotate(nums2, k2);
        int[] expectedResult2 = {4,1,2,3};

        assertEquals(expectedResult2[0], actualResult2[0]);

        int[] nums3 = {1};
        int k3 = 1;

        int[] actualResult3 = newRotate(nums3, k3);
        int[] expectedResult3 = {1};

        assertEquals(expectedResult3[0], actualResult3[0]);
    }
}

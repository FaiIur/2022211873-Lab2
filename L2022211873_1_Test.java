package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class L2022211873_1_Test {
    @Test
    public void testSmallestStringWithSwapsCase1() {
        Solution7 solution = new Solution7();
        assertEquals("bacd",
                solution.smallestStringWithSwaps("dcab", Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2))));
    }

    @Test
    public void testSmallestStringWithSwapsCase2() {
        Solution7 solution = new Solution7();
        assertEquals("abcd", solution.smallestStringWithSwaps("dcab",
                Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2))));
    }

    @Test
    public void testSmallestStringWithSwapsCase3() {
        Solution7 solution = new Solution7();
        assertEquals("abc",
                solution.smallestStringWithSwaps("cba", Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2))));
    }

}

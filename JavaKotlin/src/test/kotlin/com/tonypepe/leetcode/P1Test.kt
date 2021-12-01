package com.tonypepe.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test


internal class P1Test {

    @Test
    fun twoSum() {
        val p1 = P1()
        assertArrayEquals(intArrayOf(0, 1), p1.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }
}
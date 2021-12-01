package com.tonypepe.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test


internal class P167Test {

    @Test
    fun twoSum() {
        val p167 = P167()
        assertArrayEquals(intArrayOf(1, 2), p167.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }
}
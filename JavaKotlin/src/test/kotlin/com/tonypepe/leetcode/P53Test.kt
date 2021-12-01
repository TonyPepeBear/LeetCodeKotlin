package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class P53Test {
    @Test
    fun maxSubArrayTest() {
        val p53 = P53()
        assertEquals(6, p53.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(16, p53.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, 6, 4)))
    }
}

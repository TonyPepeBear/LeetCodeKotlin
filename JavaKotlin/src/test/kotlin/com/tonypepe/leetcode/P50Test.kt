package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

internal class P50Test {

    @Test
    fun myPow() {
        val p50 = P50()
        assertEquals(1024.0, (p50.myPow(2.0, 10)), 0.00001)
        assertEquals(9.261, p50.myPow(2.1, 3), 0.00001)
        assertEquals(0.25, p50.myPow(2.0, -2), 0.00001)
    }
}
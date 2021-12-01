package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

internal class P372Test {

    @Test
    fun superPow() {
        val p372 = P372()
        assertEquals(8, p372.superPow(2, intArrayOf(3)))
        assertEquals(1024, p372.superPow(2, intArrayOf(1, 0)))
    }
}
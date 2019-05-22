package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class P35Test {

    @Test
    fun searchInsertTEst() {
        val p35 = P35()
        assertEquals(2, p35.searchInsert(intArrayOf(1, 3, 5, 6), 5))
        assertEquals(1, p35.searchInsert(intArrayOf(1, 3, 5, 6), 2))
        assertEquals(4, p35.searchInsert(intArrayOf(1, 3, 5, 6), 7))
        assertEquals(0, p35.searchInsert(intArrayOf(1, 3, 5, 6), 0))
        assertEquals(1, p35.searchInsert(intArrayOf(1, 3), 2))
    }
}

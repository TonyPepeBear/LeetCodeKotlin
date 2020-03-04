package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class P704Test {
    @Test
    fun search() {
        val p704 = P704()
        assertEquals(4, p704.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
        assertEquals(-1, p704.search(intArrayOf(-1, 0, 3, 5, 9, 12), 1))
        assertEquals(1, p704.search(intArrayOf(-1, 0, 3, 5, 9, 12), 0))
        assertEquals(2, p704.search(intArrayOf(-1, 0, 3, 5, 9, 12), 3))
        assertEquals(-1, p704.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
    }
}
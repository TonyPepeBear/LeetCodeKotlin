package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class P485Test {

    @Test
    fun findMaxConsecutiveOnes() {
        val p485 = P485()
        assertEquals(p485.findMaxConsecutiveOnes(intArrayOf(1, 0, 1, 1, 0, 1)), 2)
        assertEquals(p485.findMaxConsecutiveOnes(intArrayOf(1, 0, 1, 1, 1, 1)), 4)
        assertEquals(p485.findMaxConsecutiveOnes(intArrayOf(1, 0, 0, 0, 1, 1)), 2)
    }
}
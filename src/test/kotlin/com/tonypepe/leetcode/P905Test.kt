package com.tonypepe.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test

internal class P905Test {

    @Test
    fun sortArrayByParity() {
        val p905 = P905()
        assertArrayEquals(intArrayOf(2, 4, 3, 1), p905.sortArrayByParity(intArrayOf(3, 1, 2, 4)))
    }
}
package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

internal class P771Test {

    @Test
    fun numJewelsInStones() {
        val p771 = P771()
        assertEquals(p771.numJewelsInStones("aA", "aAAbbbb"), 3)
        assertEquals(p771.numJewelsInStones("z", "XX"), 0)

    }
}
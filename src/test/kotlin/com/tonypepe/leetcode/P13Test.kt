package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

internal class P13Test {
    @Test
    fun intToRoman() {
        val p13 = P13()
        assertEquals(3, p13.romanToInt("III"))
        assertEquals(4, p13.romanToInt("IV"))
        assertEquals(9, p13.romanToInt("IX"))
        assertEquals(58, p13.romanToInt("LVIII"))
        assertEquals(1994, p13.romanToInt("MCMXCIV"))
    }
}

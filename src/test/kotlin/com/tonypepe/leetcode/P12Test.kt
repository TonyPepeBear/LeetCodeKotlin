package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test


internal class P12Test {

    @Test
    fun intToRoman() {
        val p12 = P12()
        assertEquals("III", p12.intToRoman(3))
        assertEquals("IV", p12.intToRoman(4))
        assertEquals("IX", p12.intToRoman(9))
        assertEquals("LVIII", p12.intToRoman(58))
        assertEquals("MCMXCIV", p12.intToRoman(1994))
    }
}
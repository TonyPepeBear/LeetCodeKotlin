package com.tonypepe.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


internal class P12Test {

    @Test
    fun intToRoman() {
        val p12 = P12()
        Assertions.assertEquals("III" , p12.intToRoman(3))
        Assertions.assertEquals("IV" , p12.intToRoman(4))
        Assertions.assertEquals("IX" , p12.intToRoman(9))
        Assertions.assertEquals("LVIII" , p12.intToRoman(58))
        Assertions.assertEquals("MCMXCIV" , p12.intToRoman(1994))

    }
}
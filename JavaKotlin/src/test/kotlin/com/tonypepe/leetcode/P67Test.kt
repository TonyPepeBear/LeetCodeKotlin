package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class P67Test {
    @Test
    fun addBinaryTest() {
        val p67 = P67()
        assertEquals("0", p67.addBinary("0", "0"))
        assertEquals("100", p67.addBinary("11", "1"))
        assertEquals("100", p67.addBinary("1", "11"))
        assertEquals("1000", p67.addBinary("100", "100"))
        assertEquals("10000011110", p67.addBinary("11111", "1111111111"))
        assertEquals("10000011110", p67.addBinary("1111111111", "11111"))
        assertEquals("10011110111", p67.addBinary("11111000", "1111111111"))
    }
}

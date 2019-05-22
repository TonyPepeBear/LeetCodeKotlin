package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class P20Test {

    @Test
    fun isValidTest() {
        val p20 = P20()
        assertEquals(true, p20.isValid("()"))
        assertEquals(true, p20.isValid("()[]{}"))
        assertEquals(false, p20.isValid("(]"))
        assertEquals(false, p20.isValid("([)]"))
        assertEquals(true, p20.isValid("{[]}"))
    }
}
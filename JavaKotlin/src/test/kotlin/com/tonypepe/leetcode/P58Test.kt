package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class P58Test {

    @Test
    fun lengthOfLastWordTest() {
        val p58 = P58()
        assertEquals(5, p58.lengthOfLastWord("Hello World"))
        assertEquals(6, p58.lengthOfLastWord("Hello World."))
        assertEquals(0, p58.lengthOfLastWord("    "))
        assertEquals(7, p58.lengthOfLastWord("    eee?eee"))
        assertEquals(1, p58.lengthOfLastWord("a "))
    }
}

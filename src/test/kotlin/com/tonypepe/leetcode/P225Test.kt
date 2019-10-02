package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class P225Test {
    @Test
    fun test() {
        val p225 = P225()
        assert(p225.empty())
        p225.push(2)
        assert(!p225.empty())
        p225.push(3)
        assertEquals(3, p225.top())
        assertEquals(3, p225.pop())
        assertEquals(2, p225.pop())
        assert(p225.empty())
    }
}
package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class P28Test {
    @Test
    fun strStrTest() {
        val p28 = P28()
        assertEquals(
            2,
            p28.strStr(
                "hello",
                "ll"
            )
        )
        assertEquals(
            2,
            p28.strStr(
                "apple",
                "pl"
            )
        )
        assertEquals(
            1,
            p28.strStr(
                "apple",
                "pp"
            )
        )
        assertEquals(
            2,
            p28.strStr(
                "guava",
                "ava"
            )
        )
        assertEquals(
            2,
            p28.strStr(
                "appole",
                "pole"
            )
        )
    }
}

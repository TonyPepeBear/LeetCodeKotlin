package com.tonypepe.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test


class P500Test {
    @Test
    fun findWords() {
        val p500 = P500()
        assertArrayEquals(
            arrayOf("Alaska", "Dad")
            , p500.findWords(arrayOf("Hello", "Alaska", "Dad", "Peace"))
        )
        assertArrayEquals(
            arrayOf("Alaska", "Dad", "asdfghjkl"),
            p500.findWords(arrayOf("Hel,,,lo", "Alaska", "Dad", "Peace", "asdfghjkl"))
        )
        assertArrayEquals(
            arrayOf("zxcv", "QPOW", "LK"),
            p500.findWords(arrayOf("zxcv", "qaz", "QPOW", "qwaszx", "LK"))
        )
    }
}

package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

internal class P819Test {

    @Test
    fun mostCommonWord() {
        val p819 = P819()
        assertEquals(
            "ball", p819.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", arrayOf("hit"))
        )
        assertEquals(
            "b", p819.mostCommonWord("a, a, a, a, b,b,b,c, c", arrayOf("a"))
        )
        assertEquals(
            "ball", p819.mostCommonWord("Bob. hIt, baLl", arrayOf("bob", "hit"))
        )
    }
}
package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertLinesMatch

internal class P890Test {
    @Test
    fun findAndReplacePattern() {
        val p890 = P890()
        assertLinesMatch(
            listOf("mee", "aqq"),
            p890.findAndReplacePattern(
                arrayOf("abc", "deq", "mee", "aqq", "dkd", "ccc"),
                "abb"
            )
        )
    }
}
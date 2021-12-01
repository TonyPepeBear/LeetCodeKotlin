package com.tonypepe.leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class P14Test {
    @Test
    fun longestCommonPrefixTest() {
        val p14 = P14()
//        assertEquals("fl", p14.longestCommonPrefix(arrayOf("flower","flow","flight")))
//        assertEquals("", p14.longestCommonPrefix(arrayOf("dog","racecar","car")))
//        assertEquals("abc", p14.longestCommonPrefix(arrayOf("abc","abcd","abcdef")))
//        assertEquals("", p14.longestCommonPrefix(arrayOf("abc","abcd","bcdef")))
//        assertEquals("", p14.longestCommonPrefix(arrayOf()))
        assertEquals("", p14.longestCommonPrefix(arrayOf("aca", "cba")))
    }
}

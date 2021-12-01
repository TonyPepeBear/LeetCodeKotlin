package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

internal class P709Test {

    @Test
    fun toLowerCase() {
        val p709 = P709()
        assertEquals("hello" ,p709.toLowerCase("Hello"))
        assertEquals("here" ,p709.toLowerCase("here"))
        assertEquals("lovely" ,p709.toLowerCase("LOVELY"))
    }
}
package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

internal class P929Test {

    @Test
    fun numUniqueEmails() {
        val p929 = P929()
        assertEquals(
            2,
            p929.numUniqueEmails(
                arrayOf(
                    "test.email+alex@leetcode.com",
                    "test.e.mail+bob.cathy@leetcode.com",
                    "testemail+david@lee.tcode.com"
                )
            )
        )
    }
}
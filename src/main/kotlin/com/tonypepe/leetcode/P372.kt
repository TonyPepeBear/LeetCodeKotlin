package com.tonypepe.leetcode

import java.math.BigInteger

class P372 {
    fun superPow(a: Int, b: IntArray): Int {
        val bigIntegerA = BigInteger(a.toString())
        val bString = StringBuffer()
        b.forEach {
            bString.append(it.toString())
        }
        return bigIntegerA.modPow(
            BigInteger(bString.toString()), BigInteger("1337")
        ).toInt()
    }
}
package com.tonypepe.leetcode

import java.math.BigInteger

fun main() {
    println(P372().superPow(2, intArrayOf(3)))
    println(P372().superPow(2, intArrayOf(1, 0)))
}

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
package com.tonypepe.leetcode

class P12 {
    fun intToRoman(num: Int): String {
        val nums = listOf(1000, 100, 10, 1)
        val valSym = mapOf(
            1000 to "M",
            500 to "D",
            100 to "C",
            50 to "L",
            10 to "X",
            5 to "V",
            1 to "I"
        )
        var n = num
        val ansStr = StringBuilder()
        nums.forEach { v ->
            val x = n / v
            if (x > 0) {
                when (x) {
                    in 1..3 -> ansStr.append(valSym[v]?.repeat(x))
                    4 -> ansStr.append("${valSym[v]}${valSym[v * 5]}")
                    5 -> ansStr.append("${valSym[v * 5]}")
                    in 6..8 -> ansStr.append("${valSym[v * 5]}${valSym[v]?.repeat(x - 5)}")
                    9 -> ansStr.append("${valSym[v]}${valSym[v * 10]}")
                }
                n %= v
            }
        }
        return ansStr.toString()
    }
}

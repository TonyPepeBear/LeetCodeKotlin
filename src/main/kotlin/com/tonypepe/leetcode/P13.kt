package com.tonypepe.leetcode

class P13 {
    companion object {
        val roman = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
    }

    fun romanToInt(s: String): Int {
        var ans = 0
        s.forEachIndexed { index, c ->
            ans += roman.getValue(c)
            if (index > 0 && roman.getValue(c) > roman.getValue(s[index - 1])) {
                ans -= 2 * roman.getValue(s[index - 1])
            }
        }
        return ans
    }
}

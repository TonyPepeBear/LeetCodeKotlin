package com.tonypepe.leetcode

class P771 {
    fun numJewelsInStones(j: String, s: String): Int {
        val jChars = j.toCharArray()
        val sChars = s.toCharArray()
        var ans = 0
        jChars.forEach { x ->
            s.forEach { y ->
                if (x == y)
                    ans++
            }
        }
        return ans
    }
}

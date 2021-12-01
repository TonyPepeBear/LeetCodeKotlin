package com.tonypepe.leetcode

class P771 {
    fun numJewelsInStones(j: String, s: String): Int {
        var ans = 0
        j.forEach { x ->
            s.forEach { y ->
                if (x == y)
                    ans++
            }
        }
        return ans
    }
}

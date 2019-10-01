package com.tonypepe.leetcode

class P728 {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val ans = mutableListOf<Int>()
        for (i in left..right) {
            if (isDivNum(i)) {
                ans.add(i)
            }
        }
        return ans
    }

    private fun isDivNum(n: Int): Boolean {
        val nums = getNums(n)
        if (nums.any { it == 0 }) return false
        nums.forEach {
            if (n % it != 0) return false
        }
        return true
    }

    private fun getNums(n: Int): List<Int> {
        val ans = mutableListOf<Int>()
        var x = n
        while (x > 0) {
            ans.add(x % 10)
            x /= 10
        }
        return ans
    }
}

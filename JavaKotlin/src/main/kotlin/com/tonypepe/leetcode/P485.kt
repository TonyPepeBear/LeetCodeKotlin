package com.tonypepe.leetcode

class P485 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var ans = 0
        nums.forEachIndexed { index, i ->
            var temp = 0
            for (j in index until nums.size) {
                if (nums[j] == 1) temp++
                else break
            }
            if (temp > ans) {
                ans = temp
            }
        }
        return ans
    }
}

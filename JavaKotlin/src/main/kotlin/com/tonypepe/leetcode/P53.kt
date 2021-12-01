package com.tonypepe.leetcode

import kotlin.math.max

class P53 {
    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        var maxCurrent = nums[0]
        for (i in 1 until nums.size) {
            maxCurrent = max(nums[i], maxCurrent + nums[i])
            if (maxCurrent > max) {
                max = maxCurrent
            }
        }
        return max
    }
}

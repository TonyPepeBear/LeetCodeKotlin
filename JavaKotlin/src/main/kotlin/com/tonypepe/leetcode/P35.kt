package com.tonypepe.leetcode

class P35 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (target < nums[0]) return 0
        nums.forEachIndexed { index, i ->
            if (i == target) return index
            else {
                if (index > 0) {
                    if (target < i) return index
                }
            }
        }
        return nums.size
    }
}

package com.tonypepe.leetcode

class P704 {
    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0, nums.size - 1)
    }

    private fun binarySearch(nums: IntArray, target: Int, low: Int, high: Int): Int {
        if (low > high) return -1
        val mid = (low + high) / 2
        if (nums[mid] == target) return mid
        return if (nums[mid] > target) binarySearch(nums, target, low, mid - 1)
        else binarySearch(nums, target, mid + 1, high)
    }
}

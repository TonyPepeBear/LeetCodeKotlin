package com.tonypepe.leetcode

fun main(args: Array<String>) {
    val answer = P167().twoSum(intArrayOf(2, 7, 11, 15), 9)
    answer.forEach {
        println(it)
    }
}

class P167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for (i in 0 until numbers.size) {
            for (j in i + 1 until numbers.size) {
                if (numbers[i] + numbers[j] == target)
                    return intArrayOf(i + 1, j + 1)
            }
        }
        return intArrayOf()
    }
}
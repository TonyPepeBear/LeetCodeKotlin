package com.tonypepe.leetcode

fun Int.isOdd() = this % 2 == 0

class P905 {
    fun sortArrayByParity(A: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val notOdd = mutableListOf<Int>()
        A.forEach {
            if (it.isOdd()) {
                answer.add(it)
            } else {
                notOdd.add(it)
            }
        }
        answer.addAll(notOdd)
        return answer.toIntArray()
    }
}
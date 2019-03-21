package com.tonypepe.leetcode

fun main(args: Array<String>) {
    println(P767().numJewelsInStones("aA", "aAAbbbb"))
    println(P767().numJewelsInStones("z", "ZZ"))
}

class P767{
    fun numJewelsInStones(J: String, S: String): Int {
        var answer = 0
        for (c in S) {
            J.forEach {
                if (c == it){
                    answer++
                }
            }
        }
        return answer
    }
}
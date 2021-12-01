package com.tonypepe.leetcode

class P58 {
    fun lengthOfLastWord(s: String): Int {
        val splits = s.split(' ')
        for (i in splits.size - 1 downTo 0) {
            val length = splits[i].length
            if (length > 0)
                return length
        }
        return splits[splits.size - 1].length
    }
}

package com.tonypepe.leetcode

class P890 {
    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
        val ans = mutableListOf<String>()
        for (word in words) {
            val map = mutableMapOf<Char, Char>()
            var counter = 0
            pattern.forEachIndexed { index, c ->
                if (c in map) {
                    if (word[index] == map[c]) {
                        counter++
                    }
                } else {
                    if (word[index] !in map.values) {
                        map[c] = word[index]
                        counter++
                    }
                }
            }
            if (counter == pattern.length) {
                ans.add(word)
            }
        }
        return ans
    }
}

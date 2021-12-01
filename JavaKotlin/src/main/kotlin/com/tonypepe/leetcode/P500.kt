package com.tonypepe.leetcode

class P500 {
    companion object {
        val first = listOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')
        val second = listOf('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')
        val third = listOf('z', 'x', 'c', 'v', 'b', 'n', 'm')
    }

    fun findWords(words: Array<String>): Array<String> {
        val ans = arrayListOf<String>()
        words.forEach {
            if (isAlphabet(it)) {
                ans.add(it)
            }
        }
        return ans.toStringArray()
    }

    private fun isAlphabet(s: String): Boolean {
        val word = s.toLowerCase()
        var flag = true
        word.forEach { c ->
            if (!first.any { it == c }) {
                flag = false
            }
        }
        if (flag) return true else flag = true
        word.forEach { c ->
            if (!second.any { it == c }) {
                flag = false
            }
        }
        if (flag) return true else flag = true
        word.forEach { c ->
            if (!third.any { it == c }) {
                flag = false
            }
        }
        return flag
    }
}

fun ArrayList<String>.toStringArray(): Array<String> {
    val array = Array<String>(this.size) { "" }
    this.forEachIndexed { index, s ->
        array[index] = s
    }
    return array
}

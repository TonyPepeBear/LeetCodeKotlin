package com.tonypepe.leetcode

class P824 {
    fun toGoatLatin(input: String): String {
        val ans = StringBuffer()
        input.split(" ").forEachIndexed { index, s ->
            val temp = when (s[0]) {
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                    s + "ma"
                }
                else -> {
                    s.substring(1) + s[0] + "ma"
                }
            } + "a".repeat(index + 1)
            if (index != 0) ans.append(" ")
            ans.append(temp)
        }
        return ans.toString()
    }
}

package com.tonypepe.leetcode

class P14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        val min = shortestStringLength(strs)
        val ans = StringBuffer("")
        for (i in 0 until min) {
            val temp = strs[0][i]
            var f = true
            strs.forEach {
                if (it[i] != temp) {
                    f = false
                }
            }
            if (f) {
                ans.append(temp)
            } else {
                return ans.toString()
            }
        }
        return ans.toString()
    }

    private fun shortestStringLength(strs: Array<String>): Int {
        var min = strs[0].length
        strs.forEach {
            if (it.length < min) {
                min = it.length
            }
        }
        return min
    }
}

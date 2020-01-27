package com.tonypepe.leetcode

import kotlin.math.max

class P67 {
    fun addBinary(a: String, b: String): String {
        val aBinary = Binary(a)
        val bBinary = Binary(b)
        aBinary.add(bBinary)
        return aBinary.toString()
    }

    inner class Binary(number: String) {
        val num: MutableList<Int> = kotlin.run {
            val nums = mutableListOf<Int>()
            for (i in number.length - 1 downTo 0) {
                nums.add(number[i].toInt() - '0'.toInt())
            }
            nums
        }

        fun add(other: Binary) {
            val size = max(size(), other.size())
            for (i in 0 until (size - size())) {
                num.add(0)
            }
            other.num.forEachIndexed { index, i ->
                num[index] += i
            }
            var i = 0
            while (i < size()) {
                if (num[i] > 1) {
                    if (i + 1 == size()) num.add(0)
                    num[i + 1] += num[i] / 2
                    num[i] %= 2
                }
                i++
            }
        }

        fun size() = num.size

        override fun toString() = kotlin.run {
            val str = StringBuilder()
            for (i in (size() - 1) downTo 0) {
                str.append(num[i])
            }
            str.toString()
        }
    }
}

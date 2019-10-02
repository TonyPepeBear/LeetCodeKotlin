package com.tonypepe.leetcode

import java.util.*

class P225 {
    private val stack = Stack<Int>()

    fun push(x: Int) {
        stack.push(x)
    }

    fun pop(): Int {
        return stack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun empty(): Boolean {
        return stack.isEmpty()
    }
}

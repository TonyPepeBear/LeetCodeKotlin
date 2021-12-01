package com.tonypepe.leetcode

import java.util.*

class P20 {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        s.forEach {
            when (it) {
                '(', '{', '[' -> {
                    stack.push(it)
                }
                ')', '}', ']' -> {
                    if (stack.isEmpty()) return false
                    val peek = stack.peek()
                    when (it) {
                        ')' -> {
                            if (peek != '(') return false
                            else stack.pop()
                        }
                        '}' -> {
                            if (peek != '{') return false
                            else stack.pop()
                        }
                        ']' -> {
                            if (peek != '[') return false
                            else stack.pop()
                        }
                    }
                }
            }
        }
        if (!stack.isEmpty()) return false
        return true
    }
}
package com.tonypepe.leetcode

import java.lang.StringBuilder
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    println(
        P819().mostCommonWord(
            "Bob. hIt, baLl",
            arrayOf()
        )
    )
}

fun String.noSymbols(): ArrayList<String> {
    val array = arrayListOf<String>()
    val stringBuilder = StringBuilder()
    this.forEach {
        if (it in 'a'..'z' || it in 'A'..'z') {
            stringBuilder.append(it)
        } else {
            array.add(stringBuilder.toString())
            stringBuilder.setLength(0)
        }
    }
    array.add(stringBuilder.toString())
    return array
}

fun String.inBaned(banned: Array<String>): Boolean {
    banned.forEach {
        if (it == this) {
            return true
        }
    }
    return false
}

fun String.inWordTimes(wordtimes: ArrayList<WordTime>): Boolean {
    for (wordtime in wordtimes) {
        if (wordtime.str == this)
            return true
    }
    return false
}

data class WordTime(val str: String, var time: Int) : Comparable<WordTime> {
    override fun compareTo(other: WordTime) = time - other.time
}

class P819 {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val noSpace = paragraph.split(" ")
        val strs = arrayListOf<String>()
        noSpace.forEach {
            val str = it.toLowerCase()
            strs.addAll(str.noSymbols())
        }
        while (strs.remove("")) {
        }
        val wordTimes = arrayListOf<WordTime>()
        for (str in strs) {
            if (str.inBaned(banned)) {
                continue
            }
            if (!str.inWordTimes(wordTimes)) {
                wordTimes.add(WordTime(str, 0))
            } else {
                for (wordTime in wordTimes) {
                    if (wordTime.str == str)
                        wordTime.time++
                }
            }
        }
        return Collections.max(wordTimes).str
    }
}
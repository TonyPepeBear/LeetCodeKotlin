package com.tonypepe.leetcode

import java.lang.StringBuilder

fun main() {
    val testData = arrayOf(
        "to...ny+ee@gmail.com",
        "to....ny+eeee@gmail.com",
        "town@gmail.com",
        "t.o.w.n@gmail.com",
        "t.o.w.n+22@gmail.com"
    )
    println(P929().numUniqueEmails(testData))
}

class P929 {
    fun numUniqueEmails(emails: Array<String>): Int {
        val ansEmails = arrayListOf<String>()
        emails.forEach {
            val email = StringBuilder()
            val emailSplit = it.split("@")
            email.append(emailSplit[0].run {
                val replace = replace(".", "")
                var index = replace.indexOf("+")
                if (index < 0) index = replace.length
                replace.subSequence(0, index)
            })
            email.append("@" + emailSplit[1])
            if (ansEmails.indexOf(email.toString()) < 0) {
                ansEmails.add(email.toString())
            }
        }
        return ansEmails.size
    }
}
package com.tonypepe.leetcode

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
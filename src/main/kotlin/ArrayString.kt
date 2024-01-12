package com.github.senin24

import java.util.*

class ArrayString {
    /**
     * 1768. Merge Strings Alternately
     * https://leetcode.com/problems/merge-strings-alternately/description/
     */
    fun task1768(word1: String, word2: String): String {
        val chars1: CharArray = word1.toCharArray()
        val chars2: CharArray = word2.toCharArray()
        val maxIndex = if (word1.length > word2.length) chars2.size - 1 else chars1.size - 1
        val summaryChars: LinkedList<Char> = LinkedList<Char>()
        (0..maxIndex).map { it: Int ->
            summaryChars.add(chars1[it])
            summaryChars.add(chars2[it])
        }
        val longChars: CharArray = if (word1.length > word2.length) chars1 else chars2
        (maxIndex + 1..<longChars.size).map {
            summaryChars.add(longChars[it])
        }
        return summaryChars.joinToString(separator = "")
    }

    /**
     * 1071. Greatest Common Divisor of Strings
     * https://leetcode.com/problems/greatest-common-divisor-of-strings/
     */
    fun task1071(str1: String, str2: String): String {
        val short = if (str1.length > str2.length) str2 else str1
        val long = if (str1.length > str2.length) str1 else str2

        var maxDivide = ""

        (1 ..  short.length).forEach{
            if (short.length % it == 0) {
                val divideStr =  short.substring(0, it)
                if (short.replace(divideStr, "").isEmpty()
                    && long.length % it == 0) {
                    if (long.replace(divideStr, "").isEmpty()) maxDivide = divideStr
                }
            }
        }

        return maxDivide
    }
}
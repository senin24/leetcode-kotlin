package com.github.senin24

import java.util.LinkedList

fun main() {
    println("Hello World!")
}

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
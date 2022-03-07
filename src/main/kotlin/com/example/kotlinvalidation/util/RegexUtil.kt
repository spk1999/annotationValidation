package com.example.kotlinvalidation.util

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexUtil {
    companion object {
        fun matcher(regexPattern: String?, string: String?): Matcher? {
            val p = Pattern.compile(regexPattern)
            return p.matcher(string)
        }
    }
}
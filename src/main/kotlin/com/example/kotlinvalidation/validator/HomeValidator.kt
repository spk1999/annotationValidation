package com.example.kotlinvalidation.validator

import com.example.kotlinvalidation.annotation.Home
import com.example.kotlinvalidation.constants.RegexConstants.Companion.TEN_DIGIT_MOBILE_NO_REGEX
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext
import com.example.kotlinvalidation.util.RegexUtil

class HomeValidator : ConstraintValidator<Home, String> {

    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
//        val list = listOf("apartment", "attached", "deattached")
//        return list.contains(home)
        if (value == null || value.isEmpty()) {
            return true
        } else if (RegexUtil.matcher(TEN_DIGIT_MOBILE_NO_REGEX, value)?.matches() == true) {
            return true
        }
        return false
    }
}
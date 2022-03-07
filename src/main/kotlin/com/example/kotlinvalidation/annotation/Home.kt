package com.example.kotlinvalidation.annotation

import com.example.kotlinvalidation.validator.HomeValidator
import java.lang.annotation.*
import java.lang.annotation.Retention
import java.lang.annotation.Target
import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass


@MustBeDocumented
@Target(ElementType.FIELD, ElementType.PARAMETER, ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = [HomeValidator::class])
annotation class Home(
    val message: String = "Please enter a valid 10 digit mobile number",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)

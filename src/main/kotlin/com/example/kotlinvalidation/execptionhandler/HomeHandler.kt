package com.example.kotlinvalidation.execptionhandler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.ObjectError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import java.util.stream.Collectors

@ControllerAdvice
class HomeHandler {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseBody
    fun processUnmergeException(ex: MethodArgumentNotValidException): ResponseEntity<List<*>>? {
        val list: List<*> = ex.bindingResult.allErrors.stream()
            .map { fieldError: ObjectError -> fieldError.defaultMessage }
            .collect(Collectors.toList())
        return ResponseEntity(list, HttpStatus.BAD_REQUEST)
    }
}
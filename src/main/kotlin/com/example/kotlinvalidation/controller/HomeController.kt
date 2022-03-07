package com.example.kotlinvalidation.controller

import com.example.kotlinvalidation.dto.HomeDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping
class HomeController {

    @GetMapping
    fun getHome( @RequestBody @Valid request:HomeDto):String {
        return "all home fetched"
    }

}
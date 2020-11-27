package com.example.blog

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration(exclude = [DataSourceAutoConfiguration::class])
class IndexController {

    @GetMapping(path = ["/"])
    fun blog(model: Model): String {
        model["title"] = "Hello Spring!"
        return "Hello Spring!"
    }
}
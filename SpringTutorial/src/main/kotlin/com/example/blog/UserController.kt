package com.example.blog

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class UserController {
    private val counter = AtomicLong()

    @GetMapping("/user")
    fun user(@RequestParam(value = "name", defaultValue = "Anonymous") name: String?): User? {
        return User(counter.incrementAndGet(), name.toString())
    }
}
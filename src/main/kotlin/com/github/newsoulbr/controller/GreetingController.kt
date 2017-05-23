package com.github.newsoulbr.controller

import com.github.newsoulbr.model.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by brunoselva on 5/23/17.
 */
@RestController
class GreetingController {

    val counter = java.util.concurrent.atomic.AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name:String): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello $name")
    }

}
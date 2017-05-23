package com.github.newsoulbr.controller

import com.github.newsoulbr.model.Greeting

/**
 * Created by brunoselva on 5/23/17.
 */
@org.springframework.web.bind.annotation.RestController
class GreetingController {

    val counter = java.util.concurrent.atomic.AtomicLong()

    @org.springframework.web.bind.annotation.RequestMapping("/greeting")
    fun greeting(@org.springframework.web.bind.annotation.RequestParam(value = "name", defaultValue = "World") name:String): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello $name")
    }

}
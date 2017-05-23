package com.github.newsoulbr.controller

import com.github.newsoulbr.KotlinDemoApplicationTests
import org.junit.Assert
import org.junit.Test

import org.springframework.beans.factory.annotation.Autowired

/**
 * Created by brunoselva on 5/23/17.
 */
class GreetingControllerTest : KotlinDemoApplicationTests(){

    @Autowired
    lateinit var controller: GreetingController;

    @Test
    fun greeting() {
        val expectedString = "Hello Kotlin"
        val controllerResponse=controller.greeting("Kotlin")
        Assert.assertTrue(controllerResponse.content.equals(expectedString));
    }

}
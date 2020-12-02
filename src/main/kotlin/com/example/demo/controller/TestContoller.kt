package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/")
    fun getHello() :String {
      val username: = "Kildong"
      var username2:String = "hoge"
      val number = 10

      println("$username")
      print("$username2")
      
      return "Hello World"
    }
}

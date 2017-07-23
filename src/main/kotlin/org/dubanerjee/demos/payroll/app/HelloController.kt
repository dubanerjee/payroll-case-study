package org.dubanerjee.demos.payroll.app

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
open class HelloController {
    @GetMapping("/hello")
    fun index(): String = "Hello World!!"
}
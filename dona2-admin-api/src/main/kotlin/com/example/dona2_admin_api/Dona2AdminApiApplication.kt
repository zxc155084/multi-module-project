package com.example.dona2_admin_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@EntityScan(basePackages = ["com.example.dona2_core.domain"])
@SpringBootApplication(scanBasePackages = ["com.example.dona2_core", "com.example.dona2_admin_api"])
class Dona2AdminApiApplication

fun main(args: Array<String>) {
    runApplication<Dona2AdminApiApplication>(*args)
}

package com.example.dona2_core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories
@SpringBootApplication
class Dona2CoreApplication

fun main(args: Array<String>) {
    runApplication<Dona2CoreApplication>(*args)
}

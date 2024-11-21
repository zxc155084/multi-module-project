package com.example.dona2_admin_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EntityScan(basePackages = ["com.example.dona2_core.domain"])
@EnableJpaRepositories(basePackages = ["com.example.dona2_core.repository"])
@SpringBootApplication
class Dona2AdminApiApplication

fun main(args: Array<String>) {
    runApplication<Dona2AdminApiApplication>(*args)
}

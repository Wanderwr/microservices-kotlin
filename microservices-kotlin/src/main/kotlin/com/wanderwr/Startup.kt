package com.wanderwr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroservicesKotlinApplication

fun main(args: Array<String>) {
	runApplication<MicroservicesKotlinApplication>(*args)
}

package com.helenice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinWithMongoApplication

fun main(args: Array<String>) {
	runApplication<KotlinWithMongoApplication>(*args)
}

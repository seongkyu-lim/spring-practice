package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	context: ConfigurableApplicationContext = runApplication<DemoApplication>(*args)
	greetingClient: GreetingClient = context.getBean(GreetingClient::class.java)
	println(">> message" + greetingClient.getMessage().block())
}

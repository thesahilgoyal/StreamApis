package com.example.StreamApis;

import org.springframework.boot.SpringApplication;

public class TestStreamApisApplication {

	public static void main(String[] args) {
		SpringApplication.from(StreamApisApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

package com.grayash.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;


@SpringBootApplication
@EnableZipkinServer
public class GrayashZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrayashZipkinServerApplication.class, args);
	}
}

package com.mh.ems.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.mh.ems.system")
public class EmsSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsSystemApplication.class, args);
	}

}

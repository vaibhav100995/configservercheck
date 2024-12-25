package com.configserver.configservercheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigservercheckApplication {
//	https://www.youtube.com/watch?v=gb1i4WyWNK4
//	https://www.youtube.com/watch?v=wYFf7U54DFo&t=16s

	public static void main(String[] args) {
		SpringApplication.run(ConfigservercheckApplication.class, args);
	}

}

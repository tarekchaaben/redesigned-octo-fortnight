package tn.esprit.dsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EolRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EolRegistryServerApplication.class, args);
	}

}

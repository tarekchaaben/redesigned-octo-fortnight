package tn.esprit.dsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EolConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EolConfigServerApplication.class, args);
	}

}

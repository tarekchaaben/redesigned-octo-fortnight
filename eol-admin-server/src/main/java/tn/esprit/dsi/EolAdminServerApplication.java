package tn.esprit.dsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class EolAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EolAdminServerApplication.class, args);
	}

}

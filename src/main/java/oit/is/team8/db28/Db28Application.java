package oit.is.team8.db28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class Db28Application {

	public static void main(String[] args) {
		SpringApplication.run(Db28Application.class, args);
	}

}

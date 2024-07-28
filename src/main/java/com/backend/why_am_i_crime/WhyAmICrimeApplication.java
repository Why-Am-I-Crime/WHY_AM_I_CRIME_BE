package com.backend.why_am_i_crime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@EntityScan("com.backend.why_am_i_crime.domain")
@SpringBootApplication
public class WhyAmICrimeApplication {
	public static void main(String[] args) {
		SpringApplication.run(WhyAmICrimeApplication.class, args);
	}
}

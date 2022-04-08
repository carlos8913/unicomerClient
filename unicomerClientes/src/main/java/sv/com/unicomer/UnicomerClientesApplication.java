package sv.com.unicomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages={"sv.com.unicomer","sv.com.unicomer.dao"})
public class UnicomerClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnicomerClientesApplication.class, args);
	}

}

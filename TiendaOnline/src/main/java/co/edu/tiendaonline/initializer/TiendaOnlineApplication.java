package co.edu.tiendaonline.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "co.edu.tiendaonline.controller")
public class TiendaOnlineApplication {

	public static void main(String[] argumentos) {
		SpringApplication.run(TiendaOnlineApplication.class, argumentos);
	}

}

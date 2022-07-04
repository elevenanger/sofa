package consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"consumer", "provider"})
public class SofaRpcConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SofaRpcConsumerApplication.class, args);
	}

}

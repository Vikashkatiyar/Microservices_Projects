package in.neuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientHiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientHiServiceApplication.class, args);
	}

}

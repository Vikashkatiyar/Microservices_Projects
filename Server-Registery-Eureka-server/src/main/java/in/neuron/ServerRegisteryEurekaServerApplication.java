package in.neuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerRegisteryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRegisteryEurekaServerApplication.class, args);
	}

}

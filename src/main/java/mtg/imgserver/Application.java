package mtg.imgserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.system.ApplicationPidFileWriter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jbo on 20.06.2016.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication notificationMicroService = new SpringApplication(Application.class);
        notificationMicroService.addListeners(new ApplicationPidFileWriter("notification-micro-service.pid"));
        notificationMicroService.run(args);
    }
}

package pl.onsight.wypozyczalnia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

  public static void main(String[] args) {
    System.setProperty("spring.profiles.active", "mysql");
    SpringApplication.run(Application.class, args);
    //SpringApplication.run(new Object[]{Application.class}, args);
  }
}

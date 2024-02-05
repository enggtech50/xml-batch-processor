package com.tech.engg5.batch.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import reactor.tools.agent.ReactorDebugAgent;

@EnableScheduling
@SpringBootApplication
public class BookEventsProcessorApplication {
  public static void main(String[] args) {
    ReactorDebugAgent.init();
    System.setProperty("APP_ID", "1000001");
    System.setProperty("APP_NAME", "xml-batch-processor");
    SpringApplication application = new SpringApplication(BookEventsProcessorApplication.class);
    application.run(args);
  }
}

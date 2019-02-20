package com.hnykx.springbootdockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootDockerExampleApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringbootDockerExampleApplication.class, args);
  }
}

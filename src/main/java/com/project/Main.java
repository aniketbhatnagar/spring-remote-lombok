package com.project;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    final SpringApplication app = new SpringApplication(ApplicationConfiguration.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
  }
}

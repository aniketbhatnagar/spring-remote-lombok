package com.project;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

@Configuration
@ComponentScan("com.project")
@EnableAutoConfiguration
@EnableMBeanExport
public class ApplicationConfiguration {
}

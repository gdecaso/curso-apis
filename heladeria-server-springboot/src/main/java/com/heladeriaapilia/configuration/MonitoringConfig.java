package com.heladeriaapilia.configuration;

import com.moesif.servlet.MoesifFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.Filter;

@Configuration
public class MonitoringConfig extends WebMvcConfigurerAdapter {

  @Bean
  public Filter moesifFilter() {
    return new MoesifFilter("eyJhcHAiOiI2NjA6NDA0IiwidmVyIjoiMi4wIiwib3JnIjoiODg6MjExNiIsImlhdCI6MTY4MDMwNzIwMH0.91J4gbS0Y-Daqa0tM8ZVU2KAbAMgxj-CCSw3joWjATQ");
  }
}
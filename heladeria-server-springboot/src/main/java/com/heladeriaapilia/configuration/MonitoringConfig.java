package com.heladeriaapilia.configuration;

import com.moesif.servlet.MoesifFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.Filter;

@Configuration
public class MonitoringConfig extends WebMvcConfigurerAdapter {

  @Value("${MOESIF_APP_ID:null}")
  private String moesifAppId;

  @Bean
  public Filter moesifFilter() {
    if (moesifAppId != null) {
      return new MoesifFilter(moesifAppId);
    } else {
      return (request, response, chain) -> chain.doFilter(request, response);
    }
  }
}
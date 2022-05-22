package com.heladeriaapilia.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void tieneQueHaberDulceDeLeche() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/guidodecaso/heladeria/1.0.0/gustos", String.class))
				.contains("\"name\":\"Dulce de leche\"");
	}
}

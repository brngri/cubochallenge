package com.negri.cubochallenge;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.negri.cubochallenge.entity.Client;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CubochallengeApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreatClientSuccess() {
		var client = new Client("Teste", "Teste", BigDecimal.valueOf(10));
		webTestClient
		.post()
		.uri("/client/save")
		.bodyValue(client)
		.exchange()
		.expectStatus().isOk()
		.expectBody()
		.jsonPath("$.firstName" ).isEqualTo(client.getFirstName())
		.jsonPath("$.lastName" ).isEqualTo(client.getLastName())
		.jsonPath("$.participation" ).isEqualTo(client.getParticipation());
	
	}

}

package br.com.vellido.oauth2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Oauth2Application.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Oauth2ApplicationTests {

	@Test
	public void contextLoads() {
	}

//	@Autowired
//	private JwtTokenStore tokenStore;
//
//	@Test
//	public void whenTokenDoesNotContainIssuer_thenSuccess() {
//		String tokenValue = obtainAccessToken("fooClientIdPassword", "john", "123");
//		OAuth2Authentication auth = tokenStore.readAuthentication(tokenValue);
//		Map<String, Object> details = (Map<String, Object>) auth.getDetails();
//
//		assertTrue(details.containsKey("organization"));
//	}
//
//	private String obtainAccessToken(
//			String clientId, String username, String password) {
//
//		Map<String, String> params = new HashMap<>();
//		params.put("grant_type", "password");
//		params.put("client_id", clientId);
//		params.put("username", username);
//		params.put("password", password);
//		Response response = RestAssured.given()
//				.auth().preemptive().basic(clientId, "secret")
//				.and().with().params(params).when()
//				.post("http://localhost:8081/spring-security-oauth-server/oauth/token");
//		return response.jsonPath().getString("access_token");
//	}

}

package provider;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import provider.service.EchoService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SofaRpcConsumerApplicationTests {

	@Autowired
	EchoService echoService;

	@Test
	void contextLoads() {
	}

	@Test
	void testEcho() {
		assertEquals("some", echoService.saySomething("some"));
	}

}

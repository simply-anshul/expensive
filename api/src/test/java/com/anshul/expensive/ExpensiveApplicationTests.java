package com.anshul.expensive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExpensiveApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testAddition() throws Exception {
		ExpensiveApplication app = new ExpensiveApplication();
		assertEquals("10", app.addition(8, 2));
	}

}

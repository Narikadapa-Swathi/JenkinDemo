package com.cg.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinPracticeApplicationTests {
public static Logger logger=LoggerFactory.getLogger(JenkinPracticeApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case excuting...");
		assertEquals(true,true);
	}

	

}

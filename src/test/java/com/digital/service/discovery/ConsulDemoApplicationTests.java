package com.digital.service.discovery;

import com.pszymczyk.consul.junit.ConsulResource;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsulDemoApplicationTests {

	@ClassRule
	public static final ConsulResource consul = new ConsulResource();

	@Test
	public void contextLoads() {
	}

}

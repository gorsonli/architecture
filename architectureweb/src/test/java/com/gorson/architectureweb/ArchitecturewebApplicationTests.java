package com.gorson.architectureweb;

import com.gorson.architectureweb.config.DruidConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArchitecturewebApplicationTests {

	@Autowired
	private DruidConfig druidConfig;

	@Test
	public void contextLoads() {
		System.out.println(druidConfig.toString());
	}

}

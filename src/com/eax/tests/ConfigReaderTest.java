package com.eax.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.eax.config.ConfigReader;

public class ConfigReaderTest {

	@Test
	public void testGetConfig() {
		ConfigReader cr = new ConfigReader("resources//test_config.xml");
		String a = cr.getConfig("agent_name");
		assertEquals("Config Reader Error","TEST_AGENT", a);
	}

	@Test
	public void testConfigReader() {
		ConfigReader cr = new ConfigReader("resources//test_config.xml");
		assertNotNull(cr);		
	}

}

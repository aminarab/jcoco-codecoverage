package com.tosan.jcoco;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMessageBuilderIT {

	@Test
	public void testNameMkyong() {

		MessageBuilder obj = new MessageBuilder();
		assertEquals("Hello mkyong", obj.getMessage("mkyong"));

	}


}
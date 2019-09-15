package com.tosan.jcoco;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMessageBuilderUT {

	@Test
	public void testNameEmpty() {

		MessageBuilder obj = new MessageBuilder();
		assertEquals("Please provide a name!", obj.getMessage(" "));

	}

	@Test
	public void testNameNull() {

		MessageBuilder obj = new MessageBuilder();
		assertEquals("Please provide a name!", obj.getMessage(null));

	}

}
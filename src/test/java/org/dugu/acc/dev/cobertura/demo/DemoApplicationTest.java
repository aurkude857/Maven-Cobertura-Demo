package org.dugu.acc.dev.cobertura.demo;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class DemoApplicationTest

{
	private DemoApplication app;
	private DemoApplication1 app1;
	private String input;
	private boolean expectedOutput;
	private int inputNumber;

	@Before
	public void init() {
		app = new DemoApplication();
		app1 = new DemoApplication1();
		input = "madam";
		inputNumber = 11;
		expectedOutput = true;
	}

	@Test
	public void pdCheckTest() {
		Assert.assertEquals(expectedOutput, app.isPD(input));
	}

	@Test
	public void isPrimeTest() {
		Assert.assertEquals(expectedOutput, app1.isPrime(inputNumber));
	}
}

package org.dugu.acc.dev.cobertura.demo;

public class DemoApplication {
	// palindrom Check
	public boolean isPD(String word) {
		return new StringBuffer(word).reverse().toString().equals(word) ? true
				: false;
	}

}

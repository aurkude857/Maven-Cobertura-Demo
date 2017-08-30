package org.dugu.acc.dev.cobertura.demo;

public class DemoApplication1 {
	public boolean isPrime(int no) {
		boolean flag = false;
		for (int i = 2; i <= no / 2; i++) {
			flag = i % 2 == 0 ? false : true;
		}
		return flag;
	}
}

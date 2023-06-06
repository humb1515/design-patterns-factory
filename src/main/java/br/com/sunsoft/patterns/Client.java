package br.com.sunsoft.patterns;

import br.com.sunsoft.patterns.factory.IPhoneFactory;
import br.com.sunsoft.patterns.factory.Phone11Factory;
import br.com.sunsoft.patterns.factory.PhoneXFactory;

public class Client {

	public static void main(String[] args) {
		IPhoneFactory facIPhoneX = new PhoneXFactory();
		IPhoneFactory facIPhone11 = new Phone11Factory();

		System.out.println("### Ordering an iPhone X");
		facIPhoneX.orderIphone("standard");

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		facIPhone11.orderIphone("highend");

	}
}

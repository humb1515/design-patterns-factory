package br.com.sunsoft.patterns.factory;

import br.com.sunsoft.patterns.factory.model.IPhone;
import br.com.sunsoft.patterns.factory.model.IPhone11;
import br.com.sunsoft.patterns.factory.model.IPhone11Pro;

public class Phone11Factory extends IPhoneFactory {

	@Override
	protected IPhone getIPhone(String version) {
		IPhone phone = null;
		if ("standard".equalsIgnoreCase(version)) {
			phone = new IPhone11();
		} else if ("highend".equalsIgnoreCase(version)) {
			phone = new IPhone11Pro();
		}

		return phone;
	}
}

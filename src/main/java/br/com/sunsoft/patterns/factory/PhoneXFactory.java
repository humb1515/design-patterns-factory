package br.com.sunsoft.patterns.factory;

import br.com.sunsoft.patterns.factory.model.IPhone;
import br.com.sunsoft.patterns.factory.model.IPhoneX;
import br.com.sunsoft.patterns.factory.model.IPhoneXSMax;

public class PhoneXFactory extends IPhoneFactory {

	@Override
	protected IPhone getIPhone(String version) {
		IPhone phone = null;
		if ("standard".equals(version)) {
			phone = new IPhoneX();
		} else if ("highend".equals(version)) {
			phone = new IPhoneXSMax();
		}
		return phone;
	}
}

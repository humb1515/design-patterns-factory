package br.com.sunsoft.patterns.factory;

import br.com.sunsoft.patterns.factory.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIphone(String version) {

		IPhone iphone = getIPhone(version);
		if (iphone != null) {
			iphone.assemble();
			iphone.certificates();
			iphone.pack();
		}
		return iphone;
	}

	protected abstract IPhone getIPhone(String version);

}

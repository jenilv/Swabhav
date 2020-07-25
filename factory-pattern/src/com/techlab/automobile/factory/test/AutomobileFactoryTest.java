package com.techlab.automobile.factory.test;

import com.techlab.automobile.factory.AutoMobileFactory;
import com.techlab.automobile.factory.AutoType;
import com.techlab.automobile.factory.IAutoMobile;

public class AutomobileFactoryTest {

	public static void main(String[] args) {

		AutoMobileFactory autoMobileFactory = new AutoMobileFactory();
		IAutoMobile autoMobile1 = autoMobileFactory.make(AutoType.AUDI);
		IAutoMobile autoMobile2 = autoMobileFactory.make(AutoType.TESLA);
		IAutoMobile autoMobile3 = autoMobileFactory.make(AutoType.BMW);

		autoMobile1.start();
		autoMobile2.start();
		autoMobile3.start();
		autoMobile1.stop();
		autoMobile2.stop();
		autoMobile3.stop();
	}
}

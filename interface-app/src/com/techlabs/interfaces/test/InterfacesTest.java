package com.techlabs.interfaces.test;

import com.techlabs.interfaces.Boy;
import com.techlabs.interfaces.IEmotionable;
import com.techlabs.interfaces.ISocializable;
import com.techlabs.interfaces.Man;

public class InterfacesTest {

	public static void main(String[] args) {

		Man man = new Man();
		Boy boy = new Boy();

		atTheParty(man, man);
		atTheParty(boy, boy);
		atTheMovie(boy);
		atTheMovie(man);
	}

	private static void atTheParty(ISocializable obj, IEmotionable obj1) {
		obj.depart();
		obj.wish();
	}

	private static void atTheMovie(IEmotionable obj) {
		obj.cry();
		obj.laugh();
	}
}

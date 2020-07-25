package com.techlab.factory.test;

import com.techlab.factory.Country;
import com.techlab.factory.CountryFactory;
import com.techlab.factory.CountryName;

public class FactoryTest {
	public static void main(String[] args) {
		Country india = CountryFactory.getCountry(CountryName.INDIA);
		Country uk = CountryFactory.getCountry(CountryName.UK);
		Country usa = CountryFactory.getCountry(CountryName.USA);

		System.out.println(india.getCurrency());
		System.out.println(uk.getCurrency());
		System.out.println(usa.getCurrency());
		System.out.println(india.getSymbol());
		System.out.println(uk.getSymbol());
		System.out.println(usa.getSymbol());
	}
}

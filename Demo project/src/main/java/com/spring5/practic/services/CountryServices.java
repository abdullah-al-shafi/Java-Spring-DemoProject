package com.spring5.practic.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.spring5.practic.model.Country;

@Service
public class CountryServices {

	private static List<Country> countries = new ArrayList<Country>();

	private static final String[] COUNTRIES = { "Bangladesh", "japan", "canada" };

	final AtomicInteger atomicInteger = new AtomicInteger(0);

	public CountryServices() {

		Stream.of(COUNTRIES).forEach(country -> {
			var countryObj = new Country();
			countryObj.setId(atomicInteger.getAndIncrement());
			countryObj.setCountryName(country);
			countryObj.setCountryCode(country);
		});

	}

	public void addCountry(Country country) {

	}
}

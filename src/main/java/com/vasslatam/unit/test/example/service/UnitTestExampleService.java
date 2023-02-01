package com.vasslatam.unit.test.example.service;

import com.vasslatam.unit.test.example.api.UnitTestExampleApi;

import org.osgi.service.component.annotations.Component;

/**
 * @author diego.galeano
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = UnitTestExampleApi.class
)
public class UnitTestExampleService implements UnitTestExampleApi {

	// TODO enter required service methods

}
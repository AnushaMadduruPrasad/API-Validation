package com.drayson.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.drayson.serenity.steps.GetProductsUserSteps;

import net.thucydides.core.annotations.Steps;

public class GetProductsStepDef {

	@Steps
	GetProductsUserSteps getProductsUser;

	@Given("'Validation' REST API is up and running")
	public void getValidationRestApi() {

	}

	@When("user sends request to 'Validation' web service")
	public void sendRequestToValidation() {
		getProductsUser.send_request_to_validation();
	}

	@Then("user should get <objectOrArray> in the response of the web service call")
	public void shouldGetProductCode(@Named("objectOrArray") String objectOrArray) {
		getProductsUser.should_see_object_or_array(objectOrArray);
	}

	@Then("user should get <empty> in the response of the web service call")
	public void shouldGetEmptyObjectAttribute(@Named("empty") String empty) {
		getProductsUser.should_see_empty_object_as(empty);
	}

	@Then("user should get parse_time_nanoseconds in the response of the web service call")
	public void shouldGetParseTimeNanoSeconds() {
		getProductsUser.should_see_parse_time_nano_seconds();
	}
	
	@Then("user should get <validate> in the response of the web service call")
	public void shouldGetValidate(@Named("validate") Boolean validate){
		getProductsUser.should_see_validate_as(validate);
		
	}
	
	@Then("user should get <size> in the response of the web service call")
	public void shouldGetSize(@Named("size") int size){
		getProductsUser.should_see_size_as(size);
		
	}

}

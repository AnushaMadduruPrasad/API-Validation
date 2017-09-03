package com.drayson.serenity.steps;

import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Iterator;

import org.hamcrest.Matchers;
import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.response.ExtractableResponse;
import com.jayway.restassured.response.Response;

public class GetProductsUserSteps {
	
	public static Response res;
	
	@Step
	public void send_request_to_validation(){
		String url = "http://validate.jsontest.com/";
		res = given().queryParameter("json", "[JSON-code-to-validate]").get(url);
		
	}
	
	@Step
	public void should_see_object_or_array(String objectOrArray){
		then().statusCode(200);
		then().body("object_or_array", Matchers.equalTo(objectOrArray));
	}
	
	@Step
	public void should_see_empty_object_as(String empty){
		then().statusCode(200);
		then().body("empty", Matchers.equalTo(empty));
	}
	
	@Step
	public void should_see_parse_time_nano_seconds(){
		then().statusCode(200);
		then().body("parse_time_nanoseconds", Matchers.notNullValue());
}
	
	@Step
	public void should_see_validate_as(Boolean validate){
		then().statusCode(200);
		then().body("validate", Matchers.equalTo(validate));
	}
	
	@Step
	public void should_see_size_as(int size){
		then().statusCode(200);
		then().body("size", Matchers.equalTo(size));
	}
}

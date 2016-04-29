package io.magentys.rest.missions;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import io.magentys.Agent;
import io.magentys.Mission;

import static com.jayway.restassured.RestAssured.given;


public class Get implements Mission<Response> {

    private RequestSpecification requestSpecification;
    private final String url;
    private Object[] parameters;

    public Get(String url, Object... parameters) {
        this.url = url;
        this.parameters = parameters;
    }

    public Get withRequestSpec(RequestSpecification requestSpec){
        this.requestSpecification = requestSpec;
        return this;
    }


    @Override
    public Response accomplishAs(Agent agent) {
        if(requestSpecification != null) return given(requestSpecification).get(url, parameters);
        return RestAssured.get(url, parameters);
    }
}

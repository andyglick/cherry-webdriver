package io.magentys;

import com.jayway.restassured.response.Response;
import io.magentys.rest.missions.Restful;

/**
 * Unit test for simple App.
 */
public class RestAgentTest {

    @org.junit.Test
    public void should() throws Exception {

       Agent agent = AgentProvider.agent();

       Response response =  agent.performs(Restful.get("http://www.google.co.uk"));

        System.out.println(response.body().prettyPrint());

    }
}
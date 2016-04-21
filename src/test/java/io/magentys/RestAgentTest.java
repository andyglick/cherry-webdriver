package io.magentys;

import com.jayway.restassured.response.Response;
import io.magentys.rest.RestAgent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static io.magentys.rest.missions.Get.get;

/**
 * Unit test for simple App.
 */
public class RestAgentTest {

    @org.junit.Test
    public void should() throws Exception {

       Agent agent = AgentProvider.agent();

       Response response =  agent.performs(get("http://www.google.co.uk"));

        System.out.println(response.body().prettyPrint());

    }
}
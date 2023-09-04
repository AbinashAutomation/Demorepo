package firstScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestOne
{
@Test		
	
public static void test1()
{
Response res=RestAssured.get("https://reqres.in/api/users?page=2");
System.out.println("Status code="+res.getStatusCode());
System.out.println(res.getTime());



}
}


package runner;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import beans.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class API_Test {
	
	
	ObjectMapper mapper = new ObjectMapper();
	
	@Test(enabled=false)
	public void getProfileService() throws JsonParseException, JsonMappingException, IOException {
		
		Response mr = RestAssured.get("http://localhost:3000/profile");
		System.out.println(mr.asString());
		System.out.println(mr.statusCode());
		
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(mr.asString(), User.class);
		System.out.println("Location: "+user.getLocation());
		System.out.println("Name: "+user.getName());
		
		assertEquals(200, mr.statusCode());
		
	}
	
	@Test(enabled=true)
	public void JsonConvert() throws IOException {
		User user = new User();
		user.setName("James Bond");
		user.setAge(22);
		//user.setLocation("Chicago");
		
		ObjectMapper mapper = new ObjectMapper(); //it helps to convert from object to json which comes from Jackson lib
		
		String json = mapper.writeValueAsString(user); //this creates json format from user object
		System.out.println(json);
		
//		User user2 = mapper.readValue(json, User.class); //it convers from json to object and saves inside user class
//		System.out.println(user2.getLocation());
		
	}
	
	@Test(enabled=false)
	public void postProfileService() {
		
		Response mr = RestAssured.get("http://localhost:3000/profile");
		System.out.println(mr.asString());
		System.out.println(mr.statusCode());
		
	}
	
	@Test(enabled=false)
	public void postRequest() throws IOException {
		
		User user = new User();
		user.setAge(36);
		user.setLocation("Alaska");
		user.setName("John Snow");
		
		String myRequest = mapper.writeValueAsString(user);
		System.out.println(myRequest);
		
		Response mr = RestAssured.given().contentType(ContentType.JSON).body(myRequest).post("http://localhost:3000/profile");
		
		System.out.println("Status: "+ mr.statusCode());
		
		Response mrGetresponse = RestAssured.get("http://localhost:3000/profile");
		User user2 = mapper.readValue(mrGetresponse.asString(), User.class);
		
		System.out.println("Location: "+user2.getLocation());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package beans;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data ///comes from lombok dependency it will take care of getters and setters
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class MyRequest {

	private String name;
	private String location;
	private int age;
	
	
}

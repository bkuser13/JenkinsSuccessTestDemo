package runner;

import org.testng.annotations.Test;

import beans.Book;
import beans.MyRequest;
import beans.User;
import utilities.API_Runner;

public class chekAPIutil {

	
	@Test
	public void utilTest() {
		
		API_Runner.runGetRequest("http://localhost:3000/profile");
		String loc = API_Runner.getResponse().getLocation();
		System.out.println(loc);
		
		
		String title = API_Runner.getResponse().getBooks().get(0).getTitle();
		System.out.println(title);
		
		
		for (Book book : API_Runner.getResponse().getBooks()) {
			System.out.println(book.getTitle());
		}
	}
	
	@Test
	public void utilPost() {
		
		MyRequest mr = new MyRequest();
		mr.setAge(44);
		mr.setLocation("Omaha");
		
		API_Runner.runPostRequest("http://localhost:3000/profile", mr);

		String location = API_Runner.getResponse().getLocation();
		System.out.println(location);
		
		
		
	}
}

package Demo;

import org.testng.annotations.Test;

public class Practice {

	@Test
	public void validcredentials() {
		System.out.println("Logged in successfully");
	}
	
	@Test
	public void invalidcredentials() {
		System.out.println("Unable to login");
	}
	
}

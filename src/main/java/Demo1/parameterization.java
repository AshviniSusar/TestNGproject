package Demo1;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class parameterization {

	@Test
	@Parameters({"url","username"})
	public  void  method1(String Newurl, String username) {
		System.out.println(Newurl);
		System.out.println(username);
		
		
	}


}

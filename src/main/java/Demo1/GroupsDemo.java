package Demo1;

import org.testng.annotations.Test;

public class GroupsDemo {
	@Test(groups={"Smoke","Regression"})
	
	public void method1() {
		System.out.println("hello");
	}
	
	
@Test(groups="sanity")public void method2() {
	System.out.println("hello1");
}

@Test(groups="Regression")
public void method3() {
	System.out.println("hello2");
}
}

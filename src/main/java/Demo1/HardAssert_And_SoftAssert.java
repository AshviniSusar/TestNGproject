package Demo1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_And_SoftAssert {

	/*
	 * @Test public void method1() {
	 * 
	 * Assert.assertEquals(19,20);
	 * 
	 * System.out.println("hello");
	 * 
	 * //Assert.asertEquals(19,20,"dfstty");
	 * 
	 * 
	 * }
	 */

	@Test

	public void method2() {

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(19, 20, "value is not matching");

		System.out.println("hello");

		sa.assertAll(); // this is mandatory
	}
}

package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.CustomListeners.class)  //Whenever some of this methods meet conditions specified in CustomListeners custom listener methods will be executed
public class ListenerTest {

	@Test()
	void test1() {
		System.out.println("This is test1");
		Assert.assertEquals("A", "A");
	}
	
	@Test()
	void test2() {
		System.out.println("This is test2");
		Assert.assertEquals("A", "B");
	}
	
	@Test()
	void test3() {
		System.out.println("This is test3");
		throw new SkipException("This is skip exception"); // this statement will skip "test3" test method
	}
	
}

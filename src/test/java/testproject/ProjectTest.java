 package testproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectTest {

	@Test
	 public void print(){
		 System.out.println(" hello");
		  Assert.fail();
	}
}

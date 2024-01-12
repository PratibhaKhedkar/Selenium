package AssertTestNG;

import org.testng.Assert;

import org.testng.annotations.Test;

public class Assert_Hard_equal_andNotequal {

 // @Test
//  public void VerifyTtile() {
//	  String s1= "pratibha";
//	  String s2= "pratibha";
//	String s3= "chole";
//	    
//	  Assert.assertEquals(s1,s2, "Tc-Failed title and url are matching");
//	  //Assert.assertNotEquals(s1,s3, "Tc-Failed title and url are matching");
//  }
  
  @Test
  public void VerifyTtile() {
	  String s1= "pratibha";
	  String s2= null;
	   // Assert.assertNotNull(s1, "Tc-Failed notNull are matching");
	 Assert.assertNull(s2, "Tc-Failed NULL are matching");
  }
}

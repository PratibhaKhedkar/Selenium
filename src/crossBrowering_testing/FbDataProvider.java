package crossBrowering_testing;

import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

public class FbDataProvider {
  @DataProvider(name = "Fbregreassion")
  public static String[][] fbDtataset() 
  {
	  String a[][] = {{"Aprati","Achole","8888473412"}};
	  return a;
	  
  }
}

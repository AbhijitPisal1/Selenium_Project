package groupScripts;

import org.testng.annotations.Test;

public class SampleOne {
  @Test (groups = "FeatureOne")
  public void S1testOne() {
	  System.out.println("Test11 in SampleOne");
  }
  
  @Test(groups = "FeatureTwo")
  public void S1testTwo() {
	  System.out.println("Test12 in SampleOne");
  }
  
  @Test(groups = "FeatureThree")
  public void S1testThree() {
	  System.out.println("Test13 in SampleOne");
  }
  
  @Test(groups = "FeatureFour")
  public void S1testFour() {
	  System.out.println("Test14 in SampleOne");
  }
}

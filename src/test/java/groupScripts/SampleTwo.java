package groupScripts;

import org.testng.annotations.Test;

public class SampleTwo {
	@Test(groups = "FeatureOne")
	public void S2testOne() {
		System.out.println("Test21 in SampleTwo");
	}

	@Test(groups = "FeatureTwo")
	public void S2testTwo() {
		System.out.println("Test22 in SampleTwo");
	}

	@Test(groups = "FeatureThree")
	public void S2testThree() {
		System.out.println("Test23 in SampleTwo");
	}

	@Test
	public void S2testFour() {
		System.out.println("Test24 in SampleTwo");
	}

}

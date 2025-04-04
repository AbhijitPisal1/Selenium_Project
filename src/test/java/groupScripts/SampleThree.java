package groupScripts;

import org.testng.annotations.Test;

public class SampleThree {
	@Test(groups = "FeatureOne")
	public void S3testOne() {
		System.out.println("Test31 in SampleThree");
	}

	@Test(groups = "FeatureTwo")
	public void S3testTwo() {
		System.out.println("Test32 in SampleThree");
	}

	@Test
	public void S3testThree() {
		System.out.println("Test33 in SampleThree");
	}

	@Test(groups = "FeatureFour")
	public void S3testFour() {
		System.out.println("Test34 in SampleThree");
	}
}

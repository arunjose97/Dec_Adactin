package com.MavenProject;

import org.testng.annotations.Test;

public class ParallelExecution extends Base_Class  {

	
	@Test
	private void Browser() {
	browserLaunch("chrome");
	getUrl("https://www.facebook.com/");
	}
	
	@Test
	private void Browser2() {
	browserLaunch("Firefox");
	getUrl("https://twitter.com/");

	}
	 
}

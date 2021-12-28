package com.MavenProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class DataProviderTest {
	//Multiple set of Data
	//Data provider return Type--- Object[] [] (Object 2D Array)
	
	
	
	@Test(dataProvider = "DecData")
	private void loginDetails(String name,String pass) {
		System.out.println("username: +name");
		System.out.println("userpass: +pass");
	}
	
	@DataProvider(name="MyData")
	private Object[][] inputData() {
	return new Object[][] {
		{"Arun","A123"},{"Ram","R123"},{"Aji","A123"}
	};
	}
	
	@DataProvider(name="DevData")
	private Object[][] inputData2() {
	return new Object[][] {
		{"Test","qwe123"},{"Test1","R123"},{"Test2","A123"}
	};
}
	
	@DataProvider(name="DecData")
	private Object[][] inputData3() {
	return new Object[][] {
		{"Tamil","123"},{"English","2365"},{"test","56855"}
	};
}
}

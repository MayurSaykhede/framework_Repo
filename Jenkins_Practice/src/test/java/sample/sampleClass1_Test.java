package sample;

import org.testng.annotations.Test;

public class sampleClass1_Test {

	@Test
	public void sample1Test() {
		System.out.println("sample1Test()");
	}

	@Test
	public void fethchingJenkinsPrameter() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}

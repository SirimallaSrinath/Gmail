package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://online.tirupatibalaji.ap.gov.in/home/dashboard");
		driver.manage().window().maximize();
		
		
	}

}

package com.bit.ui.test;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTest extends BaseTesat  {
//	@Test(dataProviderClass=ReadDataProvider.class,dataProvider="login")
//	public void test1(Object o,Object o1) {
//		 System.out.println(o+"  "+o1);
//		 WebDriver dr=new ChromeDriver();
//		 dr.get("http://www.facebook.com");
//		 dr.findElement(By.id("email")).sendKeys(o.toString());
//		 dr.findElement(By.id("pass")).sendKeys(o1.toString());
//	}
	WebDriver dr;
	@Parameters("browser")
	@Test
	public void test2(String b) {
		 //System.out.println(o+"  "+o1);
		if(b.equals("chrome"))
		{
		  dr=new ChromeDriver();
		 dr.get("http://www.google.com");
		 
		}else if(b.equals("firefox"))
		{
			  dr=new FirefoxDriver();
			 dr.get("http://www.yahoo.com");
			 
			}
		 //dr.findElement(By.id("email")).sendKeys(o.toString());
		 //dr.findElement(By.id("pass")).sendKeys(o1.toString());
	}

}

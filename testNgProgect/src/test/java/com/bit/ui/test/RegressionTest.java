package com.bit.ui.test;

import org.junit.Test;

public class RegressionTest extends BaseTesat {
	
	@Test(groups= {"ui","backend"},priority=1,enabled=false)
	public void test2() {
		 System.out.println("test2");
	}
	
	@Test(groups="ui")
	public void test3() {
		 System.out.println("test3");
	}	
	

}

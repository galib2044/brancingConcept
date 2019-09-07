package com.bd;

public class ReadDataProvider {
	@DataProvider(name="login")
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	    };
	  }
	}



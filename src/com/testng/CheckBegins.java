package com.testng;

import org.testng.annotations.Test;

public class CheckBegins {
	@Test
	public void demo()
	{
		System.out.println("hello gajanan");
	}
	@Test
	public void demo1()
	{
		System.out.println("hello gajanan 1");
	}
 @Test(invocationCount=3)
	public void demo2()
	{
	 int i=0;
		System.out.println("hello gajanan "+i);
		i++;
	}

}

package com.testng;

import org.testng.annotations.Test;

public class InvocationCount 
{
@Test(invocationCount=5,groups="my")
public void  test()
{
	int a=10;int b=20;
	int c =a+b;
	System.out.println("Addition of"+c);
}
}

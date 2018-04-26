package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest 
{
	
	@Test
	public void sum()
	{
		
		System.out.println("===SUM Method===");
		int a=10; 
		int b =20;
		Assert.assertEquals(30, a+b);
		System.out.println("---------------1st Class-------------------");
	}
	
	
	@Test
	public void mul()
	{
		System.out.println("===Multiplication Method===");
		int a=10; 
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	
	
	@Test
	public void sub()
	{
		System.out.println("===Subtraction Method===");
		int a=10; 
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void div()
	{
		System.out.println("---------------1st Class-------------------");
		System.out.println("\n\n===Divison Method===");
		int a=10; 
		int b=20;
		Assert.assertEquals(2, b/a);
		
		
	}
	
	
}

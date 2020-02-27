package com.testng;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderofTestNg {
	
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("open before suite setup method");
	}
	
	@BeforeTest
	public void Beftest()
	{
		System.out.println(" open before test");
	}
	@BeforeClass
	public void enteringinclass()
	{
		System.out.println(" open  before class ");
	}
	
	@BeforeMethod
	public void startmethod()
	{
		System.out.println(" open before method ");
	}
	
	
	
	@Test
	public void mainnn()
	{
		System.out.println(" opening @test method");
	}
	

	@Test
	public void man2()
	{
		System.out.println(" opening @test second method");
	}
	
	
	@AfterMethod
	public void closingstartmethod()
	{
		System.out.println("  closing @AfterMethod");
	}
	
	@AfterClass
	public void closingclass()
	{
		System.out.println(" closing @Afterclass");
	}
	
	@AfterTest
	public void closingBeftest()
	{
		System.out.println(" closing after test");
	}
	@AfterSuite
	public void closesetup()
	{
		System.out.println(" closing @Aftersuite");
	}
	

}

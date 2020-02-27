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

public class testngfirstclass
{
	@BeforeSuite
	public void setup()
	{
		System.out.println("1 open before suite setup method");
	} 
	@BeforeClass
	public void enteringinclass()
	{
		System.out.println("2  open  before class setup");
	}
	@BeforeMethod
	public void startmethod()
	{
		System.out.println("3 open before method setup");
	}
	@BeforeTest
	public void Beftest()
	{
		System.out.println("4 open before test");
	}
	@Test
	public void mainnn()
	{
		System.out.println("5 opening @test method");
	}
	@Test
	public void main2n()
	{
		System.out.println("@nd  opening @test method");
	}
	
	@AfterTest
	public void closingBeftest()
	{
		System.out.println("6 closing after test");
	}
	
	@AfterMethod
	public void closingstartmethod()
	{
		System.out.println(" 7 closing @AfterMethod");
	}
	
	
	@AfterClass
	public void closingclass()
	{
		System.out.println(" 8 closing @Afterclass");
	}
	@AfterSuite
	public void closesetup()
	{
		System.out.println("9 closing @Aftersuite");
	}
	
}

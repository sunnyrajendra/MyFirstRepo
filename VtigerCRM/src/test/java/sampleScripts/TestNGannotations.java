package sampleScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannotations
{
	@BeforeSuite
	public void BS()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
	@Test
	public void Test3()
	{
		System.out.println("Test3");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("AfterClass");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("AfterSuite");
	}
}
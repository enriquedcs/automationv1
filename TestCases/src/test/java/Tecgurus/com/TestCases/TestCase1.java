package Tecgurus.com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import PageObjects.winHomePage;

public class TestCase1 {
	winHomePage winHomePage;
	
  @Test
  public void Gameflow() {
	  winHomePage
	  .GoTo();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  winHomePage = new winHomePage();
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}

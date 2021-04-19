package test;

import org.testng.annotations.*;

public class day3 {
    @AfterClass
    public void befoclass()
    {
        System.out.println("After executing all methods in the class");
    }
    @Test
    public void  Webcarloan()
    {
        //selenium
        System.out.println("weblogincar");
    }
    @BeforeMethod
    public void beforeevery()
    {
        System.out.println("I will execute befor every test method in day 3 class");
    }

    @Test(groups = {"Smoke"})
    public void MobileLogincarLoan()
    {
        //Appium
        System.out.println("Mobilelogincar");
    }
    @BeforeSuite
    public void Bfsuite()
    {
        System.out.println("I am no 1 ");
    }
    @Test
    public void MobileSingincarLoan()
    {
        //Appium
        System.out.println("Mobile SIGIN");
    }
    @Test
    public void MobileSingoutcarLoan()
    {
        //Appium
        System.out.println("Mobile SIGNOUT");
    }
    @Test
    public void APIcarLoan()
    {
        System.out.println("APIlogincar");
    }
}

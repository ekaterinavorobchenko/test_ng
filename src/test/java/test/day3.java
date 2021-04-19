package test;

import org.testng.annotations.*;

public class day3 {
    @AfterClass
    public void befoclass()
    {
        System.out.println("After executing all methods in the class");
    }
    @Parameters({"URL"})
    @Test
    public void  Webcarloan(String urlname)
    {
        //selenium
        System.out.println("weblogincar");
        System.out.println(urlname);
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
    @Test(timeOut = 4000)
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
    @Test(dependsOnMethods = {"Webcarloan","MobileSingoutcarLoan"})
    public void APIcarLoan()
    {
        System.out.println("APIlogincar");
    }
}

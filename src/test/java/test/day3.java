package test;

import org.testng.annotations.*;

public class day3 {
    @AfterClass
    public void befoclas()
    {
        System.out.println("After executing all methods in the class");
    }
    @Parameters({"URL","APIKey/ursname"})
    @Test
    public void  Webcarloan(String urlname,String value)
    {
        //selenium
        System.out.println("weblogincar");
        System.out.println(urlname);
        System.out.println(value);
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
    @Test(dataProvider = "getData")
    public void MobileSingincarLoan(String username, String password)
    {
        //Appium
        System.out.println("Mobile SIGIN");
        System.out.println(username);
        System.out.println(password);
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
    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0]="firstsetusername";
        data[0][1]="password";
        //2st set
        data[1][0]="secondsetusename";
        data[1][1]="secondpassword";
        //3st set
        data[2][0]="thirdsetusename";
        data[2][1]="thirdpassword";
        return data;



    }
}

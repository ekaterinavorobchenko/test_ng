package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
    @Parameters({"URL"})
    @Test
    public void  WebloginHomeLoan(String uname)
    {
        //selenium
        System.out.println("webloginHomePersonalLoan");
        System.out.println("uname");
    }

    @Test(groups = {"Smoke"})
    public void MobileloginHomeLoan()
    {
        //Appium
        System.out.println("MobileloginHome");
    }
    @Test
    public void LoginAPIHomeLoan()
    {
        System.out.println("APIloginHome");
    }
}

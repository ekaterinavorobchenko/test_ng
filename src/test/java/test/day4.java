package test;

import org.testng.annotations.Test;

public class day4 {
    @Test
    public void  WebloginHomeLoan()
    {
        //selenium
        System.out.println("webloginHome");
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

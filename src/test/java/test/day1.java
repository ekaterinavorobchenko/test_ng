package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
    @AfterTest
    public void lastexecution()
    {
        System.out.println("I will execute last");
    }
    @Test
    public void Demo()
    {
        System.out.println("hello");
    }
    @Test
    public void SecondTest()
    {
        System.out.println("bye");
    }
}

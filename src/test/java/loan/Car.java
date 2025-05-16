package loan;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Car {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("executing this before executing each method from the class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("executing this after executing each method from the class");
    }

    @Test(groups = {"Smoke"})
    public void getXUV() {
        System.out.println("got loan for XUV 3XO");
    }

    @Test
    public void getCreata() {
        System.out.println("got loan for creata");
    }

    @Test
    public void getNexon() {
        System.out.println("got loan for Nexon");
    }
}

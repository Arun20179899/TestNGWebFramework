package loan;

import org.testng.Assert;
import org.testng.annotations.*;

public class Animal {

    @Test
    public void cowLoan() {
        System.out.println("Cow Loan Sanctioned");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I am executing first before the test folder execute");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I am executing last after the test folder execute");
    }

    @Test(groups = {"Smoke"})
    public void goatLoan() {
        System.out.println("goat Loan Sanctioned");
        Assert.assertTrue(false);
    }

    @Test
    public void sheepLoan() {
        System.out.println("Sheep Loan Sanctioned");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am executing before all the methods execute in the class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am executing after all the methods executed in the class");
    }
}

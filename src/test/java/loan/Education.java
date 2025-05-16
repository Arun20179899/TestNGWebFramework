package loan;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Education {
    @Test
    public void getSSLCLoan() {
        System.out.println("SSLC Loan Sanctioned");
    }

    @Test(groups = {"Smoke"})
    public void getPUCLoan() {
        System.out.println("PUC Loan Sanctioned");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am no 1");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am no 1 from last");
    }
}

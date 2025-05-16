package loan;

import org.testng.annotations.Test;

public class HomeLoan {
    @Test
    public void getVillageHomeLoan() {
        System.out.println("Home Loan Sanctioned");
    }

    @Test(groups = {"Smoke"})
    public void getBBMPHomeLoan() {
        System.out.println("BBMP Loan got");
    }
}

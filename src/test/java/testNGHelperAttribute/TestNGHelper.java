package testNGHelperAttribute;

import org.testng.annotations.Test;

public class TestNGHelper {
    // to wait sometime
    @Test(timeOut = 4000)
    public void ssmSignin(){
        System.out.println("Signed Successfully");
    }
    // Before executing ssmDashboard test should execute ssmSignin
    // based on dependsOnMethods TestNG helper attribute
    @Test (dependsOnMethods = {"ssmSignin"})
    public void ssmDashboard(){
        System.out.println("SSM Dashboard");
    }
    // to skip this test
    @Test(enabled = false)
    public void ssmTenants(){
        System.out.println("Tenants");
    }
}

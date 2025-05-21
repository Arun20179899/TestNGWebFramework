package orientedPrinciple;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class InheritanceParent {
    public void doThis(){
        System.out.println("I am Here");
    }

    @BeforeMethod
    public void runData(){
        System.out.println("I am first");
    }

    @AfterTest
    public void finalData(){
        System.out.println("I am last");
    }
}

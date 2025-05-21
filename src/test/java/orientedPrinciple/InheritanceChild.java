package orientedPrinciple;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InheritanceChild extends InheritanceParent{

    // if you are defining prerequisites methods in Parent
    // that also run when you start execute child class

    @Test
    public void testRunner(){
        doThis(); // we will called parent class method without creating objects because of we are using inheritance concept
    }
}

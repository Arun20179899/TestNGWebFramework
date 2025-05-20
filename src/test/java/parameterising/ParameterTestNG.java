package parameterising;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {

    @Parameters({"URL","userName"})
    @Test
    public void baseTest(String baseUrl, String userName){
        System.out.println("base test");
        System.out.println(baseUrl);
        System.out.println(userName);
    }
}

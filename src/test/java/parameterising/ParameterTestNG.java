package parameterising;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {

    @Parameters({"URL"})
    @Test
    public void baseTest(String baseUrl){
        System.out.println("base test");
        System.out.println(baseUrl);
    }
}

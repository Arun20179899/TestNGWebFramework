package parameterising;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNGDemo {
    @Parameters({"URL"})
    @Test
    public void secondTest(String url){
        System.out.println("Second Test");
        System.out.println(url);

    }
}

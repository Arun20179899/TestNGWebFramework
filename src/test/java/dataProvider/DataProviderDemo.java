package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    @Test (dataProvider = "getData")
    public void userLoginTest(String userName, String password){
        System.out.println(userName);
        System.out.println(password);

    }

    @DataProvider
    public Object[][] getData(){
        // We have 3 set of usersName and password
        Object[][] data = new Object[3][2];
        // 1st Set
        data[0][0] = "firstUserName";
        data[0][1] = "firstUserName";

        // 2nd Set
        data[1][0] = "secondUserName";
        data[1][1] = "secondUserName";

        // 3rd Set
        data[2][0] = "thirdUserName";
        data[2][1] = "thirdUserName";
        return data;

    }
}

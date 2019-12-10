package testdata;

import org.testng.annotations.DataProvider;

public class logincredentials {

    @DataProvider(name = "logincredentials")
    public static Object[][] logindata(){
        return new Object[][]{
                {"ramya.panguluri@gmail.com","sam@123"}

        };
    }
}

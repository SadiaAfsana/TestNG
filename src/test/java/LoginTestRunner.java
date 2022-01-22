import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginTestRunner extends Setup {
    @Test
    public void doUserLogin() throws IOException, ParseException {
        Login login = new Login(driver);
        driver.get("http://automationpractice.com");

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("./src/test/resources/user.json"));
        JSONObject jsonObject = (JSONObject) obj;

        String email = (String) jsonObject.get("email");
        String password = (String) jsonObject.get("password");

        String username = login.doLogin(email,password);
        Assert.assertTrue(username.contains("Test User"));

        /*
        Login login = new Login(driver);
        driver.get("http://automationpractice.com");
        String username = login.doLogin("tre@test.comju8", "123456");
        Assert.assertTrue(username.contains("Test User"));
         */
    }
}

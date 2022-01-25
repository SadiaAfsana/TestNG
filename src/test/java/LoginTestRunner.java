import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestRunner extends Setup {
    @Test
    public void doUserLogin() throws IOException, ParseException {
        Login login = new Login(driver);
        driver.get("http://automationpractice.com");

        Utils utils = new Utils(driver);
        utils.readJSONArray(0);

        String username = login.doLogin(utils.getEmail(), utils.getPassword());
        Assert.assertTrue(username.contains("Test User"));

    }

    @Test
    public void UserLoginByInvalidEmail() throws IOException, ParseException {
        Login login = new Login(driver);
        driver.get("http://automationpractice.com");

        Utils utils = new Utils(driver);
        utils.readJSONArray(1);

        String errorMessage = login.doLoginByInvalidEmail(utils.getEmail(), utils.getPassword());
        Assert.assertTrue(errorMessage.contains("Invalid email address"));

    }

    @Test
    public void UserLoginByInvalidPassword() throws IOException, ParseException {
        Login login = new Login(driver);
        driver.get("http://automationpractice.com");

        Utils utils = new Utils(driver);
        utils.readJSONArray(2);

        String errorMessage = login.doLoginByInvalidPassword(utils.getEmail(), utils.getPassword());
        Assert.assertTrue(errorMessage.contains("Authentication failed"));

    }
}

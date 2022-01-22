import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    @FindBy(className = "login")
    WebElement linkLogin;
    @FindBy(id = "email")
    WebElement txtEmail;
    @FindBy(id = "passwd")
    WebElement txtPassword;
    @FindBy(id = "SubmitLogin")
    WebElement btnSubmitLogin;
    @FindBy(xpath = "//span[contains(text(),'Test User')]")
    WebElement lblUserName;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String doLogin(String email, String password) {
        linkLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnSubmitLogin.click();

        return lblUserName.getText();
    }


}

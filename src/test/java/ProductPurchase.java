import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPurchase extends Setup{
    public ProductPurchase(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
}

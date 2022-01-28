package TestRunners;

import Pages.Sales;
import Pages.Shop;
import Setup.Setup;
import org.testng.annotations.Test;

public class SalesTestRunner extends Setup {
    @Test(priority = 0,enabled = false)
    public void visitSaleTab(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Sales sales = new Sales(driver);
        sales.doClickSalesTab();
    }
    @Test(priority = 1)
    public void checkSalesTag(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Sales sales = new Sales(driver);
        sales.verifySalesTag();
    }
}
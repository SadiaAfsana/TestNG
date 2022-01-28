package TestRunners;

import Pages.Sales;
import Pages.Shop;
import Setup.Setup;
import org.testng.annotations.Test;

public class SalesTestRunner extends Setup {
    @Test(priority = 0,description = "Go to Sale Page")
    public void visitSaleTab() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sales sales = new Sales(driver);
        sales.doClickSalesTab();
    }

    @Test(priority = 1,description = "Check if all sales item have sale tag")
    public void checkSalesTag() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sales sales = new Sales(driver);
        sales.verifySalesTag();
    }

    @Test(priority = 2,description = "Select a Product")
    public void viewProduct() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sales sales = new Sales(driver);
        sales.selectProduct();
    }
}

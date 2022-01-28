package TestRunners;

import Pages.Shop;
import Setup.Setup;
import org.testng.annotations.Test;


public class ShopTestRunner extends Setup {

  @Test(priority = 0,enabled = false)
    public void visitShopTab(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.doClickShopTab();
    }

    @Test(priority = 1,enabled = false)
    public void sortProducts(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.sortByPrice();
    }
    @Test(priority = 2,enabled = false)
    public void colorFilter(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByColor();
    }

    @Test(priority = 3,enabled = false)
    public void searchProduct(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByName();
    }

    @Test(priority = 4,enabled = false)
    public void productNotFound(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByWrongName();
    }

    @Test(priority = 5)
    public void selectProduct(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.productSection();
    }
}

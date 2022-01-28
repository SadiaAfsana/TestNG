package TestRunners;

import Pages.Shop;
import Setup.Setup;
import org.testng.annotations.Test;


public class ShopTestRunner extends Setup {

    @Test(priority = 0, description = "Go to Shop Page")
    public void visitShopTab() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.doClickShopTab();
    }

    @Test(priority = 1, description = "Sort Products by low to high price")
    public void sortProducts() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.sortByPrice();
    }

    @Test(priority = 2, description = "Search product by color")
    public void colorFilter() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByColor();
    }

    @Test(priority = 3, description = "Search product by its name")
    public void searchProduct() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByName();
    }

    @Test(priority = 4, description = "Search an Invalid product")
    public void productNotFound() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByWrongName();
    }

    @Test(priority = 5, description = "Select an item from Product section")
    public void selectProduct() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.productSection();
    }
}

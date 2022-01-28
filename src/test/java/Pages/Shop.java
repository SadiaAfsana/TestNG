package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Shop {

    WebDriver webDriver;

    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement shopTab;
    @FindBy(xpath = "//h1[contains(text(),'Shop')]")
    WebElement shopTitle;
    @FindBy(className = "orderby")
    WebElement sortingDDl;
    @FindBy(xpath = "//h2[contains(text(),'Black trousers')]")
    WebElement lowestPriceProduct;
    @FindBy(className = "select2-search__field")
    WebElement colorSearch;
    @FindBy(xpath = "//li[contains(text(),'White')]")
    WebElement optionWhite;
    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    WebElement btnApply;
    @FindBy(xpath = "//h2[contains(text(),'Black pants')]")
    WebElement whiteProduct;
    @FindBy(className = "header-search-input")
    WebElement searchField;
    @FindBy(className = "fa-search")
    WebElement searchIcon;
    @FindBy(xpath = "//h1[contains(text(),'Modern')]")
    WebElement modernWatch;
    @FindBy(xpath = "//p[contains(text(),'No products were found matching your selection.')]")
    WebElement noProductFound;
    @FindBy(xpath = "//span[contains(text(),'Top pants upper')]")
    WebElement product;
    @FindBy(xpath = "//h1[contains(text(),'Top pants upper')]")
    WebElement productTitle;

    public Shop (WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public void doClickShopTab(){
        shopTab.click();
        String title = shopTitle.getText();
        Assert.assertEquals(title,"Shop");
    }

    public void sortByPrice(){
        shopTab.click();
        Select select = new Select(sortingDDl);
        select.selectByValue("price");
        String p = lowestPriceProduct.getText();
        Assert.assertEquals(p,"Black trousers");
    }

    public void searchByColor(){
        shopTab.click();
        colorSearch.click();
        optionWhite.click();
        btnApply.click();
        String p = whiteProduct.getText();
        Assert.assertEquals(p,"Black pants");
    }

    public void searchByName(){
        shopTab.click();
        searchField.sendKeys("Modern");
        searchIcon.click();
        String p = modernWatch.getText();
        Assert.assertEquals(p,"Modern");
    }

    public void searchByWrongName(){
        shopTab.click();
        searchField.sendKeys("Doll");
        searchIcon.click();
        String p = noProductFound.getText();
        Assert.assertEquals(p,"No products were found matching your selection.");
    }

    public void productSection(){
        shopTab.click();
        product.click();
        String p = productTitle.getText();
        Assert.assertEquals(p,"Top pants upper");
    }
}

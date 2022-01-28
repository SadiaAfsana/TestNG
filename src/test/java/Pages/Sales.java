package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Sales {
    WebDriver webDriver;

    @FindBy(xpath = "//a[contains(text(),'Sale')]")
    List<WebElement> salesTab;
    @FindBy(xpath = "//h1[contains(text(),'Sale')]")
    WebElement salesTitle;
    @FindBy(className = "price")
    List<WebElement> price;
    @FindBy(className = "onsale")
    List<WebElement> saleTag;
    @FindBy(css = "img")
    List<WebElement> product;
    @FindBy(xpath = "//h1[contains(text(),'Single Shirt')]")
    WebElement productTitle;

    public Sales (WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void doClickSalesTab(){
        salesTab.get(1).click();
        String title = salesTitle.getText();
        Assert.assertEquals(title,"SALE");
    }

    public void verifySalesTag(){
        salesTab.get(1).click();
        int p1= price.size();
        int p2 = saleTag.size();
        Assert.assertEquals(p1,p2);
    }

    public void selectProduct(){
        salesTab.get(1).click();
        product.get(1).click();
        String p = productTitle.getText();
        Assert.assertEquals(p,"Single Shirt");
    }
}

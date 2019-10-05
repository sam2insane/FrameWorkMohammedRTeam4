package amazonsearch;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import reporting.TestLogger;


public class AmazonSearch extends CommonAPI {

    @FindBy( xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement SearchButton;
    @FindBy(xpath = "//*[@tabindex='20']")
    WebElement go;

    public void settype(String name) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//*[@id=\"twotabsearchtextbox\"]");
        if (SearchButton.isEnabled())
            SearchButton.sendKeys(name, Keys.ENTER);
        clickByXpath("//*[@tabindex='20']");
    }




    }

package hamburger;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Hamburger extends CommonAPI {

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    WebElement hamburger;

    @FindBy(xpath = "//a[@data-menu-id='13']")
    WebElement electronics;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[12]/li[6]/a/div")
    WebElement phones;
    @FindBy(xpath = "//a[text()='Unlocked Phones']")
    WebElement unlockedphones;
    @FindBy(xpath = "//*[@class='a-label a-checkbox-label']")
    WebElement blu;
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
    WebElement blumega;
    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement addtocart;
    @FindBy(xpath = "//*[@id=\"attachSiNoCoverage-announce\"]")
    WebElement nothanks;
    @FindBy(xpath = "//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")
    WebElement proceed;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement pass;
    @FindBy(xpath = "//*[@class='a-button-input']")
    WebElement signin;
    @FindBy(xpath = "//*[@role='button']")
    WebElement createac;
    @FindBy(xpath = "//*[@name='customerName']")
    WebElement yourname;
    @FindBy(xpath = "//*[@type='email']")
    WebElement email2;
    @FindBy(xpath = "//*[@tabindex='5']")
    WebElement pass2;
    @FindBy(xpath = "//*[@tabindex='6']")
    WebElement reenterpass;
    public void setHamburger() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hamburger.click();
    }
    public void setElectronics(){
        electronics.click();
    }
    public void setPhones(){
        phones.click();
    }
    public void setUnlockedphones(){
        unlockedphones.click();
    }
    public void setBlu(){
        blu.click();
    }
    public void setBlumega(){
        blumega.click();
    }
    public void setAddtocart(){
        addtocart.click();
    }
    public void setNothanks(){
        nothanks.click();
    }
   // public void setCart(){
     //   cart.click();
    //}
    public void setProceed(){
        proceed.click();
    }
    public void setEmail(){
        email.click();
    }
    public void setPass(){
        pass.click();
    }
    public void setSignin(){
        signin.click();
    }
    public void setCreateac(){
        createac.click();
    }
    public void setYourname(){
        yourname.click();
    }
    public void setEmail2(){
        email2.click();
    }
    public void setPass2(){
        pass2.click();
    }
    public void setReenterpass(){
        reenterpass.click();
    }


}

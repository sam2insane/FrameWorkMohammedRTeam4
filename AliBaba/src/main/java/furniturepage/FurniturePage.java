package furniturepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class FurniturePage extends CommonAPI {
   @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[2]/div[7]/a/div[1]")
    WebElement HomeFurniture;
   @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[2]/div[5]/a/div[1]")
   WebElement Functionalfurniture;
   @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[2]/div[3]/a/div[1]")
   WebElement commercialfurniture;
   @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/a/div[1]")
   WebElement childrenfurniture;
   @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[2]/div/div/form/div[2]/input")
   WebElement search;
   @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div[2]/div[1]/div/a")
   WebElement order;
   @FindBy (xpath = "")
   WebElement DropDown;
   @FindBy (xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div/div/ul/li[5]/div[1]/a[2]")
   WebElement Lights;

   public void setOrder() {
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       order.click();
    }
   public void setSearch(String name){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       if(search.isEnabled())
           Assert.assertTrue(true);
       search.sendKeys(name, Keys.ENTER);
   }
   public void setChildrenfurniture(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       if(childrenfurniture.isDisplayed())
           childrenfurniture.click();
   }
   public void setCommercialfurniture(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       if(commercialfurniture.isDisplayed())
       commercialfurniture.click();
   }
   public void setFunctionalfurniture(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       if(Functionalfurniture.isDisplayed())
           Functionalfurniture.click();
   }
   public void setHomeFurniture() {
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       if (HomeFurniture.isDisplayed())
           HomeFurniture.click();
   }
   public void setHoverToCategories() {
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       clickByXpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div/h3/span");
       sleepFor(2);
       clickByXpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div/div/a");
   }
   public void CheckMyMessages() {
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      clickByXpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div[1]/div[1]/div[3]/a");

   }

    public void setChildrenfurniture(WebElement childrenfurniture) {
        this.childrenfurniture = childrenfurniture;
    }
    public void DropDownTest() {
       mouseHoverByXpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div/h3/i[1]");
       if (Lights.isDisplayed())
           Lights.getText();
    }
    public void DropDownInfo() {


    }
}

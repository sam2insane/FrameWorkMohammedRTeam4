package testhomepage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class TestHomePage extends CommonAPI {

    HomePage testalibaba;
    String url ="https://www.alibaba.com/";


    @BeforeClass
    public void initialize(){
        testalibaba = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }
    @AfterMethod
    public void navigate(){
        driver.navigate().to(url);



    }

    @Test
    public void clickcategoris(){

        testalibaba.setCategoris();
        //driver.navigate().to(url);

    }
    @Test
    public void clicktradeshow(){
        testalibaba.setTradeshows();
    }
    @Test
    public void clickgetapp(){
        testalibaba.setGetapp();


    }
    @Test
    public void clicklanguage(){
        testalibaba.setLanguage();
        //TestHomePage.captureScreenshot(driver, "1st try");
    }
    @Test
    public void clicksolutions(){
        testalibaba.setSourcingSolution();
    }
    @Test
    public void clickonmembership(){
        testalibaba.setServiceandmembership();
    }
    @Test
    public void  clickonhelp(){
        testalibaba.setHelpcommuinity();
    }
//    @Test
//    public void checkproducts(){
//        testalibaba.setProducts();
//    }
    @Test
    public void clickonsearch() throws Exception{
        testalibaba.setSearch("smart phone");
       // driver.navigate().to(url);
    }
    @Test
    public void clickapparel(){
        testalibaba.setApparel();
    }
    @Test
    public void clickshoes(){
        testalibaba.setShoes();
    }
    @Test
    public void clicksports(){
        testalibaba.setSports();
    }
    @Test
    public void clickhomekicthen(){
        testalibaba.setHomekicthen();

    }
    @Test
    public void clickjacket(){
        testalibaba.setJacket();

    }
    @Test
    public void clickhuwaweimobile(){
        testalibaba.setHuwaeimobile();
        //driver.navigate().to(url);
    }
    @Test
    public void checkSphone(){
        testalibaba.setSphone();
        //driver.navigate().to(url);
    }
    @Test
    public void clickiphone(){
        testalibaba.setIphonexr();
        //driver.navigate().to(url);
    }
    @Test
    public void searchfor(){
        testalibaba.setSearchh("ball");
       // driver.navigate().to(url);
    }
    @Test
    public void clickindia(){
        testalibaba.setIndia();
        //driver.navigate().to(url);
    }
    @Test
    public void clickvietnum(){
        testalibaba.setVietnum();
        //driver.navigate().to(url);
    }
    @Test
    public void clickonsignIn(){
        testalibaba.setSingIn();
    }
    @Test
    public void clickvehicles(){
        testalibaba.setVehicles();
    }
    @Test
    public void clickmachinary(){
        testalibaba.setMachinary();
    }
    @Test
    public void clickconsumer(){
        testalibaba.setConsumer();

    }
    @Test
    public void clickandroid() {
        testalibaba.setAndroidphone();
        //driver.navigate().to(url);
    }
    @Test
    public void clickblackview() {
        testalibaba.setBlackview();
        //driver.navigate().to(url);
    }
    @Test
    public void clickfoldedphone(){
        testalibaba.setfoldphone();
        //driver.navigate().to(url);
    }
    @Test
    public void clickoukitel() {
        testalibaba.setoukitel();
        //driver.navigate().to(url);
    }
    @Test
    public void checkUSA(){
        testalibaba.setUSA();
        //driver.navigate().to(url);

    }
    @Test
    public void checkaboutalibaba() {
        testalibaba.setAboutalibaba();
        //driver.navigate().to(url);
    }
    @Test (priority = 1)
    public void checkturkry(){
        testalibaba.setTurkey();
        //driver.navigate().to(url);
    }
    @Test
    public void checkthailand(){
        testalibaba.setThailand();
        //driver.navigate().to(url);
    }
    @Test
    public void checkmalaysia(){
        testalibaba.setMalaysia();
        //driver.navigate().to(url);
    }
    @Test
    public void checksouthkorea(){
        testalibaba.setSouthkorea();
        //driver.navigate().to(url);
    }
    @Test
    public void clickhelpcenter(){testalibaba.setHelpcenter();
    }
    @Test
    public void clickallcategoris(){
        testalibaba.setAllcategori();

    }
    @Test
    public void clickpolicy(){
        testalibaba.setPolicy();
    }
    @Test
    public void clicklearning(){
        testalibaba.setLearningcenter();
    }
    @Test
    public void clickreport(){
        testalibaba.setReport();
    }
    @Test
    public void clicksitemap(){
        testalibaba.setSitemap();
    }
    @Test
    public void clickbuisness(){
        testalibaba.setBuissnesidentity();
    }
    @Test
    public void clickreadytoship(){
       testalibaba.setReadytoship();
    }
    @Test
    public void clickbed(){
        testalibaba.setBed();
    }





    }


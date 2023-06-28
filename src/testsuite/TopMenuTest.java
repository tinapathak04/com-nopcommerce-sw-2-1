package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Computers ']")).click();
       // driver.findElement(By.xpath("//h1[text()='Computers']")).getText();

        String expectedText = "Computers";
        String actualTextElement = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals("message not displayed",expectedText,actualTextElement);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Electronics ']")).click();
        //driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();

        String expectedText = "Electronics";
        String actualTextElement = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        Assert.assertEquals("message not displayed",expectedText,actualTextElement);
    }
    @Test
    public  void userShouldNavigateToApparelPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Apparel ']")).click();
       // driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();

        String expectedText = "Apparel";
        String actualTextElement = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        Assert.assertEquals("message not displayed",expectedText,actualTextElement);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Digital downloads ']")).click();
        //driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();

        String expectedText = "Digital downloads";
        String actualTextElement = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        Assert.assertEquals("message not displayed",expectedText,actualTextElement);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Books ']")).click();
        //driver.findElement(By.xpath("//h1[text()='Books']")).getText();

        String expectedText = "Books";
        String actualTextElement = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        Assert.assertEquals("message not displayed",expectedText,actualTextElement);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Jewelry ']")).click();
       // driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();

        String expectedText = "Jewelry";
        String actualTextElement = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        Assert.assertEquals("message not displayed",expectedText,actualTextElement);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Gift Cards ']")).click();
       // driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();

        String expectedText = "Gift Cards";
        String actualTextElement = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        Assert.assertEquals("message not displayed",expectedText,actualTextElement);

    }


    @After
    public void tearDown(){
        closeBrowser();
    }


}

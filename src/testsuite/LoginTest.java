package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        driver.findElement(By.linkText("Log in")).click();
        String expectedText = "Welcome, Please Sign In!";
        String actualTextElement = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("message not displayed",expectedText,actualTextElement);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("tinap@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("Tp@123");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();

        // Verify the ‘Log out’ text is display
        String expectedLogoutText ="Log out";
        String actualLogoutText = driver.findElement(By.linkText("Log out")).getText();
        Assert.assertEquals("Log out text is not displayed in page",expectedLogoutText,actualLogoutText);
    }


//        String expectedText = "Login is successful.";//button[@class='button-1 login-button']
//        String actualTextElement = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
//        Assert.assertEquals("message not displayed",expectedText,actualTextElement);


    @Test
    public void verifyTheErrorMessage() throws InterruptedException {



        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("tipatel@gmail.com");

        driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Tp123");

        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        String expectedText="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualText=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        Assert.assertEquals("Login fail message not display",expectedText,actualText);

        Thread.sleep(1000);
    }




    @After
    public void tearDown(){
        closeBrowser();
    }

}

package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

        @Before
        public void  setUp(){
        openBrowser(baseUrl);
        }

        @Test
        public void userShouldNavigateToRegisterPageSuccessfully(){
            driver.findElement(By.xpath("//a[text()='Register']")).click();
            driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        }
        @Test
        public void userShouldRegisterAccountSuccessfully(){
            driver.findElement(By.xpath("//a[text()='Register']")).click();                                                    //Click on Register link
            driver.findElement(By.xpath("//input[@id='gender-female']")).click();                                              //Select gender radio button
            driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Tina");                              //Enter First name
            driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Pathak");                             // Enter last name
            driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");                         // Select Day Month and Year
            driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
            driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1913");
            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("tinap123@yahoo.com");                      // Enter Email Address
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Tp@123");                            // Enter Password
            driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Tp@123");                     // Enter confirm Password
            driver.findElement(By.xpath("//button[@name='register-button']")).click();                                         //Click on Register button
            String expectedText = "Login is successful";
            String actualTextElement = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
                                   // Verify the text 'Your registration completed’
            Assert.assertEquals("Massage not found",expectedText,actualTextElement);
        }
    @After
    public void tearDown(){
            closeBrowser();
        }

}

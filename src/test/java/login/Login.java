package login;

import io.cucumber.java.AfterAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Login {
    public static WebDriver driver;
    @FindBy(id="name")
    public WebElement name;
    @FindBy(id="email")
    public WebElement email;
    @FindBy(id="userpassword")
    public WebElement password;
    @FindBy(id="phone")
    public WebElement phone;


    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://accounts.lambdatest.com/register");
        driver.getTitle();
    }

    public void firstTestCase(String username,String password) {
        try {
            System.out.println("Logging into Lambda Test Sign Up Page");
            driver.get("https://accounts.lambdatest.com/register");
            driver.getTitle();
            if(isAlertPresent()){
                driver.switchTo().alert().accept();
            }
            driver.manage().window().maximize();
            driver.findElement(By.id("name")).isDisplayed();
            driver.findElement(By.id("name")).sendKeys(username);
            driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
            driver.findElement(By.id("userpassword")).sendKeys(password);
            driver.findElement(By.id("phone")).sendKeys("6334342444");
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("scrollBy(0, 200)");

        } catch (Exception e) {
        }
    }

    public void clickSignUpButton(){
        WebElement pageHeader= driver.findElement(By.xpath("//a[text()='Sign In']"));
        pageHeader.click();
        System.out.println("Clicked on the Sign In Button.");
    }

    public boolean isAlertPresent(){
        try{
            driver.switchTo().alert();
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public void waitABit(int duration,WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}

package com.cucumberTraining;

public class SeleniumTest {
//    private static WebDriver driver;
//    @FindBy(id="name")
//    public WebElement name;
//    @FindBy(id="email")
//    public WebElement email;
//    @FindBy(id="userpassword")
//    public WebElement password;
//    @FindBy(id="phone")
//    public WebElement phone;
//
//    @BeforeClass
//    public static void setUp() throws Exception {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//    }
//    @Test
//    public void firstTestCase() {
//        try {
//            System.out.println("Logging into Lambda Test Sign Up Page");
//            driver.get("https://accounts.lambdatest.com/register");
//            driver.getTitle();
//            if(isAlertPresent()){
//                driver.switchTo().alert().accept();
//            }
//            driver.manage().window().maximize();
//            driver.findElement(By.id("name")).isDisplayed();
//            driver.findElement(By.id("name")).sendKeys("test");
//            driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
//            driver.findElement(By.id("userpassword")).sendKeys("12345");
//            driver.findElement(By.id("phone")).sendKeys("6334342444");
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//            js.executeScript("scrollBy(0, 200)");
//            WebElement pageHeader= driver.findElement(By.xpath("//a[text()='Sign In']"));
//            pageHeader.click();
//            System.out.println("Clicked on the Sign In Button.");
//        } catch (Exception e) {
//        }
//    }
//
//    public boolean isAlertPresent(){
//        try{
//            driver.switchTo().alert();
//            return true;
//        }catch (Exception e) {
//            return false;
//        }
//    }
//
//    public void waitABit(int duration,WebElement element){
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
//    @AfterClass
//    public static void closeBrowser() {
//        driver.close();
//        System.out.println("The driver has been closed.");
//    }
}

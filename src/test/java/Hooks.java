import io.cucumber.java.AfterAll;
import login.Login;

import static login.Login.driver;

public class Hooks {
    @AfterAll
    public static void closeBrowser() {
        driver.close();
        System.out.println("The driver has been closed.");
    }
}

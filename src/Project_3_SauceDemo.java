import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Project_3_SauceDemo {
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;
    static String browser = "Chrome";

    public static void main(String[] args) throws InterruptedException {
        if (browser.equalsIgnoreCase("Internet Explorer")) {
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Enter correct browser name.");
        }
        driver.get(baseUrl);
        Thread.sleep(2000);
        System.out.println("Page title is: " + driver.getTitle());  //printing the title of page
        System.out.println("Current Url is: " + driver.getCurrentUrl());  //printing the current Url
        System.out.println("Page source is : " + driver.getPageSource());  //printing the page source
        Thread.sleep(2000);
        WebElement usernameField = driver.findElement(By.name("user-name"));
        usernameField.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("admin123");
        WebElement loginClick = driver.findElement(By.id("login-button"));
        loginClick.click();
        System.out.println("Current url is: " + driver.getCurrentUrl());
        driver.get(baseUrl);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
    }
}

package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//cok onemli
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Cok onemli

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("iphone");
        Thread.sleep(3000);
        aramaKutusu.submit();//Keys.ENTER gibi
        driver.close();
    }
}

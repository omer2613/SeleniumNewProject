package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_relativeLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//cok onemli
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Cok onemli

         /*
    Relative Locators

    - Bir web elementi direk locate edemedigimiz durumlarda,
    o web elementi etrafındaki web elementlerin refaransi ile tarif etmemizi saglar

    - Bir web sayfasında benzer özellikler sahip webelementlerin oldugu durumlarda kullanılabilir

    - above==> Belirtilen elementin üstünde olan elementi secer
    - below==> Belirtilen elementin altında olan elementi secer
    - to_left_of==> Belirtilen elementin solunda olan elementi secer
    - to_right_of==> Belirtilen elementin sagında olan elementi secer
    - near==> Belirtilen elementin yanında/yakınında olan elementi secer

     */
        //amzona gidelim
        driver.get("https://ww.amazon.com");
        //city bike aratalim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));//-->//*[@*='text']
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
        //relative locator kullanarak hybrid bikes altindaki elemente tiklayalim

        WebElement hybridBikes= driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        By with;
        WebElement electricBike= driver.findElement(with(By.tagName("a")).below(hybridBikes));
        WebElement completeBike= driver.findElement(with(By.tagName("a")).above(hybridBikes));

        completeBike.click();
        driver.close();
    }
}

package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagName_getAttributeName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//cok onemli
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Cok onemli

        // 1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://wwamazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        // 2- arama kutusunun tagName'inin input oldugunu test edin
        String actuelTagName= aramaKutusu.getTagName();
        System.out.println(actuelTagName);
        String expectedTagName="inpur";

        if (actuelTagName.equals(expectedTagName)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİLED");

        // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
            /*
            <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
            placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto"
            tabindex="0" aria-label="Search Amazon" spellcheck="false">
             */
        String actuelAttribute=aramaKutusu.getAttribute("name");
        System.out.println(actuelAttribute);
        String expectedAttribute="field-keywords";

        if (actuelTagName.equals(expectedAttribute)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİLED");
        // 4- sayfayı kapatınız
        driver.close();
    }
}

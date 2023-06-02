package techproed.day06_relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_relativeLocators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//cok onemli
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Cok onemli

        //amzona gidelim
        driver.get("https://ww.amazon.com");
        //city bike aratalim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));//-->//*[@*='text']
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
        //relative locator kullanarak hybrid bikes altindaki elemente tiklayalim
        //Webelement yazisini konsola yazdiriniz

        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.getText());
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(completeBike.getText());

        System.out.println("*************************************************");
        //bikes altindaki linkleri(webelement) konsola yazdiralim

        List<WebElement> linklerListesi=driver.findElements(By.xpath("(//*[@ class='a-list-item'])[position()>=9 and position()<=15]"));

        /*
        XPATH kullaniminda bir sayfadaki webelemntre mudahale etmek istedigimizde xpath ile locate aldigimizda birden fazla sonuc verebilir.
        (//*[@ class="a-list-item"])[position()>=9 and position()<=15] bu kullanimla aralik belirterek istedigimiz webelemntlere mudahale edebliriz
         */
        //Lambda ile yazdirdik
        linklerListesi.forEach((t-> System.out.println(t.getText())));
        System.out.println("*****************************************");

        for (WebElement w:linklerListesi) {

            w.getText();

        }

        // Bu linklerin hepsini tiklayalim ve sayfa basliklarini alalim

        for (int i=0;i<linklerListesi.size();i++){
            linklerListesi=driver.findElements(By.xpath("(//*[@ class='a-list-item'])[position()>=9 and position()<=15]"));
            System.out.println(linklerListesi.get(i).getText());
            linklerListesi.get(i).click();
            Thread.sleep(1000);
            System.out.println(driver.getTitle());
            driver.navigate().back();
            Thread.sleep(3000);
        }



       // completeBike.click();
    }

}

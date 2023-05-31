package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementLocator {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//cok onemli
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Cok onemli

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike"+ Keys.ENTER);

        // sonuc yazısını yazdırın
        List<WebElement> sonucYazisi=driver.findElements(By.className("sg-col-inner"));
        System.out.println(sonucYazisi.get(0).getText());//1-16 of 155 results for "city bike"

        // sonuc sayısını yazdırın
        String [] sonucSayisi=sonucYazisi.get(0).getText().split(" ");
        System.out.println("Sonuc sayisi = " +sonucSayisi[2]);

        //Sayfadalki onikinci elemani list kullanmadan xpath in index ozelleigini kullanarak lacate aldik
        WebElement onIkinciElement=driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[12]"));
        System.out.println(onIkinciElement.getText());

        // ilk ürünün locatini alın
        List<WebElement> urunler=driver.findElements(By.className("s-image"));
        WebElement ılkUrun=urunler.get(0);

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ılkUrun.isDisplayed());

        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ılkUrun.isEnabled());

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ılkUrun.isSelected());

        // ilk urune tıklayın
        ılkUrun.click();

        // sayfayı kapatın
        driver.close();

         /*
            <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
            placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto"
            tabindex="0" aria-label="Search Amazon" spellcheck="false">
             */

        /*
        //Relative Xpath syntax-->//tagname[name='field-keywords']
                                 //input[@type='text']
                            ( //input[@type='type'])[1]
                                  //*[@type='text']
        */

        /*
          Aldigimiz xpath unique olmadigi zaman parantez kullanarak index belirtebiliriz.
        Boylelikle webelemntleri list e atip istedigimiz elementi almakla ugrasmayiz
         */
    }
}

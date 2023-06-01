package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//cok onemli
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Cok onemli

        /*
            cssSelector ile xpath arasındaki farklar;
            1- cssSelector de @ işareti ve // işaretleri kullanılmaz
            2- xpath ile index alabiliriz ama cssSelector ile index alamayız
            3- xpath ile text olarak locate edebiliriz ama cssSelector ile bunu yapamayız
            4- cssSelector xpath'e göre daha hızlı çalışır
        */

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

       // Add Element butonuna basin
        Thread.sleep(2000);

        WebElement addElementButton=driver.findElement(By.cssSelector("button[onclick='addElement()']"));

       // Delete butonu’nun gorunur oldugunu test edin
        WebElement deletebutton= driver.findElement(By.cssSelector("button[onclick='addElement()']"));
       if (deletebutton.isDisplayed()){
           System.out.println("Tes PASSED");
       }else System.out.println("Test FAİLED");

        //Delete tusuna basin
        deletebutton.click();
        Thread.sleep(2000);

       //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements= driver.findElement(By.cssSelector("h3"));

        if (addRemoveElements.isDisplayed()){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİLED");

    driver.close();
/*

                        ÖDEV3
        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        // Add Element butonuna 100 defa basınız
        // 100 defa basıldığını test ediniz
        // 90 defa delete butonuna basınız
        // 90 defa basıldığını doğrulayınız
        // Sayfayı kapatınız
        */

    }
}

package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Drivermethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //amazon sayfasina gidelim
        driver.get("https://amazon.com");
        //sayfa başliginic amazon içerdiğini test edelim
        String actualTitle= driver.getTitle();
        String expectedtitle="Amazon";
        if (actualTitle.contains(expectedtitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİLED");

        //Url in http://www.amazon.com olduğunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED -> "+actualUrl);


        //sayfayi kapatalim
        driver.close();//browser i kapatır
        //driver.quit(); hepsini kapatir

        //System.out.println("Amazon Actual Title : " +driver.getTitle());
        //System.out.println("Amazon Actual Url : " +driver.getCurrentUrl());


        /*
                    ODEV
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.
         */
    }
}

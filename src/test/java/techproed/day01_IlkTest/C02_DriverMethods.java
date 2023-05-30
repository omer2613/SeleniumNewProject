package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://amazon.com");

        //getTitle() Sayfa basligini verir
        System.out.println("Amazon Actual Title : " +driver.getTitle());
        System.out.println("Amazon Actual Url : " +driver.getCurrentUrl());
        String amazonWindowHandle= driver.getWindowHandle();
        System.out.println("Amazon Window handle değeri : " +driver.getWindowHandle());


        driver.get("http://techproeducation.com");
        System.out.println("Techproeducation Actual Title : " +driver.getTitle());//gettitle sayfa başlıgını verir

        //getCurrentUrl() gidilen sayfanin URL'ini verir
        System.out.println("Techproed Actual Url : " +driver.getCurrentUrl());

        //İçinde olunan sayfanın kaynak kodlarını String olarak verir.
        //System.out.println(driver.getPageSource());

        //getWindowHandle() gidilen sayfanın handle değerini(hashkod) verir.
        //bu handle değerini sayfalar arası geçiş için kullanırız.

        System.out.println("Techproed Window handle Değeri : " +driver.getWindowHandle());//5D1194DF9C9D27A462A32373DF446808
    }
}

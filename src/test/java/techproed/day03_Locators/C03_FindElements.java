package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

public class C03_FindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//cok onemli
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Cok onemli

        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //Sayfadaki linklerin sayısını ve linkleri yazdıralım
        /*
        findelement ile bir webelemente ulaşabilirken, birden fazla webelement için findelements() methodunu kullanırız.
        Bu webelementlerin sayısına ulaşmak için ya da bu web elementlerin yazısını konsola yazdırabilmek için
        List<Webelement> linklerLlistesi=driver.findelements(By.locator("locator değeri")) olarak kullanırız.
        Oluşturmuş olduğumuz List'i loop ile konsola yazdırabiliriz
         */

        List<WebElement> linklerlistesi=driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayisi = "+linklerlistesi.size());
/*
        for (WebElement w:linklerlistesi){
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }

        }*/

        //lambda ile yazdiralim

        linklerlistesi.forEach(link->{if (!link.getText().isEmpty()) {
            System.out.println(link.getText());}});

        //Shop deals in Electronics webElementinin yazısını yazdıralım
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());

        driver.close();
    }
}

package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();//cok onemli

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Cok onemli
         /*
            implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir.
            Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler. 30 saniye beklemesini belirtirsem
         30 saniye bekler ve alt satıra geçer.
         */


        //techproed sayfasina gidelim
        String amazonUrl="https://www.amazon.com";
        String techproUrl="https://www.techproeducation.com";

        driver.get(techproUrl);
        //amazona gidelim
        driver.navigate().to(amazonUrl);
        //techpro sayfasina geri donelim
        driver.navigate().back();
        //sayfa basligini techpro icerdigini test edelim
        String actualTitle= driver.getTitle();
        String arananKelime="Techpro";

        if (actualTitle.contains(arananKelime)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİLED");
        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();
        //sayfa basligini Amazon icerdigini test edelim
        if (driver.getTitle().contains("Amazon")){

        System.out.println("Test PASSED");
    }else System.out.println("Test FAİLED ->"+ actualTitle);


        // sayfayi kapatalim
        driver.close();

    }
}

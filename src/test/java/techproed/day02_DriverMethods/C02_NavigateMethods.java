package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //techproeducation sayfasina gidelim.
        driver.navigate().to("https://www.techproeducation.com");//get() methodu ile ayni mantikta calisir
        Thread.sleep(3000);//Java kodlarini bekletmek icin kullanilir
        //sonra Amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        //amazon sayfaasinin basligini yazdiralim
        System.out.println("Amazon sayfa basligi : " +driver.getTitle());
        Thread.sleep(3000);
        //techproeducation sayfasina geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);
        //sayfa basligini yazdiralim
        System.out.println("Techproeducation Sayfa Basligi : " +driver.getTitle());
        Thread.sleep(3000);
        //amazon sayfasina tekrar gidip url i yazdiralim
        driver.navigate().forward();
        System.out.println("Amazon sayfasi url i : " +driver.getCurrentUrl());
        Thread.sleep(3000);
        //Amazon sayfasindayken sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();

        /*
        ODEV2
        Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim
         */

    }
}

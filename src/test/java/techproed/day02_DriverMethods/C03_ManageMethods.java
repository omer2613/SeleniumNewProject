package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //Browser in konumunu yazdiralim
        System.out.println("Sayfanin Konumu = "+driver.manage().window().getPosition());
        //Brwser in boyutlarini yazdiralim
        System.out.println("Sayfanin Botyutu = "+driver.manage().window().getSize());

        //Browser i maximize yapalim
        driver.manage().window().maximize();
        /*Browser'a gittikten sonra ilk is olarak sayfayi
        her zaman maximize yapmaliyiz
        */
                         /*
        Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
        webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
        maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
        browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
        ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
                 */
        //Techproeducation sayfasina gidelim
        driver.get("https://www.techproeducation.com");
        //Browser in konumunu yazdiralim
        System.out.println("Sayfanin Konumu = "+driver.manage().window().getPosition());
        Thread.sleep(3000);
        //Brwser in boyutlarini yazdiralim
        System.out.println("Sayfanin Botyutu = "+driver.manage().window().getSize());
        Thread.sleep(3000);
        //Sayfayi minimize yapalim
        driver.manage().window().minimize();
        //sayfayi fullscreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));//istedigimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istedigimiz boyuta getirir.
        Thread.sleep(3000);
        //sayfayi kapatiniz
        driver.close();

        /*
        1.Yeni bir Class olusturalim.C06_ManageWindow
        2.Amazon soyfasina gidelim. https://www.amazon.com/
        3.Sayfanin konumunu ve boyutlarini yazdirin
        4.Sayfayi simge durumuna getirin
        5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        7.Sayfayi fullscreen yapin
        8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        9.Sayfayi kapatin
         */


    }
}

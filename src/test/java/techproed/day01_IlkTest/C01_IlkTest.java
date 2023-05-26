package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {

    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/main/resources/drivers/chromedriver.exe");
        //Java uygulamarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz
        //setProperty method u ile class imiza driver in fiziki yolunu belirtiniz
        System.out.println(System.getProperty("Webdriver.chrome.Driver"));
        //getProperty ile "Key" degerini girerek "value"ya ulasabilirim

        WebDriver driver= new ChromeDriver();

        driver.get("http://www.techproeducation.com");
    }
}

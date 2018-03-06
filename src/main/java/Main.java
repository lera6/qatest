import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Pause;

public class Main {
    public static void main(String[] args){
        WebDriver driver = initChromeDriver();
        //WebElement element;

        driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        Pause();

        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.name("submitLogin")).click();

        Pause();

        driver.findElement(By.className("employee_avatar_small")).click();
        driver.findElement(By.id("header_logout")).click();
    }

    public static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        return new ChromeDriver();
    }

    public static void Pause(){
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}

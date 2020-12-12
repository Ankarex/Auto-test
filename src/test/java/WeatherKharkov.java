import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WeatherKharkov {
    @Test

    public void GoogleWeatherKharkov()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua/?hl=ru");
        driver.findElement(By.className("gLFyf")).sendKeys("Погода Харьков");
        driver.findElement(By.className("gLFyf")).submit();
        
    }
}


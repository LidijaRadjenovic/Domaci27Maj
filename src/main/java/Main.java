import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Domaći:
//        Otići na https://www.stealmylogin.com/demo.html,
//        // uneti bilo koje kredencijale za login, prisisnuti dugme.
//        Izvršiti proveru da je, nakon logina, URL promenjen na https://example.com/ kroz grananje.
//        // Ako jeste, štampati “Nice”. Ako nije, štampati “Not nice.”
//        Sve elemente koji se koriste smestiti u intuitivno imenovane promenljive.
//        Kod na git, screen recording puštanja i izvršavanja testa na Drive.

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.stealmylogin.com/demo.html");
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("lidija");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("1111");
        WebElement login = driver.findElement(By.xpath("/html/body/form/input[3]"));
        login.click();
        String url = driver.getCurrentUrl();

        if(url.equals("https://example.com/")){
            System.out.println("Nice.");
        }else{
            System.out.println("Not nice.");
        }

        driver.close();

    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A101{
    public static void main(String [] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\abdul\\OneDrive\\Masaüstü\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.a101.com.tr/");

        driver.manage().window().maximize();
        Thread.sleep(9000);

        driver.findElement(By.xpath("(//button[normalize-space()='Kabul Et'])[1]")).click();

        driver.get("https://www.a101.com.tr/giyim-aksesuar/dizalti-corap/");
        driver.findElement(By.xpath("(//label[@for='attributes_integration_colourSİYAH'])[1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//div[@class='count'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='add-to-basket button green block with-icon js-add-basket'])[1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//a[@class='go-to-shop'])[1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//a[normalize-space()='Sepeti Onayla'])[1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//a[normalize-space()='ÜYE OLMADAN DEVAM ET'])[1]")).click();
        Thread.sleep(5000);

        String userEmail="test@test.com";
        WebElement strUserEmail = driver.findElement(By.xpath("(//input[@name='user_email'])[1]"));
        strUserEmail.sendKeys(userEmail);
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[normalize-space()='DEVAM ET'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[@title='Yeni adres oluştur'])[1]")).click();

        String address="Ev Adresim";
        WebElement strAddress = driver.findElement(By.xpath("(//input[@placeholder='Ev adresim, iş adresim vb.'])[1]"));
        strAddress.sendKeys(address);

        String firstName="Kadir";
        WebElement strFirstName = driver.findElement(By.xpath("(//input[@name='first_name'])[1]"));
        strFirstName.sendKeys(firstName);

        String lastName="Alcan";
        WebElement strLastName = driver.findElement(By.xpath("(//input[@name='last_name'])[1]"));
        strLastName.sendKeys(lastName);

        String phoneNumber="5455050779";
        WebElement strPhoneNumber = driver.findElement(By.xpath("(//input[@name='phone_number'])[1]"));
        strPhoneNumber.sendKeys(phoneNumber);
        Thread.sleep(1000);

        Select city = new Select(driver.findElement(By.xpath("(//select[@name='city'])[1]")));
        city.selectByValue("40");
        Thread.sleep(1000);

        Select township = new Select(driver.findElement(By.xpath("(//select[@name='township'])[1]")));
        township.selectByValue("453");
        Thread.sleep(1000);

        Select district = new Select(driver.findElement(By.xpath("(//select[@name='district'])[1]")));
        district.selectByValue("35490");

        String line="Ağacesme sok No:12/11";
        WebElement strLine = driver.findElement(By.xpath("(//textarea[@name='line'])[1]"));
        strLine.sendKeys(line);

        String postCode="34100";
        WebElement strPostCode = driver.findElement(By.xpath("(//input[@name='postcode'])[1]"));
        strPostCode.sendKeys(postCode);
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//button[normalize-space()='KAYDET'])[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//button[normalize-space()='Kaydet ve Devam Et'])[1]")).click();
    }

}
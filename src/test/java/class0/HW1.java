package class0;
/*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        close the browser
        Note: use name or id as locators
      */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Dana");
        driver.findElement(By.name("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("Dearborn ave");
        driver.findElement(By.name("customer.address.city")).sendKeys("Cincinnati");
        driver.findElement(By.id("customer.address.state")).sendKeys("Ohio");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("43256");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2337828321");
        driver.findElement(By.name("customer.ssn")).sendKeys("222776666");
        driver.findElement(By.id("customer.username")).sendKeys("dana.smith1");
        driver.findElement(By.name("customer.password")).sendKeys("youareamazing");
        driver.findElement(By.name("repeatedPassword")).sendKeys("youareamazing");
        driver.quit();


    }
}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase01 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("//*[@id=\"n-3734237352-navId\"]/li[3]/a"));
        System.out.println(contactUsButton.isDisplayed() && contactUsButton.isEnabled() ? "PASSED" : "FAILED");
        contactUsButton.click();

        WebElement contactUsTitle = driver.findElement(By.id("n-48560"));
        WebElement heading1 = driver.findElement(By.id("dynamic-tagline-48605"));
        System.out.println(contactUsTitle.isDisplayed() ? "PASSED" : "FAILED");
        System.out.println(heading1.isDisplayed() ? "PASSED" : "FAILED");

        Driver.quitDriver();
    }
}

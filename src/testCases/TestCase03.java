package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase03 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("//*[@id=\"n-3734237352-navId\"]/li[3]/a"));
        System.out.println(contactUsButton.isDisplayed() && contactUsButton.isEnabled() ? "PASSED" : "FAILED");
        contactUsButton.click();

        WebElement heading2 = driver.findElement(By.xpath("//*[@id=\"625827e9-331d-422d-967c-2f23c5b2b7ff\"]/div/div/section/div/h2/span"));
        WebElement heading4 = driver.findElement(By.xpath("//*[@id=\"bs-9\"]/span/div/div/div/form/h4"));
        System.out.println(heading2.isDisplayed() ? "PASSED" : "FAILED");
        System.out.println(heading4.isDisplayed() ? "PASSED" : "FAILED");

        Driver.quitDriver();
    }
}

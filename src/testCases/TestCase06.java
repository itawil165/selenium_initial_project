package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase06 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("//*[@id=\"n-3734237352-navId\"]/li[3]/a"));
        System.out.println(contactUsButton.isDisplayed() && contactUsButton.isEnabled() ? "PASSED" : "FAILED");
        contactUsButton.click();

        WebElement sendButton = driver.findElement(By.xpath("//*[@id=\"bs-9\"]/span/div/div/div/form/div[6]/div/div/button"));
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(sendButton.getText().equals("SEND"));

        Driver.quitDriver();
    }
}

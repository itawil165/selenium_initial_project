package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase02 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("//*[@id=\"n-3734237352-navId\"]/li[3]/a"));
        System.out.println(contactUsButton.isDisplayed() && contactUsButton.isEnabled() ? "PASSED" : "FAILED");
        contactUsButton.click();

        WebElement heading1 = driver.findElement(By.xpath("//*[@id=\"f5a174cf-e723-46a4-ae9e-b0e81ae77913\"]/div/div/section/div/div[1]/h1/span"));
        WebElement facebookIcon = driver.findElement(By.xpath("//*[@id=\"f5a174cf-e723-46a4-ae9e-b0e81ae77913\"]/div/div/section/div/div[2]/a[1]"));
        WebElement instagramIcon = driver.findElement(By.xpath("//*[@id=\"f5a174cf-e723-46a4-ae9e-b0e81ae77913\"]/div/div/section/div/div[2]/a[2]"));
        System.out.println(heading1.isDisplayed() ? "PASSED" : "FAILED");
        System.out.println(facebookIcon.isDisplayed() && facebookIcon.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(instagramIcon.isDisplayed() && instagramIcon.isEnabled() ? "PASSED" : "FAILED");

        Driver.quitDriver();
    }
}

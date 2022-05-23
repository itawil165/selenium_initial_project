package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase04 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("//*[@id=\"n-3734237352-navId\"]/li[3]/a"));
        System.out.println(contactUsButton.isDisplayed() && contactUsButton.isEnabled() ? "PASSED" : "FAILED");
        contactUsButton.click();

        WebElement firstNameInput = driver.findElement(By.id("input16"));
        WebElement lastNameInput = driver.findElement(By.id("input17"));
        WebElement emailInput = driver.findElement(By.id("input18"));
        WebElement messageInput = driver.findElement(By.xpath("//*[@id=\"bs-9\"]/span/div/div/div/form/div[4]/div/textarea"));

        String firstName = "John";
        String lastName = "Doe";
        String email = "jonhdoe@gmail.com";
        String message = "Hello World!";

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        messageInput.sendKeys(message);

        System.out.println(firstNameInput.getAttribute("value").equals(firstName));
        System.out.println(lastNameInput.getAttribute("value").equals(lastName));
        System.out.println(emailInput.getAttribute("value").equals(email));
        System.out.println(messageInput.getAttribute("value").equals(message));

        System.out.println(firstNameInput.isDisplayed() && firstNameInput.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(lastNameInput.isDisplayed() && lastNameInput.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(emailInput.isDisplayed() && emailInput.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(messageInput.isDisplayed() && messageInput.isEnabled() ? "PASSED" : "FAILED");

        Driver.quitDriver();
    }
}

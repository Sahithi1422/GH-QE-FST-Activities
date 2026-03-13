package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class AmazonSearch {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        // Open Amazon
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        // Search product
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("iphone 17 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(6000);

        // Get product list
        List<WebElement> products = driver.findElements(
                By.xpath("//div[@data-component-type='s-search-result']")
        );

        // Click 3rd product
        products.get(2).findElement(By.tagName("h2")).click();

        Thread.sleep(7000);

        // Switch tab
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }

        Thread.sleep(4000);

        // Get price (multiple attempts)
        String price = "";

        try {
            price = driver.findElement(By.id("priceblock_ourprice")).getText();
        } catch (Exception e1) {
            try {
                price = driver.findElement(By.id("priceblock_dealprice")).getText();
            } catch (Exception e2) {
                try {
                    price = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]")).getText();
                } catch (Exception e3) {
                    price = "Price not found";
                }
            }
        }

        // Get delivery info
        String delivery = driver.findElement(
                By.xpath("//div[contains(@id,'DELIVERY_BLOCK')]")
        ).getText();

        // Print output
        System.out.println("Price: " + price);
        System.out.println("Delivery Date: " + delivery);

        driver.quit();
    }
}

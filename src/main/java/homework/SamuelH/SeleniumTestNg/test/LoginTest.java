package homework.SamuelH.SeleniumTestNg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testNG.BaseTest;

    public class LoginTest extends BaseTest {

        @Test
        public void loginWithValidUser() {
            driver.get("https://katalon-demo-cura.herokuapp.com/");

            driver.findElement(By.id("btn-make-appointment")).click();

            WebElement usernameField = driver.findElement(By.id("txt-username"));
            WebElement passwordField = driver.findElement(By.id("txt-password"));
            WebElement loginButton = driver.findElement(By.id("btn-login"));

//            usernameField.sendKeys("John Doe");
//            passwordField.sendKeys("ThisIsNotAPassword");
//            loginButton.click();

            usernameField.sendKeys("Samuel H.");
            passwordField.sendKeys("parola mea11");
            loginButton.click();


//        @Test
//            public void loginWithInValidUser() {
//                driver.get("https://katalon-demo-cura.herokuapp.com/");
//
//                driver.findElement(By.id("btn-make-appointment")).click();
//
//                WebElement usernameField = driver.findElement(By.id("txt-username"));
//                WebElement passwordField = driver.findElement(By.id("txt-password"));
//                WebElement loginButton = driver.findElement(By.id("btn-login"));
//
//            usernameField.sendKeys("Sam Jar");
//            passwordField.sendKeys("parolamea321");
//            loginButton.click();
//
//            WebElement appointmentTitle = driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
//            Assert.assertTrue(appointmentTitle.isDisplayed(), "Login-ul NU a avut succes!");

            try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        driver.quit();
        }
    }


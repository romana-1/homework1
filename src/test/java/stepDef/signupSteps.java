package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;

import static base.config.driver;

public class signupSteps extends config {

    @And("Student click on Create an new account button")
    public void studentClickOnCreateAnNewAccountButton() {
        driver.findElement(By.cssSelector("a[class='new-account']")).click();
    }

    @And("user enter valid first name")
    public void userEnterValidFirstName() {
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("kam");
    }

    @And("user enter valid last name")
    public void userEnterValidLastName() {
        driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("ROOM");
    }

    @And("user enter new valid email address")
    public void userEnterNewValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("lanny1234@gmail.com");
    }

    @And("user enter a valid password")
    public void userEnterAValidPassword() {
        driver.findElement(By.name("password")).sendKeys("12345678900");
    }

    @And("user enter valid confirm password")
    public void userEnterValidConfirmPassword() {
        driver.findElement(By.name("confirmPassword")).sendKeys("12345678900");
    }

    @And("user enter their month as {string} under dob")
    public void userEnterTheirMonthAsUnderDob(String month) {
        Select m = new Select(driver.findElement(By.name("month")));
        m.selectByVisibleText(month);
    }

    @And("user enter their day as {string} under dob")
    public void userEnterTheirDayAsUnderDob(String enterDay) {
        Select d = new Select(driver.findElement(By.name("day")));
        d.selectByVisibleText(enterDay);
    }

    @And("user enter their year as {string} under dob")
    public void userEnterTheirYearAsUnderDob(String enterYear) {
        Select y = new Select(driver.findElement(By.name("year")));
        y.selectByVisibleText(enterYear);
    }

    @And("user select a gender")
    public void userSelectAGender() {
        driver.findElement(By.id("female")).click();
    }


        @And("user click the term and condition policy")
    public void userClickTheTermAndConditionPolicy() {
            driver.findElement(By.id("defaultCheck1")).click();
    }
    @And("user click on Create my account button")
    public void userClickOnCreateMyAccountButton() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}









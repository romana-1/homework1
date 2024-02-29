package stepDef;

import base.config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;

import static base.config.driver;

public class signupSteps extends config {
    Faker faker = new Faker();

    @And("Student click on Create an new account button")
    public void studentClickOnCreateAnNewAccountButton() {
        driver.findElement(By.cssSelector("a[class='new-account']")).click();
    }

    @And("user enter their first name")
    public void userEnterTheirFirstName() {
        STUDENT_FIRST_NAME = faker.name().firstName().replaceAll("[^a-zA-Z0-9]", "");
        driver.findElement(By.name("firstName")).sendKeys(STUDENT_FIRST_NAME);
    }

    @And("user enter their last name")
    public void userEnterTheirLastName() {
        STUDENT_LAST_NAME = faker.name().lastName().replaceAll("[^a-zA-Z0-9]", "");
        driver.findElement(By.name("lastName")).sendKeys(STUDENT_LAST_NAME);
    }

    @And("user enter new their email address")
    public void userEnterNewTheirEmailAddress() {
        STUDENT_RANDOM_EMAIL = STUDENT_FIRST_NAME.toLowerCase()+"."+STUDENT_LAST_NAME.toLowerCase()+faker.number().digits(4)+"@taltektc.com";
        driver.findElement(By.name("email")).sendKeys(STUDENT_RANDOM_EMAIL);
    }


    @And("user enter a valid password")
    public void userEnterAValidPassword() {
        driver.findElement(By.name("password")).sendKeys("1234567890");

    }

    @And("user enter valid confirm password")
    public void userEnterValidConfirmPassword() {
        driver.findElement(By.name("confirmPassword")).sendKeys("1234567890");
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

    @And("user enter their gender as {string}")
    public void userEnterTheirGenderAs(String enterGender) {
        String beforeValue = "//input[@id='";
        String afterValue = "']";
        String fullValue =beforeValue+enterGender+afterValue;
        driver.findElement(By.xpath(fullValue)).click();

    }
    @And("user accept the term")
    public void userAcceptTheTerm() {
        driver.findElement(By.name("agree")).click();

    }

    @When("user click on Create my account button")
    public void userClickOnCreateMyAccountButton() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("the user should get unique student id with successful message")
    public void theUserShouldGetUniqueStudentIdWithSuccessfulMessage() {
        String studentIdFullText = driver.findElement(By.xpath("//div[@class='swal-text']")).getText();
            STUDENT_RANDOM_ID = studentIdFullText.substring(studentIdFullText.indexOf(":") + 2);
            System.out.println("Student Random Id is :==========+++++======>>> "+STUDENT_RANDOM_ID);
        }

    @And("student click on {string} button from popup modal")
    public void studentClickOnButtonFromPopupModal(String buttonName) {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='"+buttonName+"'])")).click();
    }

    @And("student enter newly created student id")
    public void studentEnterNewlyCreatedStudentId() {
        driver.findElement(By.name("email")).sendKeys(STUDENT_RANDOM_EMAIL);

    }

    @And("student enter newly created password")
    public void studentEnterNewlyCreatedPassword() {
        driver.findElement(By.name("password")).sendKeys("1234567890");



    }







    }














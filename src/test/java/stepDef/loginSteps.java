package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class loginSteps extends config {
    @Given("user at TalentTEK Homepage")
    public void userAtTalentTEKHomepage() {
    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys(STUDENT_EMAIL);
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        driver.findElement(By.name("password")).sendKeys(STUDENT_PASSWORD);
    }

    @Then("the user should be able to login successfully")
    public void theUserShouldBeAbleToLoginSuccessfully() {
        String businessAct = "Student Information";
        String developerCodeExp = driver.findElement(By.xpath("//*[@id='wrap']//h2")).getText();
        Assert.assertEquals(businessAct, developerCodeExp);
    }
   // @And("user enter invalid email address")
   // public void userEnterInvalidEmailAddress() {
    //    driver.findElement(By.name("email")).sendKeys("T123@gmail.com");
   // }
   // @And("user enter invalid password")
   // public void userEnterInvalidPassword() {
    //    driver.findElement(By.name("password")).sendKeys("122123");

   // }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        driver.findElement(By.xpath("//input[@class='my-login']")).click();
    }
    }

//    @Then("user should be see {string} error massage")
//    public void userShouldBeSeeErrorMassage(String arg0) throws InterruptedException {
//        String expText = "Invalid email address";
//        Thread.sleep(1000);
//        String actText = driver.findElement(By.id("error-msg")).getText();
//        Assert.assertEquals (expText, actText);
//
//    }
//    @Then("user should see {string} error message.")
//    public void userShouldSeeErrorMessage(String arg0) throws InterruptedException {
//        String businessAct = "Incorrect email or password";
//        Thread.sleep(1000);
//        String developerCodeExp = driver.findElement(By.id("error-msg")).getText();
//        Assert.assertEquals(businessAct, developerCodeExp);
//    }
//
//    @And("user submit email address and password field empty")
//    public void userSubmitEmailAddressAndPasswordFieldEmpty() {
//        driver.findElement(By.name("email")).sendKeys();
//        driver.findElement(By.name("password")).sendKeys();
//    }
//
//
//    @When("user clicks on login button")
//    public void userClicksOnLoginButton() {
//        driver.findElement(By.xpath("//input@class='my-login')")).click();
//    }
//
//    @Then("user should see {string} message.")
//    public void userShouldSeeMessage(String arg0) {
//        driver.switchTo().alert().sendKeys("please fill out this flied");
//        driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
//    }
//}
//




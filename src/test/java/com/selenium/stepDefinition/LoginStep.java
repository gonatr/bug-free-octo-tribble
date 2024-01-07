package com.selenium.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.Hooks;
import org.openqa.selenium.WebDriver;

public class LoginStep {
    private final WebDriver driver;

    public LoginStep() {
        this.driver = Hooks.driver;
    }
    @Given("saya sudah berada dihome page sfa")
    public void sayaSudahBeradaDihomePageSfa() {

    }

    @When("saya input username {string}, password {string} dan klik button sign in")
    public void sayaInputUsernamePasswordDanKlikButtonSignIn(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);
    }

    @Then("Saya sudah berada di dashboard")
    public void sayaSudahBeradaDiDashboard() {
    }
}

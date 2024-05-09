package com.parabank.pe.definitions;

import com.parabank.pe.steps.login.LoginStep;
import com.parabank.pe.steps.login.RegisterStep;
import com.parabank.pe.steps.validations.ValidationStep;
import com.parabank.pe.utilities.website.UserNameGenerator;
import com.parabank.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginDef {
    private static final Logger log = LoggerFactory.getLogger(LoginDef.class);
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("que el usuario se encuentra en el home de la web")
    public void userNavigateTo(){
        url.navigateTo("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("ingresa sus credenciales validas")
    public void userLoginWithValidCredentials(){
        String username = UserNameGenerator.generateUsername();
        login.typeUsername(username);  //usamos el username generado en el test
        login.typePassword("1234567890");
        login.clickLogin();
    }

    @Then("la aplicacion muestra la pantalla de inicio")
    public void systemShowPageInit(){
        Assert.assertTrue(validate.titleIsVisible());
    }
}

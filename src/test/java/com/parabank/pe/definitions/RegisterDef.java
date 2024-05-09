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

public class RegisterDef {
    private static final Logger log = LoggerFactory.getLogger(LoginDef.class);
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    RegisterStep register;

    @Steps(shared = true)
    ValidationStep validate;


    @When("selecciona la opción de nuevo registro")
    public void userClickRegister(){
        login.clickNewregister();
    }

    @Then("el usuario ingresara sus datos para el registro")
    public String userRegisterWithValidCredentials() {   //Cambiamos a public String para retornar el username
        String username = UserNameGenerator.generateUsername();
        register.typeFirstname("Brandon");
        register.typeLastname("Luna Rojas");
        register.typeAddress("Distrito Vegueta Jose Olaya");
        register.typeCity("Lima");
        register.typeState("Lima");
        register.typeZipcode("15135");
        register.typePhone("949726093");
        register.typeSsn("123456");
        register.typeUsername(username); //usar un usuario generado por fecha
        register.typePassword("1234567890");
        register.typeRepeatedPassword("1234567890");
        register.clickRegister();
        return username;  //extraemos el username
    }

    @Then("el usuario se registrará correctamente")
    public void systemShowPageInit(){
        Assert.assertTrue(validate.createIsVisible());
    }

}

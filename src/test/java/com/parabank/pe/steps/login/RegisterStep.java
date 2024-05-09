package com.parabank.pe.steps.login;

import com.parabank.pe.pages.login.RegisterPage;
import net.thucydides.core.annotations.Step;

public class RegisterStep extends RegisterPage {

    @Step("Ingresar FirstName")
    public void typeFirstname(String firstname){
        txt_firstname.sendKeys(firstname);
    }

    @Step("Ingresar LastName")
    public void typeLastname(String lastname){
        txt_lastname.sendKeys(lastname);
    }

    @Step("Ingresar Address")
    public void typeAddress(String address){
        txt_address.sendKeys(address);
    }

    @Step("Ingresar City")
    public void typeCity(String city){
        txt_city.sendKeys(city);
    }

    @Step("Ingresar State")
    public void typeState(String state){
        txt_state.sendKeys(state);
    }

    @Step("Ingresar Zipcode")
    public void typeZipcode(String zipcode){
        txt_zipcode.sendKeys(zipcode);
    }

    @Step("Ingresar Phone")
    public void typePhone(String phone){
        txt_phone.sendKeys(phone);
    }

    @Step("Ingresar Ssn")
    public void typeSsn(String ssn){
        txt_ssn.sendKeys(ssn);
    }

    @Step("Ingresar Username")
    public void typeUsername(String username){
        txt_registerusername.sendKeys(username);
    }

    @Step("Ingresar Password")
    public void typePassword(String password){
        txt_registerpassword.sendKeys(password);
    }

    @Step("Reingresar Password")
    public void typeRepeatedPassword(String repeatedpassword){
        txt_repeatedpassword.sendKeys(repeatedpassword);
    }

    @Step("Click en boton login")
    public void clickRegister(){
        btn_register.click();
    }
}

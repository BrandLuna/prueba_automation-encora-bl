package com.parabank.pe.steps.login;

import com.parabank.pe.definitions.LoginDef;
import com.parabank.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {


    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar Contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Click en boton login")
    public void clickLogin(){
        btn_login.click();
    }

    @Step("Click en boton register")
    public void clickNewregister(){
        btn_newregister.click();
    }
}

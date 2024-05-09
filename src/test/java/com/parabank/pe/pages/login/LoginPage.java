package com.parabank.pe.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@name='username']")
    protected WebElementFacade txt_username;

    @FindBy(xpath = "//input[@name='password']")
    protected WebElementFacade txt_password;

    @FindBy(xpath = "//input[@value='Log In']")
    protected WebElementFacade btn_login;

    @FindBy(xpath = "//*[@id='loginPanel']/p[2]/a")
    protected WebElementFacade btn_newregister;
}

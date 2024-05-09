package com.parabank.pe.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//div[@id='leftPanel']/h2")
    protected WebElementFacade lbl_account_services;

    @FindBy(xpath = "//div[@id='rightPanel']/p")
    protected WebElementFacade lbl_created_successfully;

  /*  @FindBy(xpath = "//div[@id='leftPanel']/h2[text()='Account Services']")
    protected WebElementFacade lbl_account_services;

    @FindBy(xpath = "//div[@id='rightPanel']/p[[text()='Your account was created successfully. You are now logged in.']")
    protected WebElementFacade lbl_created_successfully;  */

}

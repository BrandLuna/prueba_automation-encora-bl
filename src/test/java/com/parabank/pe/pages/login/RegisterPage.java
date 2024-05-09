package com.parabank.pe.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {

    @FindBy(id = "customer.firstName")
    protected WebElementFacade txt_firstname;

    @FindBy( id = "customer.lastName")
    protected WebElementFacade txt_lastname;

    @FindBy(id = "customer.address.street")
    protected WebElementFacade txt_address;

    @FindBy( id = "customer.address.city")
    protected WebElementFacade txt_city;

    @FindBy(id = "customer.address.state")
    protected WebElementFacade txt_state;

    @FindBy( id = "customer.address.zipCode")
    protected WebElementFacade txt_zipcode;

    @FindBy(id = "customer.phoneNumber")
    protected WebElementFacade txt_phone;

    @FindBy( id = "customer.ssn")
    protected WebElementFacade txt_ssn;

    @FindBy(id = "customer.username")
    protected WebElementFacade txt_registerusername;

    @FindBy( id = "customer.password")
    protected WebElementFacade txt_registerpassword;

    @FindBy(id = "repeatedPassword")
    protected WebElementFacade txt_repeatedpassword;

    @FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    protected WebElementFacade btn_register;
}

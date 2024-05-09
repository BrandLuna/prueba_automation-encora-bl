package com.parabank.pe.steps.validations;

import com.parabank.pe.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del modulo de account services")
    public Boolean titleIsVisible(){
        return lbl_account_services.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje Your account was created successfully")
    public Boolean createIsVisible(){
        return lbl_created_successfully.isDisplayed();
    }
}

package com.parabank.pe.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class WebSite {
    @Steps(shared = true)
    PageObject parabank;

    public void navigateTo(String url){
        parabank.setDefaultBaseUrl(url);
        parabank.open();
    }
}

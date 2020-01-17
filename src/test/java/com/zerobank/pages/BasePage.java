package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

public void navigateToModule(String accounts){

    WebElement module= Driver.get().findElement(By.linkText(accounts));
    module.click();
}

}

























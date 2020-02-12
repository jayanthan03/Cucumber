package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal{
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement selectHotel;
	
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	
}

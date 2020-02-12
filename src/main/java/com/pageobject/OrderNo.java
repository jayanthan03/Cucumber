package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderNo extends LibGlobal {
	public OrderNo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class=\"disable_text\"])[15]")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

}

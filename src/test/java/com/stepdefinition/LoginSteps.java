package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pageobject.BookHotel;
import com.pageobject.LibGlobal;
import com.pageobject.LoginPage;
import com.pageobject.OrderNo;
import com.pageobject.SearchHotel;
import com.pageobject.SelectHotel;

import cucumber.api.java.en.*;

public class LoginSteps extends LibGlobal {
	@Given("user is on adactin login page")
	public void browserLaunch(){

		getDriver();
		getUrl("https://adactin.com/HotelApp/index.php");
		maximize();		
	}

	@When("user should enter the {string} and {string}")
	public void loginDetails(String s1, String s2) {
		LoginPage p=new LoginPage();
		type(p.getTxtUserName(), s1);
		type(p.getTxtPassword(),s2);
	}

	@When("user should click the login button")
	public void loginButton() {
		LoginPage p=new LoginPage();
        click(p.getLoginBtn());
	}

	@Then("user verify sucess message")
	public void sucessmessage() {
		currenturl();
		System.out.println("Success");
		
	}

	@When("user select the {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_select_the_and_and_and_and_and(String s1, String s2, String s3, String s4, String s5, String s6) {
		SearchHotel sh=new SearchHotel();
		
		selectbyvisibletext(sh.getLoc(), s1);
		selectbyvisibletext(sh.getHotels(), s2);
		selectbyvisibletext(sh.getRoomType(), s3);
		selectbyvisibletext(sh.getRoomNo(), s4);
		selectbyvisibletext(sh.getAdultRoom(), s5);
		selectbyvisibletext(sh.getChildRoom(), s6);
	
	}

	@When("user should click search button")
	public void user_should_click_search_button() {
		SearchHotel sh=new SearchHotel();
		click(sh.getSearch());


		}

	@When("user should click checkbox")
	public void user_should_click_checkbox() {
		
		SelectHotel se=new SelectHotel();
		click(se.getRadio());

	}

	@Then("user should click continue button")
	public void user_should_click_continue_button() {
		
		SelectHotel se=new SelectHotel();
		click(se.getSelectHotel());
	}
	@When("user enter the {string} and {string},{string},{string},{string},{string} , {string} {string},")
	public void user_enter_the_and(String fName, String lName, String addr, String ccNo, String ccType, String eMonth, String eYear, String cvNo) {
 		BookHotel bh=new BookHotel();
 		type(bh.getFirstName(), fName);
		type(bh.getLastName(), lName);
 		type(bh.getAddress(), addr);
 		type(bh.getCc(), ccNo);
 		selectbyvisibletext(bh.getCcType(), ccType);
 		selectbyvisibletext(bh.getCcExpMonth(), eMonth);
 		selectbyvisibletext(bh.getCcExpYear(), eYear);
 		type(bh.getCvv(), cvNo);
 	
	}

	@Then("user should click book now button")
	public void user_should_click_book_now_button() throws InterruptedException {
		
// 		BookHotel bh=new BookHotel();
// 		OrderNo ono=new OrderNo();
// 		click(bh.getBookNow());
// 		Thread.sleep(3000);
//		ono.getOrderNo();
//		String ono1 = ono.getOrderNo().getAttribute("value");
//		System.out.println(ono1);

	}

}

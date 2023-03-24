package com.stedefinition.demoblaze;

import org.openqa.selenium.WebDriver;
import com.base.classes.Base_Class;
import com.runner.demoblaze.Runnerclass_demoblaze;

import demoblaze.pom.com.Demoblaze_Pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefinition_Demoblaze extends Base_Class {

	public WebDriver driver = Runnerclass_demoblaze.driver;
	Demoblaze_Pom demo = new Demoblaze_Pom(driver);

	@Given("user Launch The Url Of Demoblaze Website")
	public void user_launch_the_url_of_demoblaze_website() {
		url(driver, "https://www.demoblaze.com/index.html");
	}

	@When("user Click The Login Button")
	public void user_click_the_login_button() {
		click(demo.getLogin());
		send_keys(demo.getUsername(), "madhavan");
	}

//	@When("user Enter The Username In Username Field")
//	public void user_enter_the_username_in_username_field() {
//		send_keys(demo.getUsername(), "madhavan");
//	}

	@When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {
		send_keys(demo.getPassword(), "madhavan");
	}

	@When("user Click The Log Button")
	public void user_click_the_log_button() {
		click(demo.getLoginbutton());
	}

	@When("user Click The Samsung Mobile In The List")
	public void user_click_the_samsung_mobile_in_the_list() {
		if (refresh()) {
			click(demo.getSamsungs7());
		}

	}

	@When("user Click The Addtocart Button")
	public void user_click_the_addtocart_button() {
		click(demo.getAddtocart());
	}

	@When("user Click The Cart Button In The Top")
	public void user_click_the_cart_button_in_the_top() {
		click(demo.getCart());
	}

	@When("user Click The Placeorder Button")
	public void user_click_the_placeorder_button() {
		click(demo.getPlaceorder());
	}

	@When("user Enter The Name In Name Field")
	public void user_enter_the_name_in_name_field() {
		send_keys(demo.getName(), "madhavan");
	}

	@When("user Enter The Country In Country Field")
	public void user_enter_the_country_in_country_field() {
		send_keys(demo.getCountry(), "india");
	}

	@When("user Enter The City In City Field")
	public void user_enter_the_city_in_city_field() {
		send_keys(demo.getCity(), "chennai");
	}

	@When("user Enter The Creditcard In Creditcard Field")
	public void user_enter_the_creditcard_in_creditcard_field() {
		send_keys(demo.getCreditcard(), "7894561237894561");
	}

	@When("user Enter The Month In Month Field")
	public void user_enter_the_month_in_month_field() {
		send_keys(demo.getMonth(), "10");
	}

	@When("user Enter The Year In Year Field")
	public void user_enter_the_year_in_year_field() {
		send_keys(demo.getYear(), "2023");
	}

	@When("user Click The Purchase Button")
	public void user_click_the_purchase_button() throws InterruptedException {
		Thread.sleep(3000);
		click(demo.getPurchase());
	}

	@When("user Click The Ok Button")
	public void user_click_the_ok_button() throws InterruptedException {
		Thread.sleep(3000);
		click(demo.getOk());
	}



}

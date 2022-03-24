package com.adactin.pom;

import org.openqa.selenium.WebDriver;

import com.adactin.pageobject.HomePage;
import com.adactin.pageobject.LoginPage;

public class PageObjectManager {

	public static WebDriver driver;

	private HomePage hp;
	private LoginPage lp;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}

}

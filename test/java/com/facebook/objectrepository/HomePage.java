package com.facebook.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.stepdefinition.Hook;

public class HomePage {
	public HomePage() { 
		
			PageFactory.initElements(Hook.driver, this);
		}
		@FindBy(xpath="(//a[text()='Add Customer'])[1]")
		private WebElement add;
		
		
		public WebElement getAdd() {
			return add;
		}

	}



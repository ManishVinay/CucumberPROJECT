package com.facebook.stepdefinition;

import java.awt.List;

import com.facebook.objectrepository.CustomerPage;
import com.facebook.objectrepository.HomePage;
import com.facebook.resource.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	HomePage Hp=new HomePage();
	CustomerPage Tc=new CustomerPage();

@Given("User enter into Homepage and click add customer")
public void user_enter_into_Homepage_and_click_add_customer() {
		Hp.getAdd().click();
    
}

@When("user enters required fields and click submit")
public void user_enters_required_fields_and_click_submit(io.cucumber.datatable.DataTable dataTable) {
	java.util.List<String> md = dataTable.asList();
	toFill(Tc.getFn(),md.get(0));
	toFill(Tc.getLn(),md.get(1));
	toFill(Tc.getMail(),md.get(2));
	toFill(Tc.getAddress(),md.get(3));
	toFill(Tc.getPhno(),md.get(4));
}
   


@Then("User navigates into next page and verify it\\")
public void user_navigates_into_next_page_and_verify_it() {
	Tc.getBtn1().click();   
	System.out.println("successfully");
}

@When("User enters required fields and click submit {string} {string}{string}{string}{string}")
public void user_enters_required_fields_and_click_submit(String string, String string2, String string3, String string4, String string5) {
	toFill(Tc.getFn(), string);
	toFill(Tc.getLn(), string2);
	toFill(Tc.getMail(), string3);
	toFill(Tc.getAddress(), string4);
	toFill(Tc.getPhno(), string5);
	
}

@Then("I verify the <status> in step")
public void i_verify_the_status_in_step() {
	System.out.println("Successfully Customer in Homepage");
   
}


}

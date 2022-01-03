package com.mindtree.stepDefination;


import org.apache.log4j.Logger;

import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.Homepage;
import com.mindtree.pageobject.SearchPage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefination {
	PageObjectManager pageManager;
	Homepage homepage;
	SearchPage searchpage;
	Logs loggerUtil;
	Logger log;

@Given("Go to Gillete Website and Click on mach3 under products")
public void go_to_gillete_website_and_click_on_mach3_under_products() {
    // Write code here that turns the phrase above into concrete actions
	loggerUtil = new Logs();
	log = loggerUtil.createLog("Test1");
	pageManager = new PageObjectManager();
	homepage = pageManager.getHomePage();
	log.info("Website opened and FAQ closed");
}

@When("I Click on Products")
public void i_click_on_products() {
    // Write code here that turns the phrase above into concrete actions
   homepage.clickProducts();
}

@When("I click on Mach3")
public void i_click_on_mach3() {
    // Write code here that turns the phrase above into concrete actions
    homepage.clickMach();
}

@Then("Validate if Gillete Mach3 Turbo is present under Our products")
public void validate_if_gillete_mach3_turbo_is_present_under_our_products() {
    // Write code here that turns the phrase above into concrete actions
    homepage.checkInfo();
}

@Given("Go to Gillette Website and click on search")
public void go_to_gillette_website_and_click_on_search() {
    // Write code here that turns the phrase above into concrete actions
	loggerUtil = new Logs();
	log = loggerUtil.createLog("Test");
	pageManager = new PageObjectManager();
	homepage = pageManager.getHomePage();
	log.info("Website opened");
}

@When("Click on search option")
public void click_on_search_option() {
    // Write code here that turns the phrase above into concrete actions
   homepage.clickSearch();
}

@Then("Enter Razor in search box")
public void enter_razor_in_search_box() {
    // Write code here that turns the phrase above into concrete actions
    searchpage.searchB();
}

@Then("Verify if Results for Razor appears or not")
public void verify_if_results_for_razor_appears_or_not() {
    // Write code here that turns the phrase above into concrete actions
   searchpage.checkInfo();
}


@Given("Go to Gillete Company Website")
public void go_to_gillete_company_website() {
    // Write code here that turns the phrase above into concrete actions
	loggerUtil = new Logs();
	log = loggerUtil.createLog("Test");
	pageManager = new PageObjectManager();
	homepage = pageManager.getHomePage();
	log.info("Website opened");
}

@When("Click on ?Styling? under ?Learn? in footer")
public void click_on_styling_under_learn_in_footer() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Verify if we have the text ?Facial Hair Styles: The Anchor Beard? under list of articles under styling.")
public void verify_if_we_have_the_text_facial_hair_styles_the_anchor_beard_under_list_of_articles_under_styling() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}

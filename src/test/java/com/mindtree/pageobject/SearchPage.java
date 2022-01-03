package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.uistore.SearchPageUI;
import com.mindtree.utility.Logs;


public class SearchPage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	public SearchPage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public  void searchB() {
		try {
			helper.sendText(HomePageUI.searchBox, "Razor");
			log.debug("Razor sent");
			helper.actionClick(SearchPageUI.button);
			log.debug("Razor clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
		
	}
	public void checkInfo() {
		try {
			helper.getText(SearchPageUI.info).compareTo("Results For \"Razor\"");
			log.debug("Info found");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		};
		
	}

	
}

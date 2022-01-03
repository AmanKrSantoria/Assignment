package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.utility.Logs;

public class Homepage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	public Homepage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void clickProducts() {
		try {
			log = loggerUtil.createLog("Homepage.java");
			helper.actionClick(HomePageUI.products);
			log.debug("Products clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}	
	}

	
	public  void clickMach() {
		try {
			helper.actionClick(HomePageUI.mach);
			log.debug("Mach clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
		
	}
	
	public  void clickSearch() {
		try {
			helper.actionClick(HomePageUI.search);
			log.debug("Search clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
		
	}
	public  void clickStyle() {
		try {
			helper.actionClick(HomePageUI.style);
			log.debug("Style clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
		
	}

	
	public void checkInfo() {
		try {
			helper.getText(HomePageUI.info).compareTo("With sharper, Turbo cutting blades*, the Gillette MACH3 Turbo razor is engineered to last for 15 comfortable shaves");
			log.debug("Gillette Mach3 Turbo found");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		};
		
	}

	public void checkText() {
		try {
			helper.getText(HomePageUI.Text).compareTo("Facial Hair Styles: The Anchor Beard");
			log.debug("Text found");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		};
		
	}
	
}




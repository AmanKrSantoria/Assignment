package com.mindtree.manager;

import com.mindtree.pageobject.Homepage;
import com.mindtree.pageobject.Servicesection;
import com.mindtree.pageobject.corporatemission;
import com.mindtree.pageobject.SearchPage;


/** This class is to manage the objects of different pages
 
 *
 */
public class PageObjectManager extends WebDriverManager{
	private Homepage homePage;
	private corporatemission corporatemission;
	private SearchPage searchcarpage;
	private Servicesection Servicesection;

	

	public Homepage getHomePage() {
		return(homePage==null) ? homePage = new Homepage():homePage;
	}
	public corporatemission getcorporatemission() {
		return(corporatemission==null) ? corporatemission = new corporatemission():corporatemission;
	}
	public SearchPage getsearchcarpage() {
		return(searchcarpage==null) ? searchcarpage = new SearchPage():searchcarpage;
	}
	public Servicesection getServicesection() {
		return(Servicesection==null) ? Servicesection = new Servicesection():Servicesection;
	}

}

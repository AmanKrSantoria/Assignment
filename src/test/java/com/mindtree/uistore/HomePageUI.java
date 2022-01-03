package com.mindtree.uistore;

import org.openqa.selenium.By;

public class HomePageUI {
	public static By products =By.xpath("//*[@id=\'headerMenu\']/div/nav/div/div[2]/button/span");
	public static By mach = By.xpath("//*[@id=\'headerMenu\']/div/nav/div/div[2]/div/div/div/div/div[1]/div[1]/a[3]");
	public static By info = By.xpath("//*[@id=\'main-content\']/div/div[4]/div/div[1]/div/div[1]/div/div");
	public static By search = By.xpath("//*[@id=\'searchIconId\']");
	public static By searchBox = By.xpath("//*[@id=\'search-box-input\']");
	public static By style = By.xpath("//*[@id=\'footerContent\']/div/div[1]/div[1]/ul/li[2]/a");
	public static By Text = By.xpath("//*[@id=\'wrap\']/div[2]/div[3]/ul/li[3]/div/div/a/div[2]/h3");

}

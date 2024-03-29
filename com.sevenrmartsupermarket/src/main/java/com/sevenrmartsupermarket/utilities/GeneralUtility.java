package com.sevenrmartsupermarket.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;

public class GeneralUtility {
	
	 public String get_Attribute(WebElement element,String attribute) {
		 return element.getAttribute(attribute);
	}
	 
	
	 public List<String> getTextofElements(List<WebElement> elements) {
		 List<String>data=new ArrayList<String>();
		 for(WebElement element : elements){ 
			 data.add(element.getText());
			 }
		 return data;
	 }
	 public String get_CssValue(WebElement element,String property) {
		 return element.getCssValue(property);
	}
	public static String get_RandomFirstname() {
		Faker faker=new Faker();
		return faker.name().firstName();
	}
	public static Number get_RandomNumber() {
		Faker faker=new Faker();
		return faker.number();
	}
	public String getTabTitle(WebDriver driver) {
		return driver.getTitle();
	}
}

package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utilities.BaseClass;

public class FormsPageTemp extends BaseClass {
	//find all elements with @FindBy

	@FindBy(xpath = "//span[contains(text(),'Forms')]")
	WebElement formsLink;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement newButton;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement nameField;
	
	@FindBy(xpath = "//textarea[@name='intro']")
	WebElement introTextField;
	
	@FindBy (xpath = "//textarea[@name='outro']")
	WebElement completionTextField;
	
	@FindBy (xpath = "//label[contains(text(),'Active')]")
	WebElement activeCheckBox;
	
	@FindBy (xpath = "//button[@class='ui linkedin button']")
	WebElement saveButton;
	
	@FindBy(xpath = "//tr[1]//td[6]//div[1]//button[1]//i[1]")
	WebElement delete;
	
	@FindBy(xpath = "//button[@class='ui button']")
	WebElement  deleteButton;
	
//	@FindBy(xpath = "//tr[1]//td[1]")
//	WebElement checkbox;
//	
//	public void checkBox() {
//		click (checkbox);
//	}
	
	
	
	public void clickDeleteButton() {
		click (deleteButton);
	}
	
	public void clickDelete() {
		click(delete);
	}
	
	//Create the constructor of the class
	public FormsPageTemp() {
		PageFactory.initElements(driver, this);
	}
	
	//create a method for your elemetns that found 
	public void clickFormsLink() {
		click(formsLink);
	}
	
	public void clickNewButton() {
		click(newButton);
	}
	
	public void enterName(String value) {
		enter(nameField, value);
	}
	
	public void enterIntroText(String value) {
		enter(introTextField, value);
	}
	
	public void enterCompletionText(String value) {
		enter(completionTextField, value);
	}
	
	public void clickActiveCheckBox() {
		click(activeCheckBox);
	}
	
	public void clickSaveButton() {
		click(saveButton);
	}
}

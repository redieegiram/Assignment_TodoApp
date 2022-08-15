package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	
	private By headerMessage = By.xpath("//h1");
	private By toDoInput = By.xpath("//input[@class='todo-name-input']");
	private By addButton = By.xpath("//button[@class='form-button form-button-add']");
	private By clearButton = By.xpath("//button[@class='form-button form-button-clear']");
	private By toDoList = By.xpath("//ul[@class=\"todo-list\"]/li");
	
    public void launchURL(String url){
        driver.get(url);
    }

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getheaderMessage() {
		return driver.findElement(headerMessage).getText();
	}
	public void entertoDoInput(String tname) {
		driver.findElement(toDoInput).sendKeys(tname);
	}
	
	
	public void addButtonClick() {
		driver.findElement(addButton).click();
	}
	

	public void clearButtonClick() {
		driver.findElement(clearButton).click();
	}
	

	public int lengthofList() {
		List<WebElement> todoList = driver.findElements(toDoList);
		return todoList.size();
	}
	
}

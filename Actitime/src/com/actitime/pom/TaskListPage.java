package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerNametbx;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescriptiontbx;
	@FindBy(xpath = "//div[@class='comboboxButton']//div[@class='dropdownButton']")
	private WebElement selectCompanyDropdownBtn;
	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompanyBtn;
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomerName;
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newprojectBtn;
	@FindBy(xpath = "//input[@placeholder='Enter Project Name' and @class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterProjectNametbx;
	@FindBy(xpath = "//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement selectCustomerDropdown;
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement addProjectDescriptionTbx;
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjectBtn;
	@FindBy(xpath = "//div[@class='searchItemList']/div[text()='Our company']")
	private WebElement ourCompanyBtn;
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualProjectName;
	@FindBy(xpath = "//div[text()='+ New Tasks']")
	private WebElement newTasksBtn;
	@FindBy(xpath = "//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")
	private WebElement selectCustomerTasksDD;
	@FindBy(xpath = "//div[@class='searchItemList']//div[text()='Our company']")
	private WebElement ourCompanyTasksBtn;
	@FindBy(xpath = "//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")
	private WebElement selectProjectTasksDD;
	@FindBy(xpath = "//div[text()='Accounting' and @class='itemRow cpItemRow ']")
	private WebElement accountingBtn;
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement enterTaskNameTbx;
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createTasksBtn;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getEnterCustomerNametbx() {
		return enterCustomerNametbx;
	}

	public WebElement getEnterCustomerDescriptiontbx() {
		return enterCustomerDescriptiontbx;
	}

	public WebElement getSelectCompanyDropdownBtn() {
		return selectCompanyDropdownBtn;
	}

	public WebElement getBigBangCompanyBtn() {
		return bigBangCompanyBtn;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomerName() {
		return actualCustomerName;
	}

	public WebElement getNewprojectBtn() {
		return newprojectBtn;
	}

	public WebElement getEnterProjectNametbx() {
		return enterProjectNametbx;
	}

	public WebElement getSelectCustomerDropdown() {
		return selectCustomerDropdown;
	}

	public WebElement getAddProjectDescriptionTbx() {
		return addProjectDescriptionTbx;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getOurCompanyBtn() {
		return ourCompanyBtn;
	}

	public WebElement getActualProjectName() {
		return actualProjectName;
	}

	public WebElement getNewTasksBtn() {
		return newTasksBtn;
	}

	public WebElement getSelectCustomerTasksDD() {
		return selectCustomerTasksDD;
	}

	public WebElement getOurCompanyTasksBtn() {
		return ourCompanyTasksBtn;
	}

	public WebElement getSelectProjectTasksDD() {
		return selectProjectTasksDD;
	}

	public WebElement getAccountingBtn() {
		return accountingBtn;
	}

	public WebElement getEnterTaskNameTbx() {
		return enterTaskNameTbx;
	}

	public WebElement getCreateTasksBtn() {
		return createTasksBtn;
	}
}

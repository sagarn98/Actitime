package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplimentation.class)
public class ProjectModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("create project", true);
		HomePage h = new HomePage(driver);
		TaskListPage t = new TaskListPage(driver);
		FileLib f = new FileLib();
		Actions a=new Actions(driver);
		String projectName = f.getExcelData("CreateProject", 1, 3);
		String projectDescription = f.getExcelData("CreateProject", 1, 4);
		h.setTaskTab();
		t.getAddNewBtn().click();
		t.getNewprojectBtn().click();
		t.getEnterProjectNametbx().sendKeys(projectName);
		t.getAddProjectDescriptionTbx().sendKeys(projectDescription);
		t.getSelectCompanyDropdownBtn().click();
		WebElement ourCompany = t.getOurCompanyBtn();
		a.moveToElement(ourCompany).click().perform();
		t.getCreateProjectBtn().click();
		Thread.sleep(3000);
		String actualProjectName = t.getActualProjectName().getText();
		Assert.assertEquals(actualProjectName, projectName);

	}
}

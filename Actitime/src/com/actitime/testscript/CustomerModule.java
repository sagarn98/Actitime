package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplimentation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("createcustomer", true);
		HomePage h = new HomePage(driver);
		FileLib f = new FileLib();
		String customerName = f.getExcelData("CreateCustomer", 1, 3);
		String customerDescription = f.getExcelData("CreateCustomer", 1, 4);
		TaskListPage t = new TaskListPage(driver);
		
		h.setTaskTab();
		t.getAddNewBtn().click();
		t.getNewCustomerBtn().click();
		t.getEnterCustomerNametbx().sendKeys(customerName);
		t.getEnterCustomerDescriptiontbx().sendKeys(customerDescription);
		t.getSelectCompanyDropdownBtn().click();
		t.getBigBangCompanyBtn().click();
		t.getCreateCustomerBtn().click();
		Thread.sleep(3000);
		String actualCustomerName = t.getActualCustomerName().getText();
		Assert.assertEquals(actualCustomerName, customerName);
	}
}

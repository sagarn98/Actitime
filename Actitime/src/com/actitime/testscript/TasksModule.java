package com.actitime.testscript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplimentation.class)
public class TasksModule extends BaseClass{
@Test
public void testCreateTasks() throws InterruptedException {
	HomePage h=new HomePage(driver);
	TaskListPage t=new TaskListPage(driver);
	FileLib f=new FileLib();
	h.setTaskTab();
	t.getAddNewBtn().click();
	t.getNewTasksBtn().click();
	Thread.sleep(3000);
	t.getSelectCustomerTasksDD().click();
	Actions a=new Actions(driver);
	WebElement ourCompany = t.getOurCompanyTasksBtn();
	Thread.sleep(3000);
	a.moveToElement(ourCompany).click().perform();
	Thread.sleep(3000);
	WebElement accounting = t.getSelectProjectTasksDD();
	Thread.sleep(3000);
	a.moveToElement(accounting).click().perform();
	Thread.sleep(3000);
	t.getAccountingBtn().click();
	Thread.sleep(3000);
	t.getEnterTaskNameTbx().sendKeys("Training Institute");
	Thread.sleep(3000);
	t.getCreateTasksBtn();
	Thread.sleep(3000);
	 
}
}

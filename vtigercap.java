package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vtigercap {
	public static void main(String[]args) throws InterruptedException
	{
		ChromeDriver c=new ChromeDriver();
		c.get("https://demo.vtiger.com/vtigercrm/index.php ");
		c.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);
		c.findElement(By.cssSelector("span[class='app-icon fa fa-bars']")).click();
		Thread.sleep(2000);
		WebElement marketinng=c.findElement(By.xpath("//span[contains(text(),'MARKETING')]"));
		Actions a=new Actions(c);
		a.moveToElement(marketinng).perform();
		Thread.sleep(2000);
		c.findElement(By.xpath("//span[contains(text(),' Campaigns')]")).click();
		Thread.sleep(2000);
	c.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
	Thread.sleep(2000);
	c.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("abc");
	c.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("0");
	c.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("7");
	c.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("wmd");
	c.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("0%");
	c.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("200");
	c.findElement(By.id("Campaigns_editView_fieldName_closingdate")).sendKeys("3/10/23");
	}
}

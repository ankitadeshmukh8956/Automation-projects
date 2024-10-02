package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerinventary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.get("https://demo.vtiger.com/vtigercrm/index.php ");
		Thread.sleep(2000);
        c.findElement(By.xpath("//button[text()='Sign in']")).click();
        Thread.sleep(2000);
		c.findElement(By.cssSelector("span[class='app-icon fa fa-bars']")).click();
		Thread.sleep(2000);
	    c.findElement(By.xpath("//span[text()='INVENTORY']")).click();
	}

}


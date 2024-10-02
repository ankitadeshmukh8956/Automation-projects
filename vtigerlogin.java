package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.get("https://demo.vtiger.com/vtigercrm/index.php ");
		//Thread.sleep(2000); 
        c.findElement(By.xpath("//button[text()='Sign in']")).click();
        //Thread.sleep(2000);
        String url=c.getCurrentUrl();
        //System.out.println(url);
	
	 String exceptedurl="https://demo.vtiger.com/vtigercrm/index.php";
	 if(url.equals(exceptedurl))
	 {
		 System.out.println("true");
}
	 else
	 {
		 System.out.println("false");
	 }
		 System.out.println(url);
	 }


} 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoAutomation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//mendapatkan link web yang ingin dites
		driver.get("https://github.com/");
		
		//mencari element dengan nama class
		WebElement searchInput=driver.findElement(By.className("form-control"));
		
		//search selenium
		searchInput.sendKeys("Selenium");
		
		//menekan tombol enter
		searchInput.sendKeys(Keys.ENTER);
		
		//mendapatkan element search dengan name
		WebElement searchInput2 = driver.findElement(By.name("q"));
		
		//menghapus inputan sebelumnya
		searchInput2.clear();
		
		//mengetik inputan yang baru
		searchInput2.sendKeys("selenium web");
		
		//menekan tombol enter
		searchInput2.sendKeys(Keys.ENTER);
		
		//membuka repo yang paling atas
		driver.findElement(By.xpath("//a[@href='/robotframework/SeleniumLibrary']")).click();

	}
}

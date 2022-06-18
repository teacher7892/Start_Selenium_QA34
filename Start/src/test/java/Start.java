import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
   WebDriver wd;
   @Test
   public void start (){
      wd=new ChromeDriver();
      wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
     // wd.navigate.to("https://contacts-app.tobbymarshall815.vercel.app/home");
      wd.navigate().back();
      wd.navigate().forward();
      wd.navigate().refresh();

      wd.close(); //one tab
      //wd.quit(); //all tabs
   }

   public void firstTest (){
      wd=new ChromeDriver();
      wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
      WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
      loginTab.click();

      WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
      emailTextBox.click();
      emailTextBox.clear();
      emailTextBox.sendKeys("felicita92@mail.com");

      WebElement password = wd.findElement(By.cssSelector("[placeholder='Password']"));
      password.click();
      password.clear();
      password.sendKeys("Felicita92");

      WebElement loginButton = wd.findElement(By.cssSelector("button"));
      loginButton.click();




   }

}

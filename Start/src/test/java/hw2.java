import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork2 {

    WebDriver wd = new ChromeDriver();
    //wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");

    @Test
    public void fromCssToxPath(){
        /*
        wd.findElement(By.cssSelector("a[href]"));
        wd.findElement(By.cssSelector("[href ^='/ho']"));
        wd.findElement(By.cssSelector("div.focus"));
        wd.findElement(By.cssSelector("input[type='text']"));
        wd.findElement(By.cssSelector("div #host"));
        wd.findElement(By.cssSelector("table#contry tr:nt-child(3)) td:last-child"));
        wd.findElement(By.cssSelector("div#idName li:first-child"));
        wd.findElement(By.cssSelector("div#sort>div:nth-child(2)"));
         */
        wd.findElement(By.xpath("//a[@href]"));
        wd.findElement(By.xpath("//*[starts-with (@href,'/ho')]"));
        wd.findElement(By.xpath("//div[@focus]"));
        wd.findElement(By.xpath("//*[contains(@type,'text')]"));
        wd.findElement(By.xpath("//div[@id='host']"));
        wd.findElement(By.xpath("//table[@country]//tr[last()]"));
        wd.findElement(By.xpath("//div[@id='Name']//li[first()]"));
        wd.findElement(By.xpath("//div[@sort]//div[nth-child(2)]"));

    }


    @Test
    public void fromXPathToCss(){
        /*
        wd.findElement(By.xpath("//*[@id='host"));
        wd.findElement(By.xpath("//button[@class='submit']"));
        wd.findElement(By.xpath("//div/div/img[@src='paris.jpg']"));
        wd.findElement(By.xpath("//div[@class='first' and @class='list']"));
        wd.findElement(By.xpath("//div[contains(@class,'st']"));
        wd.findElement(By.xpath("//div[@id=’idName’]//h1[last()]"));
        wd.findElement(By.xpath("//table[@id]//tr[last()]"));
        wd.findElement(By.xpath("//a[starts-with(@id,'ret')]"));
         */
        wd.findElement(By.cssSelector("div #host"));
        wd.findElement(By.cssSelector("button[class='submit']"));
        wd.findElement(By.cssSelector("div.div.img[src='paris.jpg']"));
        wd.findElement(By.cssSelector("div[class='first' and class='list']"));
        wd.findElement(By.cssSelector("div[class='st']"));
        wd.findElement(By.cssSelector("div#idName h1[last-child]"));
        wd.findElement(By.cssSelector("table# tr:last-child"));
        wd.findElement(By.cssSelector("a#ret"));

    }
}
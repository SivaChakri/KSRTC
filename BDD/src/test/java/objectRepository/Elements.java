package objectRepository;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Elements {

public static WebElement email(WebDriver d1) {
return d1.findElement(By.id("email"));
}



public static WebElement fullName(WebDriver d1) {
return d1.findElement(By.id("fullName"));
}


public static WebElement moblieNumber(WebDriver d1) {
return d1.findElement(By.id("mobileNo"));
}


public static WebElement add(WebDriver d1) {
return d1.findElement(By.xpath("//input[@type='button']"));
}


public static WebElement userName(WebDriver d1) {
return d1.findElement(By.id("userName"));
}


public static WebElement password(WebDriver d1) {
return d1.findElement(By.id("password"));
}


public static WebElement login(WebDriver d1) {
return d1.findElement(By.id("submitBtn"));
}




public static WebElement fromPlace(WebDriver d1) {
return d1.findElement(By.id("fromPlaceName"));
}



public static WebElement toPlaceName(WebDriver d1) {
return d1.findElement(By.id("toPlaceName"));
}

}
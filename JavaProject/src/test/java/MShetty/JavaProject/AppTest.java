package MShetty.JavaProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class AppTest {



public static void main(String[] args) throws Exception {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

         ChromeOptions options = new ChromeOptions();

         options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.chrome.driver", "D:\\SW\\drivers\\chromedriver-win64\\chromedriver.exe");

WebDriver driver = new ChromeDriver(options);


//Microsoft Edge

//System.setProperty("webdriver.edge.driver", "D:\\SW\\drivers\\edgedriver_win64\\msedgedriver.exe");

//WebDriver driver2 = new EdgeDriver();

driver.get("https://rahulshettyacademy.com/");
Thread.sleep(20);

System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

//driver.close();

//driver.quit();



}



}


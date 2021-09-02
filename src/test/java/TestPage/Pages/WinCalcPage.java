package TestPage.Pages;

import BaseApp.BaseApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class WinCalcPage {

    WebDriver driver = BaseApp.driver;

    public WebElement result_field = driver.findElement(By.id("CalculatorResults"));
    public WebElement close_btn    = driver.findElement(By.id("Close"));

    public WebElement clear_btn       = driver.findElement(By.id("clearButton"));
    public WebElement clear_entry_btn = driver.findElement(By.id("clearEntryButton"));
    public WebElement backspace_btn   = driver.findElement(By.id("backSpaceButton"));

    public WebElement plus_btn     = driver.findElement(By.id("plusButton"));
    public WebElement minus_btn    = driver.findElement(By.id("minusButton"));
    public WebElement divide_btn   = driver.findElement(By.id("divideButton"));
    public WebElement multiply_btn = driver.findElement(By.id("multiplyButton"));
    public WebElement equal_btn    = driver.findElement(By.id("equalButton"));

    public ArrayList<WebElement> NumButtons = new ArrayList<>();
    public void add_num_btn_to_list(){
        NumButtons.add(driver.findElement(By.id("num0Button")));
        NumButtons.add(driver.findElement(By.id("num1Button")));
        NumButtons.add(driver.findElement(By.id("num2Button")));
        NumButtons.add(driver.findElement(By.id("num3Button")));
        NumButtons.add(driver.findElement(By.id("num4Button")));
        NumButtons.add(driver.findElement(By.id("num5Button")));
        NumButtons.add(driver.findElement(By.id("num6Button")));
        NumButtons.add(driver.findElement(By.id("num7Button")));
        NumButtons.add(driver.findElement(By.id("num8Button")));
        NumButtons.add(driver.findElement(By.id("num9Button")));
    }

    public ArrayList<WebElement> getNumButtons() {
        return NumButtons;
    }

}

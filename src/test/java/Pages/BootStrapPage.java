package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrapPage extends BaseTest {

@FindBy(css = "div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.row div.dual-list.list-left.col-md-5:nth-child(4) div.well.text-right div.row div.col-md-10 div.input-group > input.form-control")
        WebElement textbox_ele;

//@FindBy(css = "div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.row div.dual-list.list-left.col-md-5:nth-child(4) div.well.text-right ul.list-group > li.list-group-item.active:nth-child(1)")
//WebElement bootstrap_ele;

@FindBy(xpath ="//span[@class='glyphicon glyphicon-chevron-right']")
WebElement arrow_ele;

@FindBy(css="div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.row div.dual-list.list-right.col-md-5:nth-child(6) div.well ul.list-group > li.list-group-item.active:nth-child(6)")
WebElement right_ele;

@FindBy(xpath="//a[contains(text(),'Demo Home')]")
WebElement home;

        public BootStrapPage(){
        PageFactory.initElements(driver,this);
    }


    public void bootstrapCase1() throws InterruptedException {
               Thread.sleep(2000);
        textbox_ele.sendKeys("bootstrap");
      /*  try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }*/
        WebDriverWait wait = new WebDriverWait(driver, 100);
    //    SeleniumWait.withDriver(driver).withTimeOut(15).forElementToClick(element);
  WebElement  bootstrap_ele =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.row div.dual-list.list-left.col-md-5:nth-child(4) div.well.text-right ul.list-group > li.list-group-item.active:nth-child(1)")));
        bootstrap_ele.click();
        Thread.sleep(2000);
        arrow_ele.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
       //WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(right_ele));
        System.out.println(right_ele.getText().toString());
        Thread.sleep(2000);
    }

    public HomePage bootstrapCase2(){
            home.click();
            return new HomePage();
    }
}

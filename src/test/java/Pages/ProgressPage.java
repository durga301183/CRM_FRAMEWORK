package Pages;

import BaseTest.BaseTest;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class ProgressPage extends BaseTest {

    @FindBy(xpath = "//button[@id='downloadButton']")
    WebElement dButton;

    @FindBy(xpath = "//button[contains(text(),'Close')]")
    WebElement closebut;

    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Others')]")
    WebElement other_but;


    @FindBy(css = "div.container-fluid:nth-child(1) div.row:nth-child(2) nav.navbar.navbar-default div.container div.collapse.navbar-collapse ul.nav.navbar-nav.navbar-right:nth-child(2) li.dropdown.open:nth-child(4) ul.dropdown-menu li:nth-child(1) > a:nth-child(1)")
    WebElement drag_but;

    @FindBy(linkText = "Table")
    WebElement table_ele;

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Table Data Search')]")
    WebElement table_searchele1;

    public ProgressPage() {

        PageFactory.initElements(driver, this);
    }

    public void progressCase1() throws InterruptedException {
       Thread.sleep(2000);
        dButton.click();
        //creating webdriver wait instance
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //specify the condition to wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='progress-label']"))).getText().equalsIgnoreCase("Complete!");
        Thread.sleep(10000);
        closebut.click();
    }

    public TablePage progressCase2() throws InterruptedException {
        other_but.click();
        drag_but.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement source = driver.findElement(By.xpath("//span[contains(text(), 'Draggable 1')]"));
        WebElement target = driver.findElement(By.cssSelector("#mydropzone"));

        Actions drag = new Actions(driver);
        drag.dragAndDrop(source, target).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppedlist")));
        Thread.sleep(3000);
        table_ele.click();
        table_searchele1.click();
        return PageFactory.initElements(driver, TablePage.class);
    }
}




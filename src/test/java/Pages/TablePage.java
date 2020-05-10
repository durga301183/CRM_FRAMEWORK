package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TablePage extends BaseTest {

    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Table')]")
    WebElement table_ele;

    @FindBy(xpath = "//input[@id='task-table-filter']")
    WebElement table_searchele2;

    @FindBy( xpath ="//a[@class='dropdown-toggle'][contains(text(),'List Box')]")
    WebElement table_dropele;

    @FindBy(xpath="//a[@class='dropdown-toggle'][contains(text(),'List Box')]")
    WebElement listbox_ele;

    @FindBy(xpath ="//ul[@class='dropdown-menu']//a[contains(text(),'Bootstrap List Box')]")
    WebElement bootstarp_ele;

    public TablePage() {
        PageFactory.initElements(driver, this);
    }

    public void tableCase1() throws InterruptedException {
        //   table_ele.click();
     //   table_searchele2.sendKeys("qa");
        Thread.sleep(2000);

        List<WebElement> task = driver.findElements(By.xpath("//table[1]/tbody/tr/td[2]"));
        List<WebElement> status = driver.findElements(By.xpath("//table[1]/tbody/tr/td[4]"));

        for (int i = 0; i <= task.size()-5; i++) {
            System.out.println(task.get(i).getText() + " " + status.get(i).getText());
            System.out.println(task.size());
        }

    }

    public BootStrapPage tableCase2(){
       // table_dropele.click();
        listbox_ele.click();
        bootstarp_ele.click();
        return PageFactory.initElements(driver, BootStrapPage.class);

        }
}





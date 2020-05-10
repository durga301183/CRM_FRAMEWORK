package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchPage extends BaseTest {

    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Progress Bars')]")
    WebElement progressbar_but;

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Download Progress bars')]")
    WebElement download_ele;

    //Initialising the PageObjects
    public LaunchPage() {
        PageFactory.initElements(driver, this);
    }

    public ProgressPage launchcase() throws InterruptedException {
        progressbar_but.click();
        download_ele.click();

        return  PageFactory.initElements(driver, ProgressPage.class);
}


    }

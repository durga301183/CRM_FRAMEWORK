package Tests;

import BaseTest.BaseTest;
import Pages.BootStrapPage;
import Pages.LaunchPage;
import Pages.ProgressPage;
import Pages.TablePage;
import Sync_Utils.Test_Util;
import org.testng.annotations.*;

public class Test_AllPages extends BaseTest {
    LaunchPage launchpage;
    ProgressPage progresspage;
    TablePage  tablepage;
    Test_Util test_util;
    BootStrapPage bootstrappage;

    public Test_AllPages() {
        super();
    }

    @BeforeMethod

        public void setup ()  {
            initialization();
            launchpage = new LaunchPage();
            test_util =new Test_Util();
            progresspage =new ProgressPage();
            tablepage =new TablePage();
            bootstrappage =new BootStrapPage();

    }

      //  @Test(priority = 2)
        public void TestCase1() throws InterruptedException {
            launchpage.launchcase();
            progresspage.progressCase1();
            progresspage.progressCase2();
        }

            @Test
            public void TestCase2() throws InterruptedException {
            tablepage.tableCase1();
            tablepage.tableCase2();
            bootstrappage.bootstrapCase1();
            bootstrappage.bootstrapCase2();

        }

        @AfterMethod
        public void tearDown(){
        driver.quit();
        }
    }

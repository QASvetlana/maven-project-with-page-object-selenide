package com.scooter;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

abstract public class BaseTest {

    public void setUp() {
        //   ChromeOptions options = new ChromeOptions();
        // System.setProperty("webdriver.chrome.driver", "chromedriver98.exe");
        //options.setBinary("C:/Users/Sve79/AppData/Local/Yandex/YandexBrowser/Application/browser.exe");
        // WebDriver driver = new ChromeDriver(options);
        // WebDriverRunner.setWebDriver(driver);

        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
    }

    @Before
    public void init() {
        setUp();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}









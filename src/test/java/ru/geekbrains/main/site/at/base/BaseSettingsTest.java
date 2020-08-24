package ru.geekbrains.main.site.at.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BaseSettingsTest {
    protected ChromeDriver driver;
    protected WebDriverWait wait30second;

    @BeforeEach
    public void beforeAllTEst(){
        System.setProperty("webdriver.chrome.driver","src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get("https://geekbrains.ru/career");
        wait30second = new WebDriverWait(driver, 30);
    }
    @AfterEach
    public void afterAllTest(){
        driver.quit();
    }
}

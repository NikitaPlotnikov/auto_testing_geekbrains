package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;

//        Перейти на сайт https://geekbrains.ru/career
//        Нажать на кнопку Вебинары
//        Проверить что страница Вебинары открылась
//        Повторить для
//        Тесты
//        Блог
//        Форум
//        Курсы
//        Вынести проверку каждой страницы в отдельный тест
//        Реализовать проверку отображения блоков Header и Footer на каждой странице сайта (как минимум самого блока)



public class NavigationTest extends BaseSettingsTest{

    @Test
    public void checkContentPagesEvents(){
        driver.findElement(By.cssSelector("header div a [class=\"nav-icon js-nav-icon\"]")).click();
        driver.findElement(By.cssSelector("ul [href=\"/events\"]")).click();
        WebElement TitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Вебинары", TitlePage.getText());
        WebElement pageFooter = driver.findElement(By.cssSelector("footer [class=\"site-footer__content\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageFooter));
        WebElement pageHeader = driver.findElement(By.cssSelector("div [id=\"top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageHeader));
    }

    @Test
    public void checkContentPagesTests(){
        driver.findElement(By.cssSelector("header div a [class=\"nav-icon js-nav-icon\"]")).click();
        driver.findElement(By.cssSelector("ul [href=\"/tests\"]")).click();
        WebElement TitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Тесты", TitlePage.getText());
        WebElement pageFooter = driver.findElement(By.cssSelector("footer [class=\"site-footer__content\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageFooter));
        WebElement pageHeader = driver.findElement(By.cssSelector("div [id=\"top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageHeader));
    }

    @Test
    public void checkContentPagesPosts(){
        driver.findElement(By.cssSelector("header div a [class=\"nav-icon js-nav-icon\"]")).click();
        driver.findElement(By.cssSelector("ul [href=\"/posts\"]")).click();
        WebElement TitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Блог", TitlePage.getText());
        WebElement pageFooter = driver.findElement(By.cssSelector("footer [class=\"site-footer__content\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageFooter));
        driver.findElement(By.cssSelector("div [class=\"c9e3 _311d\"]>svg")).click();
        WebElement pageHeader = driver.findElement(By.cssSelector("div [id=\"top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageHeader));
    }

    @Test
    public void checkContentPagesTopics(){
        driver.findElement(By.cssSelector("header div a [class=\"nav-icon js-nav-icon\"]")).click();
        driver.findElement(By.cssSelector("ul [href=\"/topics\"]")).click();
        WebElement TitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Форум", TitlePage.getText());
        WebElement pageFooter = driver.findElement(By.cssSelector("footer [class=\"site-footer__content\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageFooter));
        WebElement pageHeader = driver.findElement(By.cssSelector("div [id=\"top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageHeader));
    }
    @Test
    public void checkContentPagesСourses(){
        driver.findElement(By.cssSelector("header div a [class=\"nav-icon js-nav-icon\"]")).click();
        driver.findElement(By.cssSelector("ul [href=\"/courses\"]")).click();
        WebElement TitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Курсы", TitlePage.getText());
        WebElement pageFooter = driver.findElement(By.cssSelector("footer [class=\"site-footer__content\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageFooter));
        driver.findElement(By.cssSelector("div [class=\"c9e3 _311d\"]>svg")).click();
        WebElement pageHeader = driver.findElement(By.cssSelector("div [id=\"top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageHeader));
    }

}

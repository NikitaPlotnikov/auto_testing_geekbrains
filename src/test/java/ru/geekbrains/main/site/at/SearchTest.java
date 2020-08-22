package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Поиск
//    В поле Поиск ввести текст: java
//    Проверить что отобразились блоки и в них:
//    Профессий не менее чем 2
//    Курсов более 15
//    Вебинаров больше чем 180, но меньше 300
//    В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
//    Блогов более 300
//    Форумов не 350
//    Тестов не 0
//    В Проектах и компаниях отображается GeekBrains


public class SearchTest extends BaseSettingsTest {
    @Test
    public void pageTitleTest() {
        driver.findElement(By.cssSelector("header div a [class=\"nav-icon js-nav-icon\"]")).click();
        driver.findElement(By.cssSelector("div header>a [class=\"svg-icon icon-search \"]")).click();
        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");
        WebElement pageProfessions = driver.findElement(By.cssSelector("div [id=\"professions\"] h2"));
        WebElement pageCourses = driver.findElement(By.xpath(".//header//*[text()='Курсы']"));
        WebElement pageEvents = driver.findElement(By.xpath(".//header//*[text()='Вебинары']"));
        WebElement pagePosts = driver.findElement(By.xpath(".//header//*[text()='Блоги']"));
        WebElement pageTopics = driver.findElement(By.xpath(".//header//*[text()='Форум']"));
        WebElement pageTests = driver.findElement(By.xpath(".//header//*[text()='Тесты']"));
        WebElement pageProject = driver.findElement(By.xpath(".//header//*[text()='Проекты и компании']"));

        WebElement sumProfessions = driver.findElement(By.cssSelector("div [id=\"professions\"] li a span"));
        WebElement sumCourses = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\"] [@data-tab=\"courses\"]/span "));
        WebElement sumEvents = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\"] [@data-tab=\"webinars\"]/span "));
        WebElement sumPosts = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\"] [@data-tab=\"blogs\"]/span "));
        WebElement sumTopics = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\"] [@data-tab=\"forums\"]/span "));
        WebElement sumTests = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\"] [@data-tab=\"tests\"]/span "));

        wait30second.until(ExpectedConditions.visibilityOf(pageProfessions));
        wait30second.until(ExpectedConditions.visibilityOf(pageCourses));
        wait30second.until(ExpectedConditions.visibilityOf(pageEvents));
        wait30second.until(ExpectedConditions.visibilityOf(pagePosts));
        wait30second.until(ExpectedConditions.visibilityOf(pageTopics));
        wait30second.until(ExpectedConditions.visibilityOf(pageTests));
        wait30second.until(ExpectedConditions.visibilityOf(pageProject));

        Assertions.assertTrue(Integer.parseInt(sumProfessions.getText()) > 2);
        Assertions.assertTrue(Integer.parseInt(sumCourses.getText()) > 15);
        Assertions.assertTrue(Integer.parseInt(sumEvents.getText())>180 & Integer.parseInt(sumEvents.getText())< 300);
        Assertions.assertTrue(Integer.parseInt(sumPosts.getText())>300);
        Assertions.assertTrue(Integer.parseInt(sumTopics.getText()) != 350);
        Assertions.assertTrue(Integer.parseInt(sumTests.getText()) != 0);



    }





}

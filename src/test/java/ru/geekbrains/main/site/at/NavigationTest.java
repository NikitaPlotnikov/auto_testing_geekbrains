package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;

import java.util.stream.Stream;


public class NavigationTest extends BaseSettingsTest{
    @AfterEach
    void tearDown() {
        WebElement pageFooter = driver.findElement(By.cssSelector("footer [class=\"site-footer__content\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageFooter));
        WebElement pageHeader = driver.findElement(By.cssSelector("div [id=\"top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(pageHeader));

    }

    @DisplayName("Нажатие кнопок и проверка текста")
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void courses(String namePage,String nameHref){
        driver.findElement(By.cssSelector("nav >[href=\"/" + nameHref + "\"]")).click();
        Assertions.assertEquals(
                namePage,
                driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
    }

    public static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of("Вебинары","events"),
                Arguments.of("Тесты","tests"),
                Arguments.of("Блог","posts"),
                Arguments.of("Форум","topics"),
                Arguments.of("Курсы","courses")
        );

    }


}

package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
import ru.geekbrains.main.site.at.page.ContentPage;

import java.util.stream.Stream;


@DisplayName("Навигация")
public class NavigationWebTest extends BaseSettingsTest {



    @DisplayName("Нажатие на элемент навагации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(String button) {
        driver.get("https://geekbrains.ru/career");
        new ContentPage(driver)
                .getNavigationBlock().clickButton(button)
                .checkPageName(button);
    }


    public static Stream<String> stringProviderNotPopUp() {
        return Stream.of(
                "Вебинары",
                "Форум",
                "Блог",
                "Тесты",
                "Курсы"
        );
    }

}

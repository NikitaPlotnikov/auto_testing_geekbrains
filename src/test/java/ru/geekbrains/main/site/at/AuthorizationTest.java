package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

@DisplayName("Тесты авторизации")
public class AuthorizationTest extends BaseSettingsTest {

    @DisplayName("Авторизация")
    @Test
    void name1() {
        driver.get("https://geekbrains.ru/login");
        new AuthorizationPage(driver)
                .singIn("hks47018@eoopy.com", "hks47018")
                .checkPageName("Главная");
    }
}
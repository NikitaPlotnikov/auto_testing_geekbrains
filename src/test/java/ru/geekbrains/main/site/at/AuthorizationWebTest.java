package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

import static ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;

@DisplayName("Тесты авторизации")
@Execution(ExecutionMode.CONCURRENT)
public class AuthorizationWebTest extends BaseSettingsTest {

    @DisplayName("Авторизация")
    @Test
    void name1() {
        new AuthorizationPage(driver)
                .openURL()
                .singIn("hks47018@eoopy.com", "hks47018")
                .checkPageName(NameButton.HOME);
    }
}
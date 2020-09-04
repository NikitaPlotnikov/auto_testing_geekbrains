package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
import ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;
import ru.geekbrains.main.site.at.page.ContentPage;

import java.util.stream.Stream;

@DisplayName("Навигация")
@Execution(ExecutionMode.CONCURRENT)
public class NavigationWebTest extends BaseSettingsTest {

    @DisplayName("Нажатие на элемент навагации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProvider")
    public void checkNavigation(NameButton nameButton) {
        new ContentPage(driver)
                .openURL()
                .getNavigationBlock().clickButton(nameButton)
                .checkPageName(nameButton);
    }
    public static Stream<NameButton> stringProvider() {
        return Stream.of(
                NameButton.WEBINARS,
                NameButton.FORUM,
                NameButton.BLOG,
                NameButton.TESTS,
                NameButton.COURSES
        );
    }
}

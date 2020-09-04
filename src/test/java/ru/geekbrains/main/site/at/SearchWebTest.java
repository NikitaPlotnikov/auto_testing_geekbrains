package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;
import static ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;
import static ru.geekbrains.main.site.at.block.SearchSectionBlock.NameSection;


@DisplayName("Поиск")
@Execution(ExecutionMode.CONCURRENT)
public class SearchWebTest extends BaseSettingsTest {

    @BeforeEach
    void beforeSearchTest() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @DisplayName("Проверка количества контента")
    @Test
    void searchTest() {
        new AuthorizationPage(driver)
                .openURL()
                .singIn("hks47018@eoopy.com","hks47018")
                .checkPageName(NameButton.HOME)
                .getHeaderBlock()
                .searchText("java")
                .getSearchSectionBlock()
                .checkCount(NameSection.Profession, greaterThanOrEqualTo(2))
                .checkCount(NameSection.Courses, greaterThan(15))
                .checkCount(NameSection.Webinars, allOf(greaterThan(180), lessThan(300)))
                .checkCount(NameSection.Blogs, greaterThan(300))
                .checkCount(NameSection.Forums, not(350))
                .checkCount(NameSection.Tests, not(0));
    }
}


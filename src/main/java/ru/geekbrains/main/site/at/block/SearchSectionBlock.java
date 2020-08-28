package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchSectionBlock extends BasePage {

    @FindBy(css = "[class='search-page-tabs'] [data-tab='all']")
    private WebElement sectionEverywhere;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='professions']")
    private WebElement sectionProfessions;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='courses']")
    private WebElement sectionCourses;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='webinars']")
    private WebElement sectionWebinars;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='blogs']")
    private WebElement sectionBlogs;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='forums']")
    private WebElement sectionForums;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='tests']")
    private WebElement sectionTests;

    @FindBy(css = "[class='search-page-tabs'] [data-tab='companies']")
    private WebElement sectionCompanies;

    public SearchSectionBlock(WebDriver driver) {
        super(driver);
    }
    @Step("Проверка колличства. '{tabName}' - '{matcher}'")
    public SearchSectionBlock checkCount(String tabName, Matcher<Integer> matcher) {
        String actualCount = getSection(tabName).findElement(By.cssSelector("span")).getText();
        assertThat(Integer.parseInt(actualCount), matcher);
        return this;
    }

    private WebElement getSection(String nameSection) {
        switch (nameSection) {
            case "Профессии": {
                return sectionProfessions;
            }
            case "Курсы": {
                return sectionCourses;
            }
            case "Вебинары": {
                return sectionWebinars;
            }
            case "Блоги": {
                return sectionBlogs;
            }
            case "Форумы": {
                return sectionForums;
            }
            case "Тесты": {
                return sectionTests;
            }
            case "Компании": {
                return sectionCompanies;
            }
            default: {
                throw new RuntimeException("Элемента: " + nameSection + " нет на странице!");
            }
        }
    }
}

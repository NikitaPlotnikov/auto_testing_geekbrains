package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

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
    public SearchSectionBlock checkCount(NameSection nameSection, Matcher<Integer> matcher) {
        String actualCount = getSection(nameSection).findElement(By.cssSelector("span")).getText();
        assertThat(Integer.parseInt(actualCount), matcher);
        return this;
    }
    private WebElement getSection(NameSection nameSection){
        switch (nameSection){

            case Profession: {
                return sectionProfessions;
            }
            case Courses: {
                return sectionCourses;
            }
            case Webinars: {
                return sectionWebinars;
            }
            case Blogs: {
                return sectionBlogs;
            }
            case Forums: {
                return sectionForums;
            }
            case Tests: {
                return sectionTests;
            }
            case Companies: {
                return sectionCompanies;
            }
            default:{
                throw new ButtonNotFoundException("Блока " + nameSection + " нет на странице.\n" +
                        "Или условие не описанно в switch");
            }
        }
    }
    public enum NameSection {
        Profession("Профессии"),
        Courses("Курсы"),
        Webinars("Вебинары"),
        Blogs("Блоги"),
        Forums("Форумы"),
        Tests("Тесты"),
        Companies("Компании");

        NameSection(String text) {
            this.text = text;
        }

        private String text;

        public String getText() {
            return text;
        }
    }
}

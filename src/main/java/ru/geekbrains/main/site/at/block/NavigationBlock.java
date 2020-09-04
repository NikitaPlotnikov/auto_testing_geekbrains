package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.page.ContentPage;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

public class NavigationBlock extends BasePage {
    @FindBy(css = "[class=\"gb-left-menu__logo \"]")
    private WebElement icon;

    @FindBy(css = "[href=\"/courses\"]")
    private WebElement buttonCourses;

    @FindBy(css = "[href='/events']")
    private WebElement buttonWebinars;

    @FindBy(css = "[href=\"/topics\"]")
    private WebElement buttonForum;

    @FindBy(css = "[href=\"/posts\"]")
    private WebElement buttonBlog;

    @FindBy(css = "[href=\"/tests\"]")
    private WebElement buttonTests;

    @FindBy(css = "[href=\"/career\"]")
    private WebElement buttonCareer;

    public NavigationBlock(WebDriver driver) {
        super(driver);
    }

    @Step("Нажатие на кнопку: '{nameButton}'")
    public ContentPage clickButton (NameButton nameButton){
        switch (nameButton) {
            case HOME: {
                this.icon.click();
                break;
            }
            case COURSES: {
                this.buttonCourses.click();
                break;
            }
            case WEBINARS: {
                this.buttonWebinars.click();
                break;
            }
            case FORUM: {
                this.buttonForum.click();
                break;
            }
            case BLOG: {
                this.buttonBlog.click();
                break;
            }
            case TESTS: {
                this.buttonTests.click();
                break;
            }
            case CAREER: {
                this.buttonCareer.click();
                break;
            }
            default: {
                throw new ButtonNotFoundException("Кнопки " + nameButton + " нет на странице.\n" +
                    "Или условие не описанно в switch");
            }
        }
        return new ContentPage(driver);
    }
    public enum NameButton {
        HOME("Главная"),
        COURSES("Курсы"),
        WEBINARS("Вебинары"),
        FORUM("Форум"),
        BLOG("Блог"),
        TESTS("Тесты"),
        CAREER("Карьера");

        NameButton(String text) {
            this.text = text;
        }
        private String text;

        public String getText() {
            return text;
        }
    }
}



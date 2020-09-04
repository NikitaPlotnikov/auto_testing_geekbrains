package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;

public class AuthorizationPage extends BasePage implements iOpenURL {
    @FindBy(css = "#user_email")
    private WebElement inputLogin;

    @FindBy(css = "#user_password")
    private WebElement inputPassword;

    @FindBy(css = "[data-testid=\"login-submit\"]")
    private WebElement buttonSingIn;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }
    @Step("Авторизация на сайте с логином:'{login}' и паролем: '{password}'")
    public ContentPage singIn(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingIn.click();
        return new ContentPage(driver);
    }

    public WebElement getInputLogin() {
        return inputLogin;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getButtonSingIn() {
        return buttonSingIn;
    }
    @Override
    public AuthorizationPage openURL() {
        openPageInBrowser("https://geekbrains.ru/login");
        return this;
    }
}

package ru.geekbrains.main.site.at.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.block.HeaderBlock;
import ru.geekbrains.main.site.at.block.NavigationBlock;
import ru.geekbrains.main.site.at.block.SearchSectionBlock;

public class SearchPage extends BasePage {
    private HeaderBlock headerBlock;
    private NavigationBlock navigationBlock;
    private SearchSectionBlock searchSectionBlock;


    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement popUp1;

    @FindBy(css = "button>[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement popUp2;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
        this.navigationBlock = new NavigationBlock(driver);
        this.searchSectionBlock = new SearchSectionBlock(driver);
    }
    public SearchPage checkPageName(String expectedNamePage) {
        headerBlock.checkNamePage(expectedNamePage);

        return this;
    }

    public WebElement getPopUp1() {
        return popUp1;
    }

    public WebElement getPopUp2() {
        return popUp2;
    }

    public SearchSectionBlock getSearchSectionBlock() {
        return searchSectionBlock;
    }

    public NavigationBlock getNavigationBlock() {
        return navigationBlock;
    }

    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }
}

package ru.geekbrains.main.site.at.page;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.block.HeaderBlock;
import ru.geekbrains.main.site.at.block.NavigationBlock;
import ru.geekbrains.main.site.at.block.SearchSectionBlock;

import static ru.geekbrains.main.site.at.block.NavigationBlock.*;

public class SearchPage extends BasePage {
    private HeaderBlock headerBlock;
    private NavigationBlock navigationBlock;
    private SearchSectionBlock searchSectionBlock;






    public SearchPage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
        this.navigationBlock = new NavigationBlock(driver);
        this.searchSectionBlock = new SearchSectionBlock(driver);
    }
    public SearchPage checkPageName(NameButton nameButton) {
        headerBlock.checkNamePage(nameButton.getText());
        return this;
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

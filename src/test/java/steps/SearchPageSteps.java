package steps;

import io.appium.java_client.android.AndroidDriver;
import pages.SearchPage;
import pages.modals.BottomMenuModal;

public class SearchPageSteps {

    private SearchPage searchPage;
    private BottomMenuModal bottomMenuModal;

    public SearchPageSteps(AndroidDriver driver) {
        this.searchPage = new SearchPage(driver);
        this.bottomMenuModal = new BottomMenuModal(driver);
    }

    public void openAccount(String accountName) {
        bottomMenuModal.clickBtnSearch()
                .searchItem(accountName)
                .clickItem(accountName);
    }

}

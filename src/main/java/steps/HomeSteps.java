package steps;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps {
    @ManagedPages
    HomePage homePage;

    @Steps
    HeaderSteps headerSteps;

    @Step
    public void when_I_set_the_module_to_Home() {
        headerSteps.when_I_set_the_header_module("Home");
    }

    @Step
    public void when_I_click_Tile(String tileTitle){
        homePage.clickOnTile(tileTitle);
    }

    @Step
    public void when_I_click_a_request(String requestTitle) {
        homePage.clickWorkflowRequest(requestTitle);
    }

    @Step
    public void when_I_set_the_module_to_Home_Javascript() {
//        homePage.setHeaderToHome("Home");
        headerSteps.when_I_set_the_header_module("Home");
    }

    @Step
    public void when_I_click_an_Item_in_My_Favourites(String label) {
        homePage.clickItemInMyFavourites(label);
    }

    @Step
    public void when_I_remove_an_Item_in_My_Favourites(String iconName) {
        when_I_click_Tile("Admin Favourites");
        when_I_click_Star_Icon_in_My_Favourites_to_delete(iconName);
    }

    @Step
    public void when_I_click_Star_Icon_in_My_Favourites_to_delete(String iconName){
        homePage.clickStarIconInMyFavouritesPortlet(iconName);
    }

    @Step
    public void when_I_click_Approval_Request_Tile(String tileName) {
        homePage.clickOnRequestTile(tileName);
    }

    @Step
    public void when_I_click_View_All_in_Approvals() {
        homePage.ClickViewAllInApprovals();
    }

    @Step
    public void then_the_time_off_request_is_displayed_under_the_Approval_section_in_home_page(String initiatorName) {
        Assert.assertTrue(homePage.isTimeOffApprovalDisplayed(initiatorName));
    }
}

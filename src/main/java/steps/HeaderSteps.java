package steps;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.HeaderPage;

public class HeaderSteps {

    @ManagedPages
    HeaderPage headerPage;

    @Step("When I set the header module to '{0}'")
    public void when_I_set_the_header_module (String module) {
        headerPage.changeModule(module);
        headerPage.waitForProfileIconToBeVisible();
    }

    @Step
    public void when_I_Log_out() {
        headerPage.clickLogOutButton();
    }

    @Step
    public void when_I_search_for_an_employee_using_the_header_search_bar(String employee_name) {
        when_I_search_employee(employee_name);
        when_I_click_all_actions();
        when_I_search_profile();
        when_I_click_profile();
        headerPage.switchToTab(1);
    }

    @Step
    public void when_I_search_employee(String employee_name){
        headerPage.searchEmployeeOnSearchBar(employee_name);
    }

    @Step
    public void when_I_click_all_actions(){
        headerPage.clickAllActions();
    }

    @Step
    public void when_I_search_profile(){
        headerPage.inputProfile("Profile");
    }

    @Step
    public void when_I_click_profile(){
        headerPage.clickProfile();
    }

    @Step
    public void when_I_search_for_an_action_using_the_header_search_bar(String actionName){
        headerPage.searchActionOnSearchBar(actionName);
    }

    @Step
    public void then_the_module_should_be_set_to_My_Employee_File() {
        Assert.assertEquals("My Employee File", headerPage.getCurrentModuleName());
    }

    @Step
    public void then_the_module_should_be_set_to_Employee_File() {
        Assert.assertEquals("Employee Files", headerPage.getCurrentModuleName());
    }

    @Step
    public void when_I_set_the_header_module_to_recruiting() {
        headerPage.setModuleToRecruiting("Recruiting");
        headerPage.waitForOverlayLoadingAnimationToDisappear();
    }

    @Step
    public void when_I_set_the_header_module_to_recruiting_as_HR_Manager() {
        headerPage.changeModule("Recruiting");
        headerPage.waitForProfileIconToBeVisible();
//        headerPage.setModuleToRecruitingAsHRmanager("Recruiting");
//        headerPage.waitForOverlayLoadingAnimationToDisappear();
    }

    @Step
    public void when_I_set_the_header_module_to_Careers() {
        headerPage.changeModule("Careers");
        headerPage.waitForProfileIconToBeVisible();
//        headerPage.setModuleToCareersAsRecruiter("Careers");
//        headerPage.waitForOverlayLoadingAnimationToDisappear();
    }

    @Step
    public void when_I_set_the_header_module_to_Home_As_Recruiter() {
        headerPage.setModuleToHomeAsRecruiter("Home");
        headerPage.waitForOverlayLoadingAnimationToDisappear();
    }

    @Step
    public void when_I_set_the_module_to_recruiting_as_Recruiter() {
        headerPage.setModuleToRecruitingAsRecruiter("Recruiting");
        headerPage.waitForOverlayLoadingAnimationToDisappear();
    }

    @Step
    public void when_I_set_the_header_module_to_recruiting_as_Talent_Manager() {
        headerPage.changeModule("Recruiting");
        headerPage.waitForProfileIconToBeVisible();

//        headerPage.setModuleToRecruitingAsTalentManager("Recruiting");
//        headerPage.waitForOverlayLoadingAnimationToDisappear();
    }
}

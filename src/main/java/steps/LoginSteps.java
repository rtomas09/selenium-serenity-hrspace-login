package steps;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.HeaderPage;
import pages.LoginPages;

public class LoginSteps {

    @ManagedPages
    HeaderPage headerPage;
    LoginPages loginPages;

    @Steps
    HeaderSteps headerSteps;

    @Step("Given that I'm logged in to HR space using '{0}' account")
    public void given_that_Im_logged_in_to_HR_space(String username, String password) {
        loginPages.openLoginPageAndLogin(username, password);

        then_user_inputs_username(username);
        then_user_inputs_password(password);
        then_user_clicks_Login_button();
//        then_header_name_is_shown();
    }

    @Step ("Given that I'm logged in to HR space as '{0}'")
    public void given_that_Im_logged_in_to_HR_space(String name, String username, String password) {

        loginPages.getUrl();
        String headerName = headerPage.geUserFullName();
        if (headerName == null || !(headerPage.geUserFullName().equalsIgnoreCase(name))) {

            if (headerName != null) {
                headerSteps.when_I_Log_out();
            }
//            headerSteps.when_I_Log_out();

            given_that_Im_logged_in_to_HR_space(username, password);
            headerPage.waitForOverlayLoadingAnimationToDisappear();

        }
    }

    //New login Steps with screenshot
    @Step
    public void then_user_inputs_username(String username){
        loginPages.setUserName(username);
    }

    @Step
    public void then_user_inputs_password(String password){
        loginPages.setPassword(password);
    }

    @Step
    public void then_user_clicks_Login_button(){
        loginPages.clickOnLoginBtn();
    }

    @Step
    public void then_header_name_is_shown(){
        loginPages.waitForUserHeaderNameToShowUp();
    }


}

package pages;

import net.thucydides.core.annotations.ManagedPages;
import utils.ExplicitWait;
import utils.Selectors;


public class LoginPage extends GenericPage {

    @ManagedPages
    CompanyEntryPage companyEntryPage;

    public void openLoginPageAndLogin (String username, String password) {
        companyEntryPage.openCompanyEntryLoginPageAndEnterCompanyID();
        setUserName(username);
        setPassword(password);
        clickOnLoginBtn();
        waitForUserHeaderNameToShowUp();
    }

    private void waitForUserHeaderNameToShowUp() {
//        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 120, Selectors.HEADER_MENU_DROPDOWN_BUTTON.getBy());
//        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 120, javaScript("document.querySelector(\"#bizXShellBarContainer > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"#ui5wc_4-item-3\").shadowRoot.querySelector(\"button\")"));
        javaScriptWebElement("document.querySelector(\"#bizXShellBarContainer > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"#ui5wc_4-item-3\").shadowRoot.querySelector(\"button\")").isDisplayed();
    }

    private void clickOnLoginBtn() {
        clickElement(Selectors.LOGIN_BUTTON.getBy());
    }

    public void setUserName (String username) {
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),30,Selectors.USERNAME_INPUT.getBy());
        typeIntoTextFieldInput(username, Selectors.USERNAME_INPUT.getBy());
    }

    public void setPassword (String password) {
        typeIntoTextFieldInput(password, Selectors.PASSWORD_INPUT.getBy());
    }
}

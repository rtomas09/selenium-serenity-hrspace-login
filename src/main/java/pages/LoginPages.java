package pages;

import net.thucydides.core.annotations.ManagedPages;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ExplicitWait;
import utils.Selectors;

public class LoginPages extends GenericPage{

    @ManagedPages
    CompanyEntryPage companyEntryPage;

    public void getUrl () {
        System.out.println(getDriver().getCurrentUrl());
    }

    public void openLoginPageAndLogin (String username, String password) {
        companyEntryPage.openCompanyEntryLoginPageAndEnterCompanyID();
//        setUserName(username);
//        setPassword(password);
//        clickOnLoginBtn();
//        waitForUserHeaderNameToShowUp();
    }

    public void waitForUserHeaderNameToShowUp() {
//        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 120, Selectors.HEADER_MENU_DROPDOWN_BUTTON.getBy());
//        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 120, javaScript("document.querySelector(\"#bizXShellBarContainer > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"#ui5wc_4-item-3\").shadowRoot.querySelector(\"button\")"));
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"ui5-button-sf-header[data-ui5-stable='profile']\")")));
    }

    public void clickOnLoginBtn() {
        clickElement(Selectors.LOGIN_BUTTON.getBy());
        waitForOverlayLoadingAnimationToDisappear();
    }

    public void setUserName (String username) {
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),30,Selectors.USERNAME_INPUT.getBy());
//        typeIntoTextFieldInput(username, Selectors.USERNAME_INPUT.getBy());
        inputIntoTextField(username, Selectors.USERNAME_INPUT.getBy());
    }

    public void setPassword (String password) {
//        typeIntoTextFieldInput(password, Selectors.PASSWORD_INPUT.getBy());
        inputIntoTextField(password, Selectors.USERNAME_INPUT.getBy());
    }
}

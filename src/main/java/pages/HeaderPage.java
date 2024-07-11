package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ExplicitWait;
import utils.Selectors;

import java.util.List;

public class HeaderPage extends GenericPage {

    public void changeModule (String module) {
        String headerModule = null;
//        if (module.equals("Admin Centre")){
//             headerModule = "Module-ADMIN";
//        }

        switch (module){
            case "Home":
                headerModule = "Module-HOME";
                break;
            case "Objectives":
                headerModule = "Module-GOAL";
                break;
            case "Performance":
                headerModule = "Module-PERFORMANCE";
                break;
            case "Compensation":
                headerModule = "Module-COMPENSATION";
                break;
            case "Careers":
                headerModule = "Module-CAREERS";
                break;
            case "Recruiting":
                headerModule = "Module-RECRUITING";
                break;
            case "Organisation Info":
                headerModule = "Module-COMPANY_INFO";
                break;
            case "Admin Centre":
                headerModule = "Module-ADMIN";
                break;
            case "Reporting":
                headerModule = "Module-REPORT";
                break;
            case "My Employee File":
                headerModule = "Module-EMPLOYEE_FILE";
                break;
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        try {
            waitABit(4000);
            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"ui5-static-area-item-sf-header.globalShellbarMenu[data-ui5-stable='shellbar-static']\").shadowRoot.querySelector(\"ui5-popover-sf-header.ui5-shellbar-menu-popover > ui5-list-sf-header > ui5-li-sf-header[data-ui5-stable='" + headerModule + "']\")"))).click();
        } catch (Exception e){
            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.ui5wc_5.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(9)\").shadowRoot.querySelector(\"li\")"))).click();
        }

//        clickElement(Selectors.HEADER_MODULE_PICKER_BUTTON.getBy());
//        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 20, Selectors.HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV.getBy());
//        clickElement(Selectors.HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR.getBy(module));
    }

    public void waitForProfileIconToBeVisible () {
        try{
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 15, Selectors.HEADER_MENU_DROPDOWN_BUTTON.getBy());
        }catch (Exception e){
            WebDriverWait wait = new WebDriverWait(getDriver(), 90);
//            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"ui5-button-sf-header[data-ui5-stable='profile']\")"))).isDisplayed();
//        javaScriptWebElement("document.querySelector(\"xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"ui5-button-sf-header[data-ui5-stable='profile']\")").isDisplayed();
//        javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"#ui5wc_5-item-3\").shadowRoot.querySelector(\"button\")").isDisplayed();
        }
    }

    public void clickLogOutButton() {
        clickHeaderUtilityMenu("Log out");
    }

    public void clickHeaderUtilityMenu (String menu) {
//        clickElement(Selectors.HEADER_MENU_DROPDOWN_BUTTON.getBy());
//        clickElement(Selectors.POPOVER_LISTBOX_ELEMENTS.getBy(menu));

        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        try {
            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"ui5-button-sf-header.ui5-shellbar-button.ui5-shellbar-image-button\").shadowRoot.querySelector(\"button\")"))).click();
            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"ui5-static-area-item-sf-header.globalShellbarMenu.sfEnsureSAPTheme\").shadowRoot.querySelector(\"#popover > div > ui5-list-sf-header > ui5-li-sf-header[icon='log'] > span > div\")")));
        }catch (Exception e){

        }

    }

    public String geUserFullName () {
        try {
//            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 5, Selectors.HEADER_MENU_DROPDOWN_BUTTON.getBy());
            WebDriverWait wait = new WebDriverWait(getDriver(),30);
            String ACCOUNT_NAVIGATION = "document.querySelector(\"xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"ui5-button-sf-header.ui5-shellbar-button.ui5-shellbar-image-button\").shadowRoot.querySelector(\"button\")";
            javaScriptWebElement(ACCOUNT_NAVIGATION).click();
            String ACCOUNT_FULLNAME ="document.querySelector(\"ui5-static-area-item-sf-header.globalShellbarMenu.sfEnsureSAPTheme\").shadowRoot.querySelector(\"#popover\").shadowRoot.querySelector(\"#ui5-popup-header > h1\")";
            String getAccountName = javaScriptWebElement(ACCOUNT_FULLNAME).getText();
            System.out.println("GET ACCOUNT NAME = "+getAccountName);
            return getAccountName;
//            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"ui5-button-sf-header.ui5-shellbar-button.ui5-shellbar-image-button\").shadowRoot.querySelector(\"button\")"))).click();
//            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 5, Selectors.HEADER_MENU_DROPDOWN_BUTTON.getBy());
//            if (findAll(Selectors.HEADER_PHOTO_NAME.getBy()).size() == 0) { //if name on header is missing
//                clickElement(Selectors.HEADER_MENU_DROPDOWN_BUTTON.getBy());
//                String name = find(Selectors.POPOVER_USER_FULL_NAME_HEADER.getBy()).find(By.xpath(".//h2")).getText().trim();
//                ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 3, Selectors.POPOVER_USER_FULL_NAME_HEADER.getBy());
//                clickElement(Selectors.HEADER_MENU_DROPDOWN_BUTTON.getBy());
//                return name;
//            } else {
//                return find(Selectors.HEADER_PHOTO_NAME.getBy()).getText().trim();
//            }
        } catch (Exception e) {
            return null;
        }
    }

    public void searchEmployeeOnSearchBar(String employee_name) {
//        WebDriverWait wait = new WebDriverWait(getDriver(),30);
//        wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#bizXShellBarContainer > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"#ui5wc_4-item-1\").shadowRoot.querySelector(\"button > ui5-icon\")"))).click();
//        wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#bizXShellBarContainer > xweb-shellbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"input\")"))).sendKeys(employee_name);
//        waitForOverlayLoadingAnimationToDisappear();
//        wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#appCanvas > ui5-static-area > ui5-static-area-item.ui5wc_21\").shadowRoot.querySelector(\"ui5-responsive-popover > ui5-list > ui5-li-suggestion-item\").shadowRoot.querySelector(\"li\")"))).click();
        waitForProfileIconToBeVisible();
        waitABit(3000);
        WebElementFacade searchInput = find(Selectors.HEADER_SEARCH_BAR_INPUT.getBy());
        if (searchInput.isVisible()) {
            typeIntoTextFieldInput(employee_name, searchInput);
            waitABit(3000);
            ExplicitWait.explicitlyWaitForVisibilityOfAllElements(getDriver(), 60, Selectors.HEADER_SEARCH_RESULT_NAME.getBy(employee_name));

            List<WebElementFacade> listOptions = findAll(Selectors.HEADER_SEARCH_RESULT_NAME.getBy(employee_name));
            clickElement(listOptions.get(0));
            waitForOverlayLoadingAnimationToDisappear();
        }else{
            WebDriverWait wait = new WebDriverWait(getDriver(),30);
//            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#bizXShellBarContainer > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"#ui5wc_4-item-1\").shadowRoot.querySelector(\"button > ui5-icon\")"))).click();
            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"xweb-shellbar\").shadowRoot.querySelector(\"#shellbar > xweb-shellbar-search-input\").shadowRoot.querySelector(\"input\")"))).sendKeys(employee_name);
            waitForOverlayLoadingAnimationToDisappear();
            waitABit(3000);
            try {
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item-sf-header:nth-child(2)\").shadowRoot.querySelector(\"ui5-responsive-popover-sf-header > ui5-list-sf-header > ui5-li-suggestion-item-sf-header[title='"+employee_name+"']\")"))).click();
            }catch (Exception e){
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item-sf-header:nth-child(2)\").shadowRoot.querySelector(\"ui5-responsive-popover-sf-header > ui5-list-sf-header > ui5-li-suggestion-item-sf-header[title='"+employee_name+"']\")"))).click();
            }

        }
    }

    public String getCurrentModuleName() {
        WebElementFacade modulePickerButton = find(Selectors.HEADER_MODULE_PICKER_BUTTON.getBy());
        WebElementFacade span = modulePickerButton.find(By.xpath(".//span[@id = 'customHeaderModulePickerBtn-content']"));
        return span.getText();
    }

    public void searchActionOnSearchBar(String actionName){
        System.out.println("Start engaging search bar");
        WebElementFacade searchInput = find(Selectors.HEADER_SEARCH_BAR_INPUT.getBy());
        if (searchInput.isVisible()) {
            typeIntoTextFieldInput(actionName, searchInput);

            ExplicitWait.explicitlyWaitForVisibilityOfAllElements(getDriver(), 30, Selectors.HEADER_SEARCH_RESULT_LIST_ACTION.getBy(actionName));

            List<WebElementFacade> listOptions = findAll(Selectors.HEADER_SEARCH_RESULT_LIST_ACTION.getBy(actionName));
            clickElement(listOptions.get(0));
            waitForOverlayLoadingAnimationToDisappear();
        }else {
            System.out.println("Search bar implements shadow root");
            WebDriverWait wait = new WebDriverWait(getDriver(),30);
            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"xweb-shellbar\").shadowRoot.querySelector(\"#shellbar > xweb-shellbar-search-input\").shadowRoot.querySelector(\"input\")"))).sendKeys(actionName);
            waitForOverlayLoadingAnimationToDisappear();
            waitABit(3000);
            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item-sf-header:nth-child(2)\").shadowRoot.querySelector(\"ui5-responsive-popover-sf-header > ui5-list-sf-header > ui5-li-suggestion-item-sf-header[title='"+actionName+"']\")"))).click();
        }
    }

    public boolean TypeEmployeeNameOnSearchBar(String employeeName){
        WebElementFacade searchInput = find(Selectors.HEADER_SEARCH_BAR_INPUT.getBy());
        typeIntoTextFieldInput(employeeName, searchInput);

        List <WebElementFacade> listOptions = findAll(Selectors.HEADER_SEARCH_RESULT_LIST.getBy());
        return listOptions.get(0).isVisible();
    }

    public void setModuleToRecruiting(String module) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);

        WebElementFacade headerModulePickerButton = find(Selectors.HEADER_MODULE_PICKER_BUTTON.getBy());

        if (headerModulePickerButton.isVisible()){
            clickElement(headerModulePickerButton);
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 20, Selectors.HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV.getBy());
            clickElement(Selectors.HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR.getBy(module));
        } else {
            try {
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#bizXShellBarContainer > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#appCanvas > ui5-static-area > ui5-static-area-item.ui5wc_4.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(7)\").shadowRoot.querySelector(\"li\")"))).click();
            }catch (Exception e){
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#renderTopNavFixedWidthV12 > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#pagebody > ui5-static-area > ui5-static-area-item.ui5wc_5.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(7)\").shadowRoot.querySelector(\"li\")"))).click();
            }
        }
    }

    public void setModuleToRecruitingAsHRmanager(String module) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);

        WebElementFacade headerModulePickerButton = find(Selectors.HEADER_MODULE_PICKER_BUTTON.getBy());

        if (headerModulePickerButton.isVisible()){
            clickElement(headerModulePickerButton);
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 20, Selectors.HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV.getBy());
            clickElement(Selectors.HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR.getBy(module));
        } else {
            try {
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#bizXShellBarContainer > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#appCanvas > ui5-static-area > ui5-static-area-item.ui5wc_4.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(8)\").shadowRoot.querySelector(\"li\")"))).click();
            }catch (Exception e){
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.ui5wc_5.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(8)\").shadowRoot.querySelector(\"li\")"))).click();
            }
        }
    }

    public void setModuleToCareersAsRecruiter(String module) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);

        WebElementFacade headerModulePickerButton = find(Selectors.HEADER_MODULE_PICKER_BUTTON.getBy());

        if (headerModulePickerButton.isVisible()){
            clickElement(headerModulePickerButton);
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 20, Selectors.HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV.getBy());
            clickElement(Selectors.HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR.getBy(module));
        } else {
            try {
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.ui5wc_5.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(5)\").shadowRoot.querySelector(\"li\")"))).click();
            }catch (Exception e){
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(5)\").shadowRoot.querySelector(\"li\")"))).click();
            }
        }
    }

    public void setModuleToHomeAsRecruiter(String module) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);

        WebElementFacade headerModulePickerButton = find(Selectors.HEADER_MODULE_PICKER_BUTTON.getBy());

        if (headerModulePickerButton.isVisible()){
            clickElement(headerModulePickerButton);
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 20, Selectors.HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV.getBy());
            clickElement(Selectors.HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR.getBy(module));
        } else {
            try {
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.ui5wc_5.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(1)\").shadowRoot.querySelector(\"li\")"))).click();
            }catch (Exception e){
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.ui5wc_5.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(1)\").shadowRoot.querySelector(\"li\")"))).click();
            }
        }
    }

    public void setModuleToRecruitingAsRecruiter(String module) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);

        WebElementFacade headerModulePickerButton = find(Selectors.HEADER_MODULE_PICKER_BUTTON.getBy());

        if (headerModulePickerButton.isVisible()){
            clickElement(headerModulePickerButton);
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 20, Selectors.HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV.getBy());
            clickElement(Selectors.HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR.getBy(module));
        } else {
            try {
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(7)\").shadowRoot.querySelector(\"li\")"))).click();
            }catch (Exception e){
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.ui5wc_5.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(7)\").shadowRoot.querySelector(\"li\")"))).click();
            }
        }
    }

    public void setModuleToRecruitingAsTalentManager(String module) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);

        WebElementFacade headerModulePickerButton = find(Selectors.HEADER_MODULE_PICKER_BUTTON.getBy());

        if (headerModulePickerButton.isVisible()){
            clickElement(headerModulePickerButton);
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 20, Selectors.HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV.getBy());
            clickElement(Selectors.HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR.getBy(module));
        } else {
            try {
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(7)\").shadowRoot.querySelector(\"li\")"))).click();
            }catch (Exception e){
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"body > ui5-static-area > ui5-static-area-item.ui5wc_5.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(7)\").shadowRoot.querySelector(\"li\")"))).click();
            }
        }
    }


    public void clickAllActions() {
        waitABit(5500);
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"ui5-panel-xweb-people-profile\").querySelector(\"ui5-list-xweb-people-profile > ui5-li-custom-xweb-people-profile > div > span\")"))).click();
        waitForOverlayLoadingAnimationToDisappear();
    }

    public void inputProfile(String employee_name) {
        waitABit(3000);
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"ui5-input-xweb-people-profile\").shadowRoot.querySelector(\"input\")"))).sendKeys(employee_name);
        waitForOverlayLoadingAnimationToDisappear();
    }

    public void clickProfile() {
        waitABit(3000);
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"ui5-li-xweb-people-profile:nth-child(1)\").shadowRoot.querySelector(\"li\")"))).click();
        waitForOverlayLoadingAnimationToDisappear();
        waitABit(3000);
    }
}

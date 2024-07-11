package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ExplicitWait;
import utils.Selectors;

import java.time.temporal.ChronoUnit;
import java.util.List;

public class HomePage extends GenericPage {


    public void waitForSapDialogPopupLoadingAnimationToDisappear () {
        setImplicitTimeout(0, ChronoUnit.MILLIS);
        try {
            ExplicitWait.explicitlyWaitForNumberOfElementsToBe(getDriver(), 5, Selectors.SAP_OPENED_DIALOG_POP_UP_LOADING_ANIMATION_DIV.getBy(), 1);
        } catch (Exception e) {
            System.out.println("====> APPEAR!");
        }
        ExplicitWait.explicitlyWaitForAbsenceOfElement(getDriver(), 120, Selectors.SAP_OPENED_DIALOG_POP_UP_LOADING_ANIMATION_DIV.getBy()); //wait for the loading icon to disappear
        System.out.println("====> DISAPPEAR!");
        resetImplicitTimeout();
    }
    public void clickOnTile (String tileTitle) {
        waitABit(3000);
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),180,Selectors.HOMEPAGE_TILE.getBy(tileTitle));
        clickElement(Selectors.HOMEPAGE_TILE.getBy(tileTitle));
        waitForSapDialogPopupLoadingAnimationToDisappear();
    }

    public void clickOnRecruitingApprovalsTile() {
//        clickOnTile("Recruiting Approvals");
        clickOnRequestTile("Recruiting Approvals");
    }

    public boolean isRecruitingApprovalsPopUpVisible () {
        return isDialogPopUpOpen("Recruiting Approvals");
    }

    public boolean isDialogPopUpOpen (String title) {
        try {
            WebElementFacade sapDialog = find(Selectors.SAP_OPENED_DIALOG_POP_UP_BASE_DIV_BY_HEADER_TEXT.getBy(title));
            return sapDialog.isVisible();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isApprovalListedInRecruitingApprovalsDialog(String savedRequisitionID) {
        WebElementFacade sapDialog = find(Selectors.SAP_OPENED_DIALOG_POP_UP_BASE_DIV_BY_HEADER_TEXT.getBy("Recruiting Approvals"));
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 10, sapDialog);
        List<WebElementFacade> listItems = sapDialog.thenFindAll(Selectors.RECRUITING_APPROVALS_SAP_DIALOG_LIST_ITEM_DIV.getBy());
        ExplicitWait.explicitlyWaitForVisibilityOfAllElements(getDriver(), 10, Selectors.RECRUITING_APPROVALS_SAP_DIALOG_LIST_ITEM_DIV.getBy());
        for (WebElementFacade listItem : listItems) {
            if (listItem.getText().contains(savedRequisitionID)) {
                return true;
            }
        }
        return false;
    }

    public void clickOnRecruitingApproval(String savedRequisitionID) {
        WebElementFacade sapDialog = find(Selectors.SAP_OPENED_DIALOG_POP_UP_BASE_DIV_BY_HEADER_TEXT.getBy("Recruiting Approvals"));
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 10, sapDialog);
        List<WebElementFacade> listItems = sapDialog.thenFindAll(Selectors.RECRUITING_APPROVALS_SAP_DIALOG_LIST_ITEM_DIV.getBy());
        ExplicitWait.explicitlyWaitForVisibilityOfAllElements(getDriver(), 10, Selectors.RECRUITING_APPROVALS_SAP_DIALOG_LIST_ITEM_DIV.getBy());
        WebElementFacade link = null;
        for (WebElementFacade listItem : listItems) {
            if (listItem.getText().contains(savedRequisitionID)) {
                link = listItem.find(By.xpath(".//a[contains(@id, 'link')]"));
                break;
            }
        }
        clickElement(link);
    }

    public void closeRecruitingApprovalsDialog() {
        WebElementFacade dialogBaseDiv = find(Selectors.SAP_OPENED_DIALOG_POP_UP_BASE_DIV.getBy());
        clickElement(getButtonByInnerText(dialogBaseDiv, "Close"));
    }

    public void clickWorkflowRequest(String requestTitle) {
        List <WebElementFacade> workflowRequest = findAll(Selectors.WORKFLOW_REQUEST.getBy(requestTitle));
        clickElement(workflowRequest.get(0));
    }

    public void setHeaderToHome(String module) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);

        WebElementFacade headerModulePickerButton = find(Selectors.HEADER_MODULE_PICKER_BUTTON.getBy());

        if (headerModulePickerButton.isVisible()){
            clickElement(headerModulePickerButton);
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 20, Selectors.HEADER_MODULE_PICKER_POPUP_MENU_BASE_DIV.getBy());
            clickElement(Selectors.HEADER_MODULE_PICKER_POPUP_MENU_OPTIONS_ANCHOR.getBy(module));
        } else {
            try {
//            wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#bizXShellBarContainer > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#appCanvas > ui5-static-area > ui5-static-area-item.ui5wc_4.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(1)\").shadowRoot.querySelector(\"li\")"))).click();
            }catch (Exception e){
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#div > xweb-shellbar\").shadowRoot.querySelector(\"#shellbar\").shadowRoot.querySelector(\"div > div.ui5-shellbar-overflow-container.ui5-shellbar-overflow-container-left > button\")"))).click();
                wait.until(ExpectedConditions.visibilityOf(javaScriptWebElement("document.querySelector(\"#pagebody > ui5-static-area > ui5-static-area-item.ui5wc_5.globalShellbarMenu\").shadowRoot.querySelector(\"ui5-popover.ui5-shellbar-menu-popover > ui5-list > ui5-li:nth-child(1)\").shadowRoot.querySelector(\"li\")"))).click();
            }
        }
    }

    public void clickItemInMyFavourites(String label) {
        WebElementFacade dialogBox = find(Selectors.SAP_OPENED_DIALOG_POP_UP_BASE_DIV.getBy());
        WebElementFacade myFavouritesItem = dialogBox.find(Selectors.A_BY_TEXT.getBy(label));

        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),30,myFavouritesItem);
        clickElement(myFavouritesItem);
        waitForOverlayLoadingAnimationToDisappear();
    }

    public void clickStarIconInMyFavouritesPortlet(String iconName) {
        WebElementFacade starIcon = find(Selectors.ADMIN_FAVOURITES_STAR_ICON.getBy(iconName));
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),60,starIcon);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(),30,starIcon);
        clickElement(starIcon);
        waitForOverlayLoadingAnimationToDisappear();
    }

    public void clickOnRequestTile(String tileName) {
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),90,Selectors.REQUESTS_APPROVAL_TILE.getBy(tileName));
        clickElement(Selectors.REQUESTS_APPROVAL_TILE.getBy(tileName));
    }

    public boolean isRequisitionDisplayedInApprovalTile(String requisitionID){
        WebElementFacade requisitionIdInApprovalTile = find(Selectors.REQUESTS_APPROVAL_TILE.getBy());
        WebElementFacade spanByText = requisitionIdInApprovalTile.find(Selectors.SPAN_BY_TEXT.getBy(requisitionID));
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),90,requisitionIdInApprovalTile);
        return requisitionIdInApprovalTile.isVisible();
    }

    public void ClickViewAllInApprovals() {
        WebElementFacade viewAll = find(Selectors.VIEW_ALL_APPROVALS.getBy());
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),60,viewAll);
        clickElement(viewAll);
    }

    public boolean isTimeOffApprovalDisplayed(String initiatorName) {
        WebElementFacade approvalTileBaseDiv = find(Selectors.REQUESTS_APPROVAL_TILE.getBy());
        WebElementFacade requestInitiator = approvalTileBaseDiv.find(By.xpath(".//div[contains(text(),'"+initiatorName+"')]"));
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),60,requestInitiator);
        return requestInitiator.isVisible();
    }
}

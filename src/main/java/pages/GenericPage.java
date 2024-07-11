package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ExplicitWait;
import utils.Selectors;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class GenericPage extends PageObject {

    private final Logger LOGGER = LoggerFactory.getLogger(GenericPage.class);

    public static final String SAVED_EMAIL_DATE_ID = "savedEmailDateID::GenericPage";
    public static final String SAVED_REQUISITION_ID = "savedRequisitionID::GenericPage";
    public static final String SAVED_POSITION_CODE_ID = "savedPositionCodeID::OrganisationInfoPage";
    public static final String SAVED_TIMEOFF_USED = "savedTimeoffUsed::GenericPage";

    public void openUrl () {
        open();
        setWindowSize();
    }

    public void setWindowSize () {
        boolean headlessMode = Boolean.parseBoolean(SystemEnvironmentVariables.createEnvironmentVariables().getProperty("headless.mode"));
        if (headlessMode) {
            getDriver().manage().window().setSize(new Dimension(1920, 1080));
        } else {
            getDriver().manage().window().maximize();
        }
    }

    public void dragHorizontalSlider (WebElementFacade slider, int offset) {
        Actions move = new Actions(getDriver());
        Action action = move.dragAndDropBy(slider, offset, 0).build();
        action.perform();
    }

    public void inputIntoTextField(String value, By inputBy){
//        Actions input = new Actions(getDriver());
//        WebElement inputElement = find(Selectors.USERNAME_INPUT.getBy());
//        input.sendKeys(inputElement,"!!!!!!");

        scrollIntoView(inputBy);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(), 20, inputBy);
        WebElement inputElement = getDriver().findElement(inputBy);
        new Actions(getDriver()).moveToElement(inputElement).sendKeys(Keys.TAB).sendKeys(value).perform();
//        inputElement.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), value);
    }


    public void typeIntoTextFieldInput (String value, By inputBy) {
        scrollIntoView(inputBy);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(), 20, inputBy);
        WebElement inputElement = getDriver().findElement(inputBy);
        inputElement.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), value);
    }

    public void typeAndSelectInputComboBoxOption(WebElementFacade parentElement, String optionToSelect) {
        try {
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 10, parentElement);
            WebElementFacade inputCombobox = parentElement.find(By.xpath(".//input[@role = 'combobox']"));
            typeIntoTextFieldInput(optionToSelect, inputCombobox);
            WebElementFacade optionToClick = find(Selectors.SF_LIST_SELECT_OPTION_LI.getBy(optionToSelect));
            clickElement(optionToClick);
        }catch (StaleElementReferenceException e){
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 10, parentElement);
            WebElementFacade inputCombobox = parentElement.find(By.xpath(".//input[@role = 'combobox']"));
            typeIntoTextFieldInput(optionToSelect, inputCombobox);
            WebElementFacade optionToClick = find(Selectors.SF_LIST_SELECT_OPTION_LI.getBy(optionToSelect));
            clickElement(optionToClick);
        }

    }

    public void typeIntoTextFieldInput (String value, WebElementFacade input) {
        scrollIntoView(input);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(), 20, input);
        input.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), value);
    }

    public void typeIntoTextFieldInputThenEnter (String value, WebElementFacade input) {
        scrollIntoView(input);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(), 20, input);
        input.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), value);
        input.sendKeys(Keys.ENTER);
    }

    public void selectFromDropdown(WebElementFacade dropdownButton, WebElementFacade dropdownValue){
        scrollIntoView(dropdownButton);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(),60,dropdownButton);
        clickElement(dropdownButton);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(),60,dropdownValue);
        clickElement(dropdownValue);
    }

    public void selectFromDropdownInIframe(WebElementFacade dropdownButton, WebElementFacade dropdownValue){
        scrollIntoView(dropdownButton);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(),60,dropdownButton);
        clickElement(dropdownButton);

        WebElementFacade iframe = find(By.xpath("//iframe"));
        switchToIframe(iframe);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(),60,dropdownValue);
        clickElement(dropdownValue);
        switchToBaseDom();
    }

    public void switchToIframe (String nameOrId) {
        getDriver().switchTo().frame(nameOrId);
    }

    public void switchToIframe (WebElementFacade webElementFacade) {
        getDriver().switchTo().frame(webElementFacade);
    }

    public void switchToBaseDom() {
        getDriver().switchTo().defaultContent();
    }

    public void typeIntoTextFieldInputDiv (String value, By inputDivBy) {
        scrollIntoView(inputDivBy);
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(), 20, inputDivBy);
        WebElement inputElement = getDriver().findElement(inputDivBy).findElement(By.xpath(".//input"));
        inputElement.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), value);
    }

    public void clickElement (By element) {
        int tries = 0;
        int allowed = 4;
        while (tries < allowed) {
            try {
                ExplicitWait.explicitlyWaitForPresenceOfElement(getDriver(), 10, find(element));
                scrollIntoView(element);
                ExplicitWait.explicitlyWaitForElementToBeClickableIgnoreException(getDriver(), 30, element);
                find(element).click();
                break;
            } catch (ElementClickInterceptedException e) {
                LOGGER.error(e.toString());
                if (tries == (allowed - 1)) {
                    throw new ElementClickInterceptedException(e.getMessage());
                }
            } catch (StaleElementReferenceException e) {
                LOGGER.error(e.toString());
                if (tries == (allowed - 1)) {
                    throw new StaleElementReferenceException(e.getMessage());
                }
            } catch (ElementShouldBeEnabledException e) {
                LOGGER.error(e.toString());
                if (tries == (allowed - 1)) {
                    throw new ElementShouldBeEnabledException(e.getMessage());
                }
            }
            tries++;
        }
    }

    public void clickElementWebElement (String xpath) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        int tries = 0;
        int allowed = 3;
        while (tries < allowed) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
                break;
            } catch (ElementClickInterceptedException e) {
                LOGGER.error(e.toString());
                if (tries == (allowed - 1)) {
                    throw new ElementClickInterceptedException(e.getMessage());
                }
            }
            tries++;
        }
    }

    public void clickElement (WebElementFacade element) {
        int tries = 0;
        int allowed = 3;
        while (tries < allowed) {
            try {
                ExplicitWait.explicitlyWaitForPresenceOfElement(getDriver(), 15, element);
                scrollElementIntoView(element);
                try {
                    ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(), 15, element);
                    element.click();
                } catch (TimeoutException e) {
                    if (element.isVisible()) {
                        javaScriptClick(element);
                    }
                }
                break;
            } catch (ElementClickInterceptedException e) {
                LOGGER.error(e.toString());
                if (tries == (allowed - 1)) {
                    throw new ElementClickInterceptedException(e.getMessage());
                }
            } catch (ElementNotInteractableException e) {
                LOGGER.error(e.toString());
                if (tries == (allowed - 1)) {
                    throw new ElementNotInteractableException(e.getMessage());
                }
            }
            tries++;
        }
    }


    public void scrollElementIntoView(WebElementFacade webElementFacade) {
        scrollIntoView(webElementFacade);
    }

    public void scrollIntoView(By elementBy) {
        scrollIntoView((WebElementFacade) find(elementBy));
    }

    public void scrollIntoView(WebElementFacade element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(" + true + ");", element);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(" + false + ");", element);
    }

    public void waitForLoadingIconToDisappear () {
        setImplicitTimeout(0, ChronoUnit.MILLIS);
        ExplicitWait.explicitlyWaitForVisibilityOfElementIgnoreExceptions(getDriver(),  60, Selectors.LOADING_ICON.getBy());
        System.out.println("====> APPEAR!");
        ExplicitWait.explicitlyWaitForAbsenceOfElement(getDriver(), 120, Selectors.LOADING_ICON.getBy()); //wait for the loading icon to disappear
        System.out.println("====> DISAPPEAR!");
        resetImplicitTimeout();
    }

    public void waitForLoadingIconToDisappear (WebElementFacade busyIndicator) {
        setImplicitTimeout(0, ChronoUnit.MILLIS);
        ExplicitWait.explicitlyWaitForVisibilityOfElementIgnoreExceptions(getDriver(),  60, busyIndicator);
        System.out.println("====> APPEAR!");
        ExplicitWait.explicitlyWaitForAbsenceOfElement(getDriver(), 120, busyIndicator); //wait for the loading icon to disappear
        System.out.println("====> DISAPPEAR!");
        resetImplicitTimeout();
    }

    public void waitForLoadingIconToDisappear (WebElementFacade parentElement, By busyIndicator) {
        setImplicitTimeout(0, ChronoUnit.MILLIS);
        ExplicitWait.explicitlyWaitForVisibilityOfElementIgnoreExceptions(getDriver(),  3, parentElement, busyIndicator);
        System.out.println("====> APPEAR!");
        try {
            ExplicitWait.explicitlyWaitForAbsenceOfElement(getDriver(), 120, parentElement, busyIndicator); //wait for the loading icon to disappear
        } catch (Exception e){

        }
        System.out.println("====> DISAPPEAR!");
        resetImplicitTimeout();
    }

    public void clickLabeledButton (String label) {
        clickElement(Selectors.LABELED_BUTTON.getBy(label));
        waitForOverlayLoadingAnimationToDisappear();
    }

    public void clickLabeledButton (String label, WebElementFacade parentElement) {
        WebElementFacade button = parentElement.find(Selectors.LABELED_BUTTON.getBy(label));
        clickElement(button);
    }

    public void clickHyperLink(String label){
        WebElementFacade hyperlink = find(Selectors.HYPERLINK_BY_TEXT.getBy(label));
        clickElement(hyperlink);
    }

    public void clickAndSelectComboDropdownOption (String option, WebElementFacade parentElement) {
        WebElementFacade dropdownBaseSpan = parentElement.find(Selectors.COMBO_DROPDOWN_BASE_SPAN.getBy());
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 20, dropdownBaseSpan);
        WebElementFacade dropdownToggleBtn = parentElement.find(Selectors.COMBO_DROPDOWN_TOGGLE_BUTTON_SPAN.getBy());
        clickElement(dropdownToggleBtn);
        WebElementFacade optionToClick = find(Selectors.COMBO_DROPDOWN_MENU_OPTION.getBy(option));
        clickElement(optionToClick);
    }

    public void typeAndSelectDropdownOption(WebElementFacade parentElement, String option){
        WebElementFacade inputElement = parentElement.find(By.xpath(".//input"));
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(),20,inputElement);
        inputElement.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END),option);
        WebElementFacade dropdownOptions = find(Selectors.DROPDOWN_MENU_OPTION.getBy(option));
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(),20,dropdownOptions);
//        javaScriptClick(dropdownOptions);
        clickElement(dropdownOptions);

    }

    public void javaScriptClick (WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    public WebElement javaScriptWebElement (String jsScript) {

        return (WebElement) ((JavascriptExecutor)getDriver()).executeScript("return" + " " + jsScript);
    }

    public void switchToWindow (int windowIndex) {
        Object[] windows = getDriver().getWindowHandles().toArray();
        getDriver().switchTo().window(windows[windowIndex].toString());
    }

    public void closeOtherWindow(String windowName) {
        String originalWindow = getDriver().getWindowHandle();
        Set<String> windows = getDriver().getWindowHandles();

        for (String window : windows) {
            String windowTitle = getDriver().switchTo().window(window).getTitle();
            if (windowTitle.contains(windowName)) {
                getDriver().close();
                break;
            }
        }
            getDriver().switchTo().window(originalWindow);
    }

    public void switchToWindow (String windowName) {
        boolean isWindowFound = false;
        String originalWindow = null;

        try {
            originalWindow = getDriver().getWindowHandle();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }

        Set<String> windows = getDriver().getWindowHandles();

        for (String window : windows) {
            String windowTitle = getDriver().switchTo().window(window).getTitle();
            if (windowTitle.contains(windowName)) {
                isWindowFound = true;
                break;
            }
        }

        if (!isWindowFound) { //switch to original window
            String currentWindow = getDriver().getWindowHandle();
            if (!currentWindow.equals(originalWindow)) {
                getDriver().switchTo().window(originalWindow);
            }
        }
    }

    public int getNumberOfWindows () {
        Object[] windows = getDriver().getWindowHandles().toArray();
        return windows.length;
    }

    public boolean isWindowOpen (String windowName) {
        boolean isOpen = false;

        String currentWindow = getDriver().getWindowHandle();
        Set<String> windows = getDriver().getWindowHandles();

        for (String window : windows) {
            String windowTitle = getDriver().switchTo().window(window).getTitle();
            if (windowTitle.contains(windowName)) {
                isOpen = true;
                break;
            }
        }
        getDriver().switchTo().window(currentWindow);
        return isOpen;
    }

    public void switchToJobRequisitionDetailsWindow() {
        switchToWindow("Requisition for");
    }

    public void closePositionOrgCartWindow () {
        closeOtherWindow("Position Org Chart");
    }

    public void typeIntoTextArea (String elementTitle, String text) {
        WebElementFacade textArea = find(Selectors.TEXT_AREA_BY_TITLE.getBy(elementTitle));
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(), 10, textArea);
        typeInto(textArea, text);
    }

    public void typeIntoTextArea (WebElementFacade parentElement, String text) {
        WebElementFacade textArea = parentElement.find(Selectors.TEXT_AREA.getBy());
        ExplicitWait.explicitlyWaitForElementToBeClickable(getDriver(), 10, textArea);
        typeInto(textArea, text);
    }

    public void clickAndSelectComboBoxOption(String option, WebElementFacade parentElement) {
        WebElementFacade comboBoxInput = parentElement.find(Selectors.COMBO_BOX_DROPDOWN_INPUT.getBy());
        clickElement(comboBoxInput);
        waitABit(2500);
        WebElementFacade optionToClick = find(Selectors.COMBO_DROPDOWN_MENU_OPTION.getBy(option));
        clickElement(optionToClick);
    }

    public void clickAndSelectComboBoxOptionUsingJavaScriptClick(String option, WebElementFacade parentElement) {
        WebElementFacade comboBoxInput = parentElement.find(Selectors.COMBO_BOX_DROPDOWN_INPUT.getBy());
        clickElement(comboBoxInput);
        waitABit(2500);
        WebElementFacade optionToClick = find(Selectors.COMBO_DROPDOWN_MENU_OPTION.getBy(option));
        javaScriptClick(optionToClick);
    }

    public WebElementFacade getButtonByValue (WebElementFacade parentElement, String value) {
        WebElementFacade button;
        if (parentElement != null) {
            button = parentElement.find(Selectors.INPUT_BUTTON_BY_VALUE.getBy(value));
        } else {
            button = find(Selectors.INPUT_BUTTON_BY_VALUE.getBy(value));
        }
        return button;
    }


    public WebElementFacade getButtonByTitle(WebElementFacade parentElement, String title) {
        WebElementFacade button;
        if (parentElement != null) {
            button = parentElement.find(Selectors.INPUT_BUTTON_BY_TITLE.getBy(title));
        } else {
            button = find(Selectors.INPUT_BUTTON_BY_TITLE.getBy(title));
        }
        return button;
    }

    public WebElementFacade getButtonByInnerText (WebElementFacade parentElement, String text) {
        WebElementFacade button;
        if (parentElement != null) {
            button = parentElement.find(Selectors.BUTTON_BY_INNER_TEXT.getBy(text));
        } else {
            button = find(Selectors.BUTTON_BY_INNER_TEXT.getBy(text));
        }
        return button;
    }

    public void waitForOverlayLoadingAnimationToDisappear () {
        setImplicitTimeout(0, ChronoUnit.MILLIS);
        ExplicitWait.explicitlyWaitForVisibilityOfElementIgnoreExceptions(getDriver(),  5, Selectors.OVERLAY_LOADING_ANIMATION.getBy());
        System.out.println("====> APPEAR!");
        ExplicitWait.explicitlyWaitForAbsenceOfElement(getDriver(), 400, Selectors.OVERLAY_LOADING_ANIMATION.getBy()); //wait for the loading icon to disappear
        System.out.println("====> DISAPPEAR!");
        resetImplicitTimeout();
    }

    public void waitForOverlayLoadingAnimationToDisappearInIframe () {
        WebElementFacade iframe = find(By.xpath("//iframe[contains(@id,'reportIframe')]"));
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 60, iframe);
        switchToIframe(iframe);

        setImplicitTimeout(0, ChronoUnit.MILLIS);
        ExplicitWait.explicitlyWaitForVisibilityOfElementIgnoreExceptions(getDriver(),  5, Selectors.SAP_UI_LOADING_INDICATOR.getBy());
        System.out.println("====> APPEAR!");
        ExplicitWait.explicitlyWaitForAbsenceOfElement(getDriver(), 400, Selectors.SAP_UI_LOADING_INDICATOR.getBy()); //wait for the loading icon to disappear
        System.out.println("====> DISAPPEAR!");
        resetImplicitTimeout();

        switchToBaseDom();
    }


    public void scrollDown() {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clickApproveBtn() {
        clickElement(getButtonByInnerText(null, "Approve"));
    }

    public Date getSavedRequestEmailDate() {
        return Serenity.sessionVariableCalled(SAVED_EMAIL_DATE_ID);
    }

    public void saveRequestEmailDate () {
        Date currentDate = new Date();
        Serenity.setSessionVariable(SAVED_EMAIL_DATE_ID).to(currentDate);
    }

    public void saveRequisitionID(String requisitionID) {
        Serenity.setSessionVariable(SAVED_REQUISITION_ID).to(requisitionID);
    }


    public void openLinkInNewTab(String savedExternalPostingLink) {
        System.out.println("EXTERNAL POSTING LINK >>> >>> "+savedExternalPostingLink);
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(tabs.size() - 1)); //switches to new tab
        openUrl(savedExternalPostingLink);
    }

    public void openLinkInNewTabByDefaultURL(String requisitionID){
        String url = "https://career12preview.sapsf.eu/sfcareer/jobreqcareer?jobId="+requisitionID+"&company=ICRCTEST1";
        System.out.println("EXTERNAL POSTING LINK >>> >>> "+url);
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(tabs.size() - 1)); //switches to new tab
        openUrl(url);
    }


    public void switchToTab(int i) {
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(i)); //switches to new tab
    }

    public void setZoom(int percent) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("document.body.style.zoom='" + percent + "%'");
    }

    public void resetZoom() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("document.body.style.zoom='100%'");
    }

    public boolean isErrorDialogVisible() {
        try {
            WebElementFacade errorDialog = find(Selectors.ERROR_DIALOG_BASE_DIV.getBy());
            return errorDialog.isVisible();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickShowError () {
        WebElementFacade showErrorLink = find(By.xpath("//a[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'show error')]"));
        clickElement(showErrorLink);
    }

    public void acceptAlert() {
        waitABit(5000);
        getDriver().switchTo().alert().accept();
        getDriver().switchTo().defaultContent();
    }

    public void switchToSuccessFactorsWindow() {
        switchToWindow("SuccessFactors:");
    }

    public void closeJobRequisitionsWindow() {
        closeOtherWindow("Job Requisitions");
    }

    public void switchToPositionOrgChartWindow() {
        switchToWindow("Position Org Chart");
    }

    public void refreshPage() {
        getDriver().navigate().refresh();
    }

    public String getErrorDialogText() {
        WebElementFacade errorTextArea = find(By.xpath("//textarea[@id = 'ajaxServiceErrorDetailCode-inner']"));
        ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(), 10, errorTextArea);
        return errorTextArea.getText();
    }

    public String getSavedPositionCode () {
        System.out.println("POSITION ID ----> " +  Serenity.sessionVariableCalled(SAVED_POSITION_CODE_ID));
        return Serenity.sessionVariableCalled(SAVED_POSITION_CODE_ID);
    }

    public void waitABit (long millis) {
        super.waitABit(millis);
    }

    public String getFullName(String firstName, String maidenName, String lastName){
        firstName = firstName!=null?firstName:"";
        maidenName = maidenName!=null?maidenName:"";
        lastName = lastName!=null?lastName:"";

        System.out.println((firstName + " " + maidenName + " " + lastName).trim());

        return (firstName + " " + maidenName + " " + lastName).trim();
    }

    public boolean isFileDownloaded( String fileName) {
        waitForOverlayLoadingAnimationToDisappear();
        File dir = new File(System.getProperty("user.dir"),"src\\main\\java\\testFileDownloads");
        File[] dirContents = dir.listFiles();
        System.out.println("FILE DIRECTORY >>> " + dir);
        System.out.println("FILE CONTENT >>> " + dirContents.length);

        for (int i = 0; i < dirContents.length; i++) {
            System.out.println("FILE NAMES >>> "+dirContents[i]);
            if (dirContents[i].getName().contains(fileName)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }

    public boolean isH1tagDisplayed(String pageTitleName) {
        try {
            WebElementFacade pageTitle = find(Selectors.H1_BY_TEXT.getBy(pageTitleName));
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),60,pageTitle);
            waitForLoadingIconToDisappear();
            return pageTitle.isVisible();
        } catch (Exception e){
            return false;
        }
    }

    public boolean isH2tagDisplayed(String pageTitleName) {
        try {
            WebElementFacade pageTitle = find(Selectors.H2_BY_TEXT.getBy(pageTitleName));
            ExplicitWait.explicitlyWaitForVisibilityOfElement(getDriver(),60,pageTitle);
            waitForLoadingIconToDisappear();
            return pageTitle.isVisible();
        } catch (Exception e){
            return false;
        }
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    Calendar cal = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    public String inputStartDate(int date){
        cal.add(Calendar.DATE,date);
        System.out.println("Generic Page START DATE == "+ sdf.format(cal.getTime()));
        return sdf.format(cal.getTime());
    }

    public String inputEndDate(int date){
        cal2.add(Calendar.DATE,date);
        System.out.println("Generic Page END DATE == "+ sdf.format(cal2.getTime()));
        return sdf.format(cal2.getTime());
    }

    public String dateConverter(String inputDate){
        String convertedInputDate = inputDate.replace(" Jan ","/01/").replace(" Feb ","/02/").replace(" Mar ","/03/")
                .replace(" Apr ","/04/").replace(" May ","/05/").replace(" Jun ","/06/").replace(" Jul ","/07/").replace(" Aug ","/08/").replace(" Sep ","/09/")
                .replace(" Oct ","/10/").replace(" Nov ","/1/").replace(" Dec ","/12/");
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MMM/yyyy");
        Date date;
        try {
            date = inputFormat.parse(convertedInputDate);
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
            String outputDate = outputFormat.format(date);
            return outputDate;
        }catch (Exception e){
            return null;
        }
    }

    public String getInBetweenDates(double[] workSchedule){
        try {
            System.out.println("SET TIME START DATE = "+sdf.format(cal.getTime()));
            System.out.println("SET TIME END DATE = "+sdf.format(cal2.getTime()));
            List<Double> workHrsConsumed = new ArrayList<>();

            for (;!cal.after(cal2);cal.add(Calendar.DATE,1)){
                workHrsConsumed.add(getCurrentDay(cal.get(Calendar.DAY_OF_WEEK),workSchedule));
                System.out.println("Get Dates In Between START DATE "+sdf.format(cal.getTime()));
                System.out.println("Get Dates In Between END DATE "+sdf.format(cal2.getTime()));
            }
            double sum = 0.0;
            for (double workHrs : workHrsConsumed){
                sum += workHrs;
            }
            String totalWorkHrsConsumed = String.valueOf(sum);
            System.out.println("TOTAL WORK HOURS CONSUMED = "+totalWorkHrsConsumed);
            return totalWorkHrsConsumed;
        }catch (Exception e){
            System.out.println("Get Current Day Exception Catch");
            return null;
        }
    }

    public double getCurrentDay(int dayOfWeek,double[] workSchedule){
        if (dayOfWeek == Calendar.MONDAY){
            System.out.println("DATE IS MONDAY");
            return workSchedule[0];
        } else if (dayOfWeek == Calendar.TUESDAY) {
            System.out.println("DATE IS TUESDAY");
            return workSchedule[1];
        } else if(dayOfWeek == Calendar.WEDNESDAY) {
            System.out.println("DATE IS WEDNESDAY");
            return workSchedule[2];
        } else if (dayOfWeek == Calendar.THURSDAY) {
            System.out.println("DATE IS THURSDAY");
            return workSchedule[3];
        }else if (dayOfWeek == Calendar.FRIDAY) {
            System.out.println("DATE IS FRIDAY");
            return workSchedule[4];
        }else if (dayOfWeek == Calendar.SATURDAY) {
            System.out.println("DATE IS SATURDAY");
            return 0;
        }else if (dayOfWeek == Calendar.SUNDAY) {
            System.out.println("DATE IS SUNDAY");
            return 0;
        }
        else {
            System.out.println("ERROR IN DATE LOGIC");
            return 0;
        }
    }

    public void setTimeoffUsed(double[] workSchedule) {
        Serenity.setSessionVariable(SAVED_TIMEOFF_USED).to(getInBetweenDates(workSchedule));
    }

    public String getTimeoffUsed(){
        return Serenity.sessionVariableCalled(SAVED_TIMEOFF_USED);
    }
}

package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.util.SystemEnvironmentVariables;
import utils.Selectors;

@DefaultUrl("/login?company=#/companyEntry")
public class CompanyEntryPage extends GenericPage {

    public final String COMPANY_ID = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("company.id");

    public void openCompanyEntryLoginPageAndEnterCompanyID() {
        openUrl();
        setCompanyID(COMPANY_ID);
//        clickSubmitBtn();
    }

    public void clickSubmitBtn () {
//        clickElement(getButtonByTitle(null, "Submit"));
        clickLabeledButton("Continue");
    }

    public void setCompanyID (String companyID) {
        WebElementFacade input = find(Selectors.COMPANY_ID_INPUT.getBy());
        if (input.isVisible()) {
            typeIntoTextFieldInput(companyID, input);
            clickSubmitBtn();
        }
    }

}

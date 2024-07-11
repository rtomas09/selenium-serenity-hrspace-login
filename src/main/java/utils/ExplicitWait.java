package utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class ExplicitWait {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExplicitWait.class);

    private static WebDriverWait getWebDriverWaitInstance (WebDriver driver, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver,seconds);
        wait.ignoring(
                NoSuchElementException.class,
                TimeoutException.class
        );
        wait.pollingEvery(100, TimeUnit.MILLISECONDS);
        return wait;
    }

    public static void explicitlyWaitForVisibilityOfElement (WebDriver driver, int seconds, By elementBy) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public static void explicitlyWaitForVisibilityOfElementIgnoreExceptions(WebDriver driver, int seconds, By elementBy) {
        try {
            getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.visibilityOfElementLocated(elementBy));
        } catch (Exception e) {
            LOGGER.info("Element " + elementBy.toString() + " did not became visible!");
        }
    }

    public static void explicitlyWaitForVisibilityOfElementIgnoreExceptions(WebDriver driver, int seconds, WebElementFacade element) {
        try {
            getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            LOGGER.info("Element " + element + " did not became visible!");
        }
    }

    public static void explicitlyWaitForVisibilityOfElementIgnoreExceptions(WebDriver driver, int seconds, WebElementFacade parentElement, By elementBy) {
        try {
            getWebDriverWaitInstance(driver, seconds).until(visibilityOf(parentElement, elementBy));
        } catch (Exception e) {
            LOGGER.info("Element " + elementBy + " did not became visible!");
        }
    }

    public static void explicitlyWaitForInvisibilityOfElement (WebDriver driver, int seconds, By elementBy) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
    }

    public static void explicitlyWaitForAbsenceOfElement (WebDriver driver, int seconds, By elementBy) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.numberOfElementsToBeLessThan(elementBy, 1));
    }


    public static void explicitlyWaitForAbsenceOfElement (WebDriver driver, int seconds, WebElementFacade element) {
        getWebDriverWaitInstance(driver, seconds).until(elementToBeAbsent(element));
    }

    public static void explicitlyWaitForAbsenceOfElement (WebDriver driver, int seconds, WebElementFacade parent, By elementBy) {
        getWebDriverWaitInstance(driver, seconds).until(elementToBeAbsent(parent, elementBy));
    }

    public static void explicitlyWaitForNumberOfElementsToBe (WebDriver driver, int seconds, By elementBy, int expectedNumber) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.numberOfElementsToBe(elementBy, expectedNumber));
    }

    public static void explicitlyWaitForNumberOfElementsToBeMoreThan (WebDriver driver, int seconds, By elementBy, int expectedNumber) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.numberOfElementsToBeMoreThan(elementBy, expectedNumber));
    }

    public static void explicitlyWaitForNumberOfElementsToBeLessThan (WebDriver driver, int seconds, By elementBy, int expectedNumber) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.numberOfElementsToBeLessThan(elementBy, expectedNumber));
    }

    public static void explicitlyWaitForElementToBeClickable (WebDriver driver, int seconds, By elementBy) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public static void explicitlyWaitForElementToBeClickableIgnoreException (WebDriver driver, int seconds, By elementBy) {
        try {
            getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.elementToBeClickable(elementBy));
        } catch (Exception e) {
            LOGGER.error("Element " + elementBy + " did not became clickable!");
        }
    }

    public static void explicitlyWaitForElementToBeClickableIgnoreException (WebDriver driver, int seconds, WebElementFacade element) {
        try {
            getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            LOGGER.error("Element " + element + " did not became clickable!");
        }
    }

    public static void explicitlyWaitForElementToBeClickable (WebDriver driver, int seconds, WebElementFacade element) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void explicitlyWaitForVisibilityOfElement (WebDriver driver, int seconds, WebElementFacade element) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.visibilityOf(element));
    }

    public static void explicitlyWaitForPresenceOfAllElements (WebDriver driver, int seconds, By elementBy) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.presenceOfAllElementsLocatedBy(elementBy));
    }

    public static void explicitlyWaitForPresenceOfElement (WebDriver driver, int seconds, WebElementFacade element) {
        getWebDriverWaitInstance(driver, seconds).until(presenceOfElement(element));
    }

    public static void explicitlyWaitForVisibilityOfAllElements (WebDriver driver, int seconds, By elementBy) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public static void explicitlyWaitForInvisibilityOfElement (WebDriver driver, int seconds, WebElementFacade element) {
        getWebDriverWaitInstance(driver, seconds).until(ExpectedConditions.invisibilityOf(element));
    }

    public static ExpectedCondition<Boolean> elementToBeAbsent (final WebElementFacade parentElement, By elementBy) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                try {
                    return !parentElement.find(elementBy).isPresent();
                } catch (Exception e) {
                    return true;
                }
            }

            @Override
            public String toString() {
                return String.format("Element %s is present!",
                        elementBy);
            }
        };
    }

    public static ExpectedCondition<Boolean> elementToBeAbsent (final WebElementFacade elementToCheck) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                try {
                    return !elementToCheck.isPresent();
                } catch (Exception e) {
                    return true;
                }
            }

            @Override
            public String toString() {
                return String.format("Element %s is present!",
                        elementToCheck);
            }
        };
    }

    public static ExpectedCondition<Boolean> visibilityOf(final WebElementFacade parentElement, final By elementBy) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return parentElement.find(elementBy).isVisible();
                } catch (Exception e) {
                    return false;
                }

            }

            @Override
            public String toString() {
                return "visibility of " + elementBy;
            }
        };
    }

    private static ExpectedCondition<Boolean> presenceOfElement(WebElementFacade element) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return element.isPresent();
                } catch (Exception e) {
                    return false;
                }
            }

            @Override
            public String toString() {
                return "presence of " + element;
            }
        };
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuComponent extends GenericPage {
    public MenuComponent(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.header-text > span")
    WebElement elements;

    @FindBy(xpath = "//div[@class=\"header-text\"]/span")
    WebElement elementsXpath;

    @FindBy(css = ".element-group:nth-child(2) .header-text")
    WebElement forms;

    @FindBy(xpath = "//div[@class=\"header-text\" and contains(text(), \"Forms\")]")
    WebElement formsXpath;

    @FindBy(css = "div.header-text:has(span > svg[viewBox=\"0 0 14 16\"])\n")
    WebElement alerts;

    @FindBy(xpath = "//div[@class='header-text' and contains(.,'Alerts, Frame & Windows')]\n")
    WebElement alertsXpath;

    @FindBy(css = ".element-group:nth-child(4) .header-text") //AI: ".element-group:nth-child(5) .header-text"
    WebElement widgets;

    @FindBy(xpath = "//div[@class='header-text' and contains(.,'Widgets')]\n")
    WebElement widgetsXpath;

    @FindBy(css = "div.header-text:has(span > svg[viewBox=\"0 0 1024 1024\"])\n")
    WebElement interactions;

    @FindBy(xpath = "//div[@class='header-text' and contains(.,'Interactions')]\n")
    WebElement interactionsXpath;

    @FindBy(css = "div.header-text:has(span > svg[viewBox=\"0 0 512 512\"])\n")
    WebElement book;

    @FindBy(xpath = "//div[@class='header-text' and contains(.,'Book Store Application')]\n")
    WebElement bookXpath;


    public void clickOnElements() throws InterruptedException {
        elements.click(); //expand
        System.out.println("Click on the Elements (css) works - expand.");
        elements.click(); //collapse
        System.out.println("Click on the Elements (css) works - collapse.");

        Thread.sleep(1000);

        elementsXpath.click(); //expand
        System.out.println("Click on the Elements (xpath) works - expand.");
        elementsXpath.click(); //collapse
        System.out.println("Click on the Elements (xpath) works - collapse.");
    }

    public void clickOnForms() throws InterruptedException {
        forms.click(); //expand
        System.out.println("Click on the Forms (css) works - expand.");
        forms.click(); //collapse
        System.out.println("Click on the Forms (css) works - collapse.");

        Thread.sleep(1000);

        formsXpath.click(); //expand
        System.out.println("Click on the Forms (xpath) works - expand.");
        formsXpath.click(); //collapse
        System.out.println("Click on the Forms (xpath) works - collapse.");
    }

    public void clickOnAlerts() throws InterruptedException {
        alerts.click(); //expand
        System.out.println("Click on the Alerts (css) works - expand.");
        alerts.click(); //collapse
        System.out.println("Click on the Alerts (css) works - collapse.");

        Thread.sleep(1000);

        alertsXpath.click(); //expand
        System.out.println("Click on the Alerts (xpath) works - expand.");
        alertsXpath.click(); //collapse
        System.out.println("Click on the Alerts (xpath) works - collapse.");
    }

    public void clickOnWidgets() throws InterruptedException {
        widgets.click(); //expand
        System.out.println("Click on the Widgets (css) works - expand.");
        widgets.click(); //collapse
        System.out.println("Click on the Widgets (css) works - collapse.");

        Thread.sleep(1000);

        widgetsXpath.click(); //expand
        System.out.println("Click on the Widgets (xpath) works - expand.");
        widgetsXpath.click(); //collapse
        System.out.println("Click on the Widgets (xpath) works - collapse.");
    }

    public void clickOnInteractions() throws InterruptedException {
        interactions.click(); //expand
        System.out.println("Click on the Interactions (css) works - expand.");
        interactions.click(); //collapse
        System.out.println("Click on the Interactions (css) works - collapse.");

        Thread.sleep(1000);

        interactionsXpath.click(); //expand
        System.out.println("Click on the Interactions (xpath) works - expand.");
        interactionsXpath.click(); //collapse
        System.out.println("Click on the Interactions (xpath) works - collapse.");
    }

    public void clickOnBook() throws InterruptedException {
        book.click(); //expand
        System.out.println("Click on the Book (css) works - expand.");
        book.click(); //collapse
        System.out.println("Click on the Book (css) works - collapse.");

        Thread.sleep(1000);

        bookXpath.click(); //expand
        System.out.println("Click on the Book (xpath) works - expand.");
        bookXpath.click(); //collapse
        System.out.println("Click on the Book (xpath) works - collapse.");
    }
}
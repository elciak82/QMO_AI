package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaLoginPage extends GenericPage {

    public DemoqaLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#userName")
    WebElement userName;

    @FindBy(xpath = "//input[@placeholder=\"UserName\"]")
    WebElement userNameXpath;

    @FindBy(css = "input[placeholder=\"Password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passwordXpath;

    @FindBy(css = "#login")
    WebElement login;

    @FindBy(xpath = "//button[text()=\"Login\"]")
    WebElement loginXpath;

    @FindBy(css = ".buttonWrap > .button:last-child > .btn")
    WebElement newUser;

    @FindBy(xpath = "//button[@id=\"newUser\"]")
    WebElement newUserXpath;

    public void fillUserNameField(String name) {
        userName.sendKeys(name);
        System.out.println("Test: " + name + " is set for userName field (css).");
        userName.clear();

        userNameXpath.sendKeys(name);
        System.out.println("Test: " + name + " is set for userName field (xpath).");
        userNameXpath.clear();
    }

    public void fillPasswordField(String name) {
        password.sendKeys(name);
        System.out.println("Test: " + name + " is set for password field (css).");
        password.clear();

        passwordXpath.sendKeys(name);
        System.out.println("Test: " + name + " is set for password field (xpath).");
        passwordXpath.clear();
    }

    public void clickLoginButton() {
        login.click();
        System.out.println("Click on login button (css) works.");
        driver.navigate().refresh();
        loginXpath.click();
        System.out.println("Click on login button (xpath) works.");

    }

    public void clickNewUserButton() {
        newUser.click();
        System.out.println("Click on newUser button (css) works.");
        driver.navigate().back();
        newUserXpath.click();
        System.out.println("Click on newUser button (xpath) works.");
    }
}

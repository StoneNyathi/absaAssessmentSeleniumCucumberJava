package co.za.inspired.commonsteps;

import co.za.inspired.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class CommonSteps extends BasePage {

    private static final String HOME_PAGE_URL = "http://www.way2automation.com/angularjs-protractor/webtables/";
    private Map<String, Object> vars;
    JavascriptExecutor js;

    /*
    Objects
    */

    @FindBy(xpath = "//button[@type='add']")
    private WebElement btnAddUser;

    @FindBy(xpath = "//*[@name='FirstName']")
    private WebElement txtFirstName;

    @FindBy(xpath = "//*[@name='LastName']")
    private WebElement txtLastName;

    @FindBy(xpath = "//*[@name='UserName']")
    private WebElement txtUsername;

    @FindBy(xpath="//*[@name='Password']")
    private WebElement txtPassword;

    @FindBy(xpath = "//*[@name='Email']")
    private WebElement txtEmail;

    @FindBy(xpath = "//*[@name='Mobilephone']")
    private WebElement txtCellPhone;

    @FindBy(xpath = "//*[@class='btn btn-success']")
    private WebElement saveButton;

    @FindBy (xpath = "//*[@name='RoleId']")
    private WebElement radioButtonCustomer;
    /*
       Common Steps
     */
    CommonSteps(){
        PageFactory.initElements(driver, this);
    }
    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
        wait.forLoading(100);
    }

    void validateTable(){
        assertEquals("Protractor practice website - WebTables", driver.getTitle());
    }

    void adduser(){
        btnAddUser.click();
    }

    void provideDetails(final String firstname, final String lastName, final String username, final String password, final String customer, final String role, final String email, final String cell) {
        wait.forLoading(500);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        txtFirstName.click();
        txtFirstName.sendKeys(firstname);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        txtLastName.click();
        txtLastName.sendKeys(lastName);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        txtUsername.click();
        txtUsername.sendKeys(String.format(username + Math.random(), 3));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        txtPassword.click();
        txtPassword.sendKeys(password);

        driver.findElement(By.name("optionsRadios")).click();
        radioButtonCustomer.click();
        new Select(radioButtonCustomer).selectByVisibleText(role);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        txtEmail.click();
        txtEmail.sendKeys(email);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        txtCellPhone.click();
        txtCellPhone.sendKeys(cell);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        saveButton.click();
    }

    void login(final String username, final String password) {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        txtPassword.click();
        txtPassword.sendKeys(password);

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        radioButtonCustomer.click();

    }

    void sortAscendingOrder() throws Throwable{

        List<WebElement>beforeFilter = driver.findElements(By.className(driver.getTitle()));

        List<String> beforeFilterCustomerNamesList = new ArrayList<>();

        for(WebElement p : beforeFilter){
            beforeFilterCustomerNamesList.add(String.valueOf(p.getText()));
        }

        Collections.sort(beforeFilterCustomerNamesList);
        Assert.assertEquals(beforeFilterCustomerNamesList, beforeFilter);

        Thread.sleep(2000);
    }
}


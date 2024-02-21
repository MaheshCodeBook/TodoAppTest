package stepsdefintions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TodosAppFunctionalitySteps {

    public WebDriver driver ;
    WebDriverWait wait;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("I am on the todos app page")
    public void iAmOntheLoginPage(){
        driver.get("https://qatodos.ccbp.tech/");
    }

    @When("I enter 'Learn Automation Testing' in the input field")
    public void enterTask1Infiled(){
        driver.findElement(By.id("todoUserInput")).sendKeys("Learn Automation Testing");
    }

    @And("I click add button")
    public void clickOnAddButton(){
        driver.findElement(By.id("addTodoButton")).click();
    }
    @When("I enter 'Practice Automation Testing' in the input field")
    public void enterTask2Infiled(){
        driver.findElement(By.id("todoUserInput")).sendKeys("Practice Automation Testing");
    }

    @Then("As we can visible What we added")
    public void addedTodosList(){
        String text1 = driver.findElement(By.id("label1")).getText();
        String text2 = driver.findElement(By.id("label2")).getText();

        Assert.assertEquals(text1,"Learn Automation Testing");
        Assert.assertEquals(text2,"Practice Automation Testing");
    }


    @And("I click the first two checkboxes")
    public void clickTheChechboxes(){
        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();
    }

    @Then("As we can visible checkboxes are selected or not")
    public void checkboxesSelectedOrNot(){
        driver.findElement(By.cssSelector("label#label1")).isDisplayed();
        driver.findElement(By.cssSelector("label#label2")).isDisplayed();
    }

}

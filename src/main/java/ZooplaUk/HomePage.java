package ZooplaUk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Utils {


    private By _acceptcookie = By.xpath("//button[@class='button cookie-banner__button']");
    private By _searchbox= By.xpath("//input[@id='search-input-location'] ");
    private By _clickOnSearch=By.xpath("//button[@id='search-submit']");
    public void userIsOnHomePage()
    {
        System.out.println("cookie");
        //driver.manage().deleteAllCookies();
        clickElementBy(_acceptcookie);
        asserCurrentURL("https://www.zoopla.co.uk/");

       // WebDriverWait wait=new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(_searchbox));
    }
    public void enterToSearchBox()
    {
        //WebDriverWait wait=new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(_searchbox));

        enterText(_searchbox,"london");

    }
    public void userClickOnSearchButton()

    {
        clickElementBy(_clickOnSearch);
    }


}

package ZooplaUk;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserSelecter extends Utils {

    LoadProps loadProps = new LoadProps();

    public void setUpBrowser(){
        String browser = loadProps.getProperty("browser");
        System.out.println("found Browser");
        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            driver = new FirefoxDriver();
            driver.manage().window().fullscreen();
        }else if (browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("_disable-extensions");
            options.addArguments("_disable-setUpBrowser-side-navigation");
            options.addArguments("_incognito");
            options.addArguments("_disable-blink-features=BlockCredentialedSubresources");
            driver = new ChromeDriver(options);
            driver.manage().window().fullscreen();
        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            InternetExplorerOptions options = new InternetExplorerOptions();
            options.setCapability(InternetExplorerDriver.IE_SWITCHES,"-privare");
            options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
            driver = new InternetExplorerDriver(options);
            driver.manage().window().maximize();
        } else{
            System.out.println("Browser name is empty or typed wrong: " + browser);
        }
    }
}

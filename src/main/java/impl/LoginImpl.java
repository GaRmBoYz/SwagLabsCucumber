package impl;

import pages.LoginPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class LoginImpl {

    public LoginPage loginPage;

    HomeImpl impl = new HomeImpl();



    public LoginPage getLoginPage(){
        if (loginPage == null){
            loginPage = new LoginPage();
        }

        return loginPage;
    }

    // methods for impl

    public void clickButton(String buttonName){
        switch (buttonName.toLowerCase()){
            case "submit":
                getLoginPage().loginBtn.click();
                break;
            case "first item add to cart":
                impl.getHomePageElements().firstItemAddToCartBtn.click();
                break;
            case "twitter":
                impl.getHomePageElements().twitterBtn.click();
                break;
            case "facebook":
                impl.getHomePageElements().faceBookBtn.click();
                break;
            case "linkedin":
                impl.getHomePageElements().linkedInBtn.click();
                break;
            default:
                System.err.println("Invalid Button Name");
        }
    }

    public void logIntoSwagLabs() {
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
        getLoginPage().usernameInput.sendKeys(ConfigReader.readProperty("username"));
        getLoginPage().passwordInput.sendKeys(ConfigReader.readProperty("password"));
        getLoginPage().loginBtn.click();
    }
}

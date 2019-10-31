import ZooplaUk.HomePage;
import ZooplaUk.LondonProperty;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    HomePage homePage = new HomePage();
    LondonProperty londonProperty = new LondonProperty();


    @Given("user is on homepage")
    public void userIsOnHomepage() {
        homePage.userIsOnHomePage();
    }
    @And("user enter location")
    public void userEnterLocation() {
        homePage.enterToSearchBox();
    }
    @And("user click on search button")
    public void userClickOnSearchButton() {
        homePage.enterToSearchBox();
    }
    @Then("user is able to see property list")
    public void user_is_able_to_see_property_list() {
        londonProperty.verifyUserIsOnLondonProperty();
    }
    @When("user select descending order to sort property")
    public void user_select_descending_order_to_sort_property(){
        londonProperty.userSortLowPrice();
    }
    @Then("user is able to see property in descending orde")
    public void user_is_able_to_see_property_in_descending_orde() {

    }


}

package testSuites;

import org.junit.Assert;

import helper.Config;
import helper.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.MaisonConnecté;

public class HomePageStepDef {
	@Given("admin is on home page")
	public void admin_is_on_home_page() throws Exception {
		
		Config.ConfigChrome();
		Config.maximazeWindow();
		Config.navigate(Utils.getproprety("Web_Portal_Link"));
	}
@When("admin mouse hover on menu {string}")
public void admin_mouse_hover_on_menu(String menuTitle) {
	HomePage page = new HomePage(Config.driver);
	
	page.mouseHoverOnMenu(menuTitle);

}

@When("admin click on submenu {string}")
public void admin_click_on_submenu(String submenuTitle) {
	HomePage page = new HomePage(Config.driver);
	page.clickOnSubmenu(submenuTitle);
}

@Then("admin is directed to the page {string}")
public void admin_is_directed_to_the_page(String page) {
	MaisonConnecté produit = new MaisonConnecté(Config.driver);
	 String actualMessage= produit.verifMessage();
	 Assert.assertEquals(page, actualMessage);
}
}
	
	
	


	
	



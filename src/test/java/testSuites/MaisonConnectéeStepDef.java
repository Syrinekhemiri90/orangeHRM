package testSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MaisonConnecté;

public class MaisonConnectéeStepDef {
	@Given("admin is on maison connectée page")
	public void admin_is_on_maison_connectée_page() {
		Config.ConfigChrome();
		Config.driver= new ChromeDriver();
		Config.maximazeWindow();
	    Config.navigate("https://mistore.com.tn/product-category/maison-connectee/");
	}

	


	@When("admin click on {string}")
	public void admin_click_on(String tree) {
		MaisonConnecté mc = new MaisonConnecté(Config.driver);
		mc.treeproductsortby(tree);	
	}

	@When("click on product {string}")
	public void click_on_product(String produitName) {
	   MaisonConnecté produit = new MaisonConnecté(Config.driver);
	   produit.clickOnProduitByName(produitName);
	}
}

package testSuites;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ProductPage;

public class ajouterPanierStepDef {

	@Given("admin is on productPage")
	public void admin_is_on_product_page() {
		Config.ConfigChrome();
		Config.maximazeWindow();
		Config.navigate("https://mistore.com.tn/product/mi-temperature-and-humidity-monitor-pro/");
	}

	@Then("admin is directed on {string}")
	public void admin_is_directed_on(String productTitle) {
	ProductPage pdt=new ProductPage(Config.driver);
	pdt.ajoutPanier(productTitle);
	}
	}

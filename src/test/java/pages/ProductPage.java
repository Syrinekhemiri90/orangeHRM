package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class ProductPage {
@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
WebElement bouton ;
@FindBy(xpath="/html/body/div[3]/div[1]")	
WebElement basket ;
@FindBy(xpath="/html/body/div[3]/div[3]/div[2]/div[1]/div/div[2]/a[2]")
	WebElement panier ;

public ProductPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void ajoutPanier(String ProductName) {
	
	Config.attente(10);
	bouton.click();
	
	Config.attente(10);
	basket.click();
	
	Config.attente(10);
	Assert.assertTrue("produit non ajouter au panier",panier.getText().contains(ProductName));
}


}


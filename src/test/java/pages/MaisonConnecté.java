package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import helper.Config;

 public class MaisonConnecté {
 @FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
WebElement page;
@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
List<WebElement> produits ;
@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")
WebElement treeProductSelect ;
 public MaisonConnecté(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
 public String verifMessage() {
		String actualMessage= page.getText();
		return actualMessage; 
 }
 public void treeproductsortby(String sortTree) {
	 
		Select select =new Select(treeProductSelect);
		select.selectByVisibleText(sortTree);
		
 }
		
 
 public void clickOnProduitByName(String ProductName) {
		JavascriptExecutor js = (JavascriptExecutor) Config.driver;
		js.executeScript("window.scrollBy(0,1500)");
		Config.attente(10);
		for (WebElement product:produits) {
			if(product.getText().contains(ProductName));
			Config.attente(10);
			product.click();
 }
 
 }
	 
	
}

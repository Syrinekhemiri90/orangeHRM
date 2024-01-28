package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement>menus ;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/div/div/div/div/section/div/div/div/div/div/a/div/div[2]/h4")
	List<WebElement>submenus ;
	
	
	
	
	public HomePage(WebDriver driver ) {
		
		PageFactory.initElements(Config.driver, this);
}


	public void mouseHoverOnMenu(String menuTitle)	{
		try {
			for (WebElement menu:menus) {
				
				Config.attente(10);
				if(menu.getText().contains(menuTitle)) {
					
					Config.action= new Actions(Config.driver);
					Config.action.moveToElement(menu).perform();
					
						}
					
					
					}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
			
			}
		
	public void clickOnSubmenu(String submenutitle) {
		try {
			for(WebElement submenu:submenus) {
				
				if(submenu.getText().contains(submenutitle)) {
					
					submenu.click();
				}
					
				
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

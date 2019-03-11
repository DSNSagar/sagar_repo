package com.constantstack.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class HomePages {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='navbar-brand']//img[@alt='Contentstack Logo']")
	private static WebElement logo;
	
	@FindBy(xpath="/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li")
	private static List<WebElement> headder_links;
	
	@FindBy(xpath="/html[1]/body[1]/footer[1]/div[1]/div[1]/ul")
	private static List<WebElement> footer_links;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div")
	private static List<WebElement> TrustedAndProvenImages;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[3]/div[1]/div[1]/div[1]/h2[1]")
	private static WebElement Reach_your_Auidance_Anywhere;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private static WebElement Reach_your_Auidance_Anywhere_contentStack_Link;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]")
	private static WebElement Reach_your_Auidance_Anywhere_Form_Title;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]")
	private static WebElement Reach_your_Auidance_Anywhere_Form_Description;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]")
	private static WebElement Reach_your_Auidance_Anywhere_Form_Image;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
	private static WebElement Reach_your_Auidance_Anywhere_Form_Publish;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[4]/div[1]/div[1]/div[1]/h2[1]")
	private static WebElement Connect_with_Your_Favorate_Apps_Headder;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[4]/div[1]/div[2]/div[1]/div[3]/img[1]")
	private static WebElement Connect_with_Your_Favorate_Apps__Image;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[5]/div[1]/div[1]/div[1]/h2[1]")
	private static WebElement Get_Started_for_Free_Text;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private static WebElement Try_for_free_button;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/legend[1]")
	private static WebElement Try_for_free_Your_Info;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/legend[1]")
	private static WebElement Try_for_free_Your_Business;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/legend[1]")
	private static WebElement Try_for_free_Terms_of_Service;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[13]/div[1]/div[2]/label[1]/a[2]")
	private static WebElement Try_for_free_Privacy_policy;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[13]/div[1]/div[2]/label[1]/a[3]")
	private static WebElement Try_for_free_Unsubscribe;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")
	private static WebElement Blog_Headder;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div")
	private static List<WebElement> Blog_Tabs;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[4]/li[1]/form[1]/input[1]")
	private static WebElement Blog_Search_Functionality;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[5]/a[1]")
	private static WebElement Guide_Headder;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")
	private static WebElement Company_Headder;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div")
	private static List<WebElement> CMS_Articles;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li")
	private static List<WebElement> Company_Drop_Down_Options;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]")
	private static WebElement About_link;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/ul[2]/li[1]/a[1]")
	private static WebElement Verify_About_link;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private static WebElement Verify_News_link;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private static WebElement Verify_Press_link;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/h1[1]")
	private static WebElement Verify_Contact_US_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[2]/a[1]")
	private static WebElement News_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[3]/a[1]")
	private static WebElement Press_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[4]/a[1]")
	private static WebElement Careers_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]s/nav[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[5]/a[1]")
	private static WebElement Contact_us_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
	private static WebElement Partners_Headder;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
	private static WebElement Verify_Partners_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	private static WebElement Product_Headder;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li")
	private static List<WebElement> Verify_Product_Links;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	private static WebElement Features_Link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
	private static WebElement Technology_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
	private static WebElement Pricing_link;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private static WebElement Verify_Features_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	private static WebElement Resources_Headder;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul/li")
	private static List<WebElement> Verify_Resources_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	private static WebElement Resource_Center_Link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	private static WebElement ROI_Calculator_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
	private static WebElement Docs_link;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private static WebElement Verify_ResourcesCenter_link;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")
	private static WebElement Verify_ROI_Calculator_link;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/a[2]")
	private static WebElement Verify_Documentation_link;
	
	
	
	public void launchApp()throws Throwable {
		System. setProperty("webdriver.chrome.driver", "E:\\bajajFinServ11Feb\\contantstackqa\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.contentstack.com/");
	}
	
	public void verify_HomePage()throws Throwable {
		Assert.assertTrue("Launching Failed", driver.getTitle().contains("Constantstack"));
	}
	
	public void verify_Logo()throws Throwable {
		Assert.assertTrue("Logo not Found", logo.isDisplayed());
	}
	
	public void verify_HeadderLinks() throws Throwable{
		Assert.assertFalse("There are 8 Headder Links",headder_links.isEmpty());
	}
	
	public void verify_FooterLinks() throws Throwable{
		Assert.assertFalse("There are 8 Footer Links",footer_links.isEmpty());
	}
	
	public void verify_Trusted_Proven_Images() throws Throwable{
		Assert.assertFalse("There are NO Truested Proven Images",TrustedAndProvenImages.isEmpty());
	}
	
	public void Verify_reach_your_Auidance_Anywhere() throws Throwable{
		Assert.assertTrue("Reach Youor Auidance is No Where",Reach_your_Auidance_Anywhere.isDisplayed());
		Assert.assertTrue("Reach Youor Auidance is No Where",Reach_your_Auidance_Anywhere_contentStack_Link.isDisplayed());
		Assert.assertTrue("Reach Youor Auidance is No Where",Reach_your_Auidance_Anywhere_Form_Title.isDisplayed());
		Assert.assertTrue("Reach Youor Auidance is No Where",Reach_your_Auidance_Anywhere_Form_Description.isDisplayed());
		Assert.assertTrue("Reach Youor Auidance is No Where",Reach_your_Auidance_Anywhere_Form_Image.isDisplayed());
		Assert.assertTrue("Reach Youor Auidance is No Where",Reach_your_Auidance_Anywhere_Form_Publish.isDisplayed());
	}
	
	public void Verify_connnect_with_Your_Favourate_Apps() throws Throwable{
		Assert.assertTrue("Connect with your Favourate Apps is No Where",Connect_with_Your_Favorate_Apps_Headder.isDisplayed());
		Assert.assertTrue("Connect with your Favourate Apps is No Where",Connect_with_Your_Favorate_Apps__Image.isDisplayed());
	}
	
	public void Verify_Try_for_Free_Functionality() throws Throwable{
		Assert.assertTrue("Connect with Try for free is No Where",Get_Started_for_Free_Text.isDisplayed());
		Try_for_free_button.click();
		Thread.sleep(2000);
		Assert.assertTrue("Connect with Try for free is No Where",Try_for_free_Your_Info.isDisplayed());
		Assert.assertTrue("Connect with Try for free is No Where",Try_for_free_Your_Business.isDisplayed());
	}
	
	public void Verify_Try_for_Free_Functionality_Links() throws Throwable{
		Assert.assertTrue("Connect with Try for free links is No Where",Try_for_free_Terms_of_Service.isDisplayed());
		Assert.assertTrue("Connect with Try for free links is No Where",Try_for_free_Privacy_policy.isDisplayed());
		Assert.assertTrue("Connect with Try for free links is No Where",Try_for_free_Unsubscribe.isDisplayed());
	}
	
	public void ClickOn_Blog_And_Verify_it_is_navigating_to_corrosponding_Page() throws Throwable{
		Blog_Headder.click();
		Thread.sleep(2000);
		Assert.assertTrue("It is not navigating to corrosponding page",driver.getCurrentUrl().contains("blog"));
	}
	
	public void Check_remaining_tabs_And_Search_Functionality() throws Throwable{
		int size = Blog_Tabs.size();
		Assert.assertTrue("Blog Page not contains multiple tabs",size>=1);
		Assert.assertTrue("Search Functionality is not working",Blog_Search_Functionality.isEnabled());
	}
	
	public void Click_on_Guides_Functionality() throws Throwable{
		Guide_Headder.click();
		Thread.sleep(2000);
		Assert.assertTrue("Guide page is not opened",driver.getCurrentUrl().contains("guides"));
	}
	
	public void Check_CMS_Articles() throws Throwable{
		int size = CMS_Articles.size();
		Assert.assertTrue("Blog Page not contains multiple tabs",size>=1);
		Assert.assertTrue("Search Functionality is not working",Blog_Search_Functionality.isEnabled());
	}
	
	public void CheckCompany_Links() throws Throwable{
		Company_Headder.click();
		Thread.sleep(2000);
		int size = Company_Drop_Down_Options.size();
		Assert.assertTrue("Company Page not contains multiple tabs",size>=1);
	}
	
	public void Click_On_About_Link_and_Verify() throws Throwable{
		About_link.click();
		Thread.sleep(2000);
		Assert.assertTrue("About Page not contains multiple tabs",Verify_About_link.getText().contains("About"));
	}
	
	public void Click_On_News_Link_and_Verify() throws Throwable{
		News_link.click();
		Thread.sleep(2000);
		Assert.assertTrue("News Page not contains multiple tabs",Verify_News_link.getText().contains("News"));
	}
	
	public void Click_On_Press_Link_and_Verify() throws Throwable{
		Press_link.click();
		Thread.sleep(2000);
		Assert.assertTrue("Press Page not contains multiple tabs",Verify_Press_link.getText().contains("Press"));
	}
	
	public void Click_On_Careers_Link_and_Verify() throws Throwable{
		Careers_link.click();
		Thread.sleep(2000);
		Assert.assertTrue("careers Page not contains multiple tabs",driver.getCurrentUrl().contains("careers"));
	}
	
	public void Click_On_Contact_US_Link_and_Verify() throws Throwable{
		Contact_us_link.click();
		Thread.sleep(2000);
		Assert.assertTrue("ContactUS Page not contains multiple tabs",Verify_Contact_US_link.getText().contains("Contact us."));
	}
	
	public void Click_On_Partners_Link_and_Verify() throws Throwable{
		Partners_Headder.click();
		Thread.sleep(2000);
		Assert.assertTrue("Partners Page not contains multiple tabs",Verify_Partners_link.getText().contains("partner"));
	}
	
	public void Click_On_Product_Link_and_Verify() throws Throwable{
		Partners_Headder.click();
		Thread.sleep(2000);
		int size = Verify_Product_Links.size();
		Assert.assertTrue("Product Page not contains multiple tabs",size>=1);
	}
	
	public void Click_On_Features_Link_and_Verify() throws Throwable{
		Features_Link.click();
		Thread.sleep(2000);
		Assert.assertTrue("Press Page not contains multiple tabs",Verify_Features_link.getText().contains("Features"));
	}
	
	public void Click_On_Technology_Link_and_Verify() throws Throwable{
		Technology_link.click();
		Thread.sleep(2000);
		Assert.assertTrue("careers Page not contains multiple tabs",driver.getCurrentUrl().contains("technology"));
	}
	
	public void Click_On_Pricing_Link_and_Verify() throws Throwable{
		Pricing_link.click();
		Thread.sleep(2000);
		Assert.assertTrue("ContactUS Page not contains multiple tabs",driver.getCurrentUrl().contains("pricing"));
	}
	
	public void Click_On_Resources_Link_and_Verify() throws Throwable{
		Resources_Headder.click();
		Thread.sleep(2000);
		int size = Verify_Resources_link.size();
		Assert.assertTrue("Product Page not contains multiple tabs",size>=1);
	}
	
	public void Click_On_Resource_Center_Link_and_Verify() throws Throwable{
		Resource_Center_Link.click();
		Thread.sleep(2000);
		Assert.assertTrue("Press Page not contains multiple tabs",Verify_ResourcesCenter_link.getText().contains("Resources"));
	}
	
	public void Click_On_ROICalculator_Link_and_Verify() throws Throwable{
		ROI_Calculator_link.click();
		Thread.sleep(2000);
		Assert.assertTrue("careers Page not contains multiple tabs",Verify_ROI_Calculator_link.getText().contains("ROI Calculator"));
	}
	
	public void Click_On_Docs_Link_and_Verify() throws Throwable{
		Docs_link.click();
		Thread.sleep(2000);
		Assert.assertTrue("ContactUS Page not contains multiple tabs",Verify_Documentation_link.getText().contains("Documentation"));
	}
	
	
}

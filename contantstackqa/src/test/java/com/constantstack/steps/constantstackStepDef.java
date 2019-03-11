package com.constantstack.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.constantstack.pages.HomePages;

import cucumber.api.java.en.*;

public class constantstackStepDef extends HomePages{
	
	
	@Given("^Launch Constant Stack site$")
	public void launch_Constant_Stack_site() throws Throwable {
	    launchApp();
	}

	@Then("^verify Constant Stack Page opened$")
	public void Constant_stack_Page_Opened() throws Throwable {
		verify_HomePage();
	}
	
	@And("^Verify the Logo of Content Stack$")
	public void Verify_the_Logo_of_Content_Stack() throws Throwable{
		verify_Logo();
	}
	@Then("^verify the Headder links and Random news are available or Not$")
	public void verify_the_Headder_links_and_Random_news_are_available_or_Not() throws Throwable{
		verify_HeadderLinks();
	}
	
	@Then("^Verify the Footer links are available or not$")
	public void Verify_the_Footer_links_are_available_or_not() throws Throwable{
		verify_FooterLinks();
	}
	
	@Then("^Check the Trusted and Proven Images and Matter behind the Images availability$")
	public void Check_the_Trusted_and_Proven_Images_and_Matter_behind_the_Images_availability() throws Throwable{
		verify_Trusted_Proven_Images();
	}
	
	@Then("^Verify the Functionality of Reach your auidance Anywhere functionality$")
	public void Verify_the_Functionality_of_Reach_your_auidance_Anywhere_functionality() throws Throwable{
		Verify_reach_your_Auidance_Anywhere();
	}
	
	@Then("^Verify the Connect with your favorite Apps part is Available and images$")
	public void Verify_the_Connect_with_your_favorite_Apps_part_is_Available_and_images() throws Throwable{
		Verify_connnect_with_Your_Favourate_Apps();
	}
	
	@Then("^Verify the Try for Free Functionality is Available and Working$")
	public void Verify_the_Try_for_Free_Functionality_is_Available_and_Working() throws Throwable{
		Verify_Try_for_Free_Functionality();
	}
	
	@Then("^Check the Terms of Service and Privacy Policy and unsubscribe functionality$")
	public void Check_the_Terms_of_Service_and_Privacy_Policy_and_unsubscribe_functionality() throws Throwable{
		Verify_Try_for_Free_Functionality_Links();
	}
	
	@Then("^Click on Blog and verify the the Blog is always navigating to the corrosponding tab$")
	public void Click_on_Blog_and_verify_the_Blog_is_always_navigating_to_the_corrosponding_tab() throws Throwable{
		ClickOn_Blog_And_Verify_it_is_navigating_to_corrosponding_Page();
	}
	
	@And("^Check the remaining Tabs are working or not and Search Text Box is working or not$")
	public void Check_the_remaining_Tabs_are_working_or_not_and_Search_Text_Box_is_working_or_not() throws Throwable{
		Check_remaining_tabs_And_Search_Functionality();
	}
	
	@Then("^Click on Guides and verify the Headder contains Content Management System Guides$")
	public void Click_on_Guides_and_verify_the_Headder_contains_Content_Management_System_Guides() throws Throwable{
		Click_on_Guides_Functionality();
	}
	
	@Then("^Verify the Functionality of Subscribe to CMSArticles$")
	public void Verify_the_Functionality_of_Subscribe_to_CMSArticles () throws Throwable{
		Check_CMS_Articles();
	}
	
	@Then("^Click on Company link and Verify the Drop down contains 5 options$")
	public void Click_on_Company_link_and_Verify_the_Drop_down_contains_5_options() throws Throwable{
		CheckCompany_Links();
	}
	
	@Then("^Click on EachLink and verify it is navigating to corrosponding Page$")
	public void Click_on_EachLink_and_verify_it_is_navigating_to_corrosponding_Page() throws Throwable{
		Click_On_About_Link_and_Verify();
		Click_On_News_Link_and_Verify();
		Click_On_Press_Link_and_Verify();
		Click_On_Careers_Link_and_Verify();
		Click_On_Contact_US_Link_and_Verify();
	}
	
	@Then("^Click on Partners and verify the Partners with ContentStack Headder is available$")
	public void Click_on_Partners_and_verify_the_Partners_with_ContentStack_Headder_is_available() throws Throwable{
		Click_On_Partners_Link_and_Verify();
	}
	
	@Then("^Click on Product and verify the Partners with ContentStack Headder is available$")
	public void Click_on_Product_and_verify_the_Partners_with_ContentStack_Headder_is_available() throws Throwable{
		Click_On_Product_Link_and_Verify();
	}
	
	@Then("^Click on EachLink on Product and verify it is navigating to corrosponding Page$")
	public void Click_on_EachLink_On_Product_and_verify_it_is_navigating_to_corrosponding_Page() throws Throwable{
		Click_On_Features_Link_and_Verify();
		Click_On_Technology_Link_and_Verify();
		Click_On_Pricing_Link_and_Verify();
	}
	
	@Then("^Click on Resources and verify the Partners with ContentStack Headder is available$")
	public void Click_on_Resources_and_verify_the_Partners_with_ContentStack_Headder_is_available() throws Throwable{
		Click_On_Resources_Link_and_Verify();
	}
	
	@Then("^Click on EachLink on Resources and verify it is navigating to corrosponding Page$")
	public void Click_on_EachLink_On_Resources_and_verify_it_is_navigating_to_corrosponding_Page() throws Throwable{
		Click_On_Resource_Center_Link_and_Verify();
		Click_On_ROICalculator_Link_and_Verify();
		Click_On_Docs_Link_and_Verify();
	}
	
}

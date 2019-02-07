package scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import function_lib.CreateOffersPage;
import utilities.CaptureScreenshot;
import utilities.DataProviderClass;

@Listeners(listeners.TestNG_Listener.class)
public class CreateOffers extends BaseClass{
	  
	  @Test(dataProvider="getCreateOffersData",dataProviderClass=DataProviderClass.class)
	  public void createOffers(String OfferName, String desc, String expiry, String disc, String MinBill, String Msg) throws Exception {
		  System.out.println("--------Creating Offer----------");
		  try {
			  crpage = PageFactory.initElements(driver, CreateOffersPage.class);
			  crpage.CreateOffers_btn.click();
			  crpage.AddOffer_btn.click();
			  crpage.SelectBusinessCategory.click();
			  crpage.BeautySalon.click();
			  crpage.AppliesTo.click();
			  crpage.IseekUsers.click();
			  crpage.Select_createoffer.click();
			  crpage.IseekOffer.click();
			  try {
				Boolean promo;
				  if(promo = crpage.Promoerror.isDisplayed()) {
					  System.out.println(promo);
					  crpage.Select_createoffer.clear();
					  crpage.Select_createoffer.sendKeys(OfferName);
					  crpage.Description.sendKeys(desc);
				  }
			} catch (Exception e) {
				crpage.Description.sendKeys(desc);
			}
			  CaptureScreenshot.screenshot("NewOffer Page1");
			  crpage.ExpiryDate.sendKeys(expiry);
			  crpage.SelectDiscount.click();
			  crpage.DiscountonBill.click();
			  crpage.TypeofDiscount.click();
			  crpage.Percent.click();
			  crpage.Discount.sendKeys(disc);
			  crpage.UsageType.click();
			  crpage.Once.click();
			  crpage.MinBill.sendKeys(MinBill);
			  CaptureScreenshot.screenshot("NewOffer Page2");
			  crpage.Submit.click();
			  CaptureScreenshot.screenshot("OfferConfirmation Page");
			  crpage.OfferConfirm.click();
			  crpage.Confirm.click();
			  crpage.EnterMessage.sendKeys(Msg);
			  CaptureScreenshot.screenshot("SendNotification Page");
			  crpage.Submit.click();
			  CaptureScreenshot.screenshot("Notification update Msg");
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }

}

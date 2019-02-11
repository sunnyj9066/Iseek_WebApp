package function_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import scripts.BaseClass;

public class CreateOffersPage extends BaseClass {

	@FindBy(how=How.XPATH, using="//div[contains(text(),' Create Offers ')]")
	public WebElement CreateOffers_btn;
	
	@FindBy(xpath="//div[@class='my-20 mx-16']//div//button[@type='button']")
	public WebElement AddOffer_btn;
	
	@FindBy(xpath="//mat-select[contains(@id,'mat-select-') and @placeholder='Select business category']")
	public WebElement SelectBusinessCategory;
	
	@FindBy(xpath="//mat-option/span[contains(text(),'Beauty Salon')]")
	public WebElement BeautySalon;
	
	@FindBy(xpath="//mat-select[contains(@id,'mat-select-') and @placeholder='Applies To']")
	public WebElement AppliesTo;
	
	@FindBy(xpath="//span[text()='iSeek Users']")
	public WebElement IseekUsers;
	
	@FindBy(xpath="//input[contains(@id,'mat-input-') and @placeholder='Select / create offer']")
	public WebElement Select_createoffer;
	
	@FindBy(xpath="//span[text()='iSeekOffer ']")
	public WebElement IseekOffer;
	
	@FindBy(xpath="//textarea[contains(@id,'mat-input-') and @placeholder='Description']")
	public WebElement Description;
	
	@FindBy(xpath="//input[contains(@id,'mat-input-') and @placeholder='Expiry date']")
	public WebElement ExpiryDate;
	
	@FindBy(xpath="//mat-select[contains(@id,'mat-select-') and @placeholder='Select discount on']")
	public WebElement SelectDiscount;
	
	@FindBy(xpath="//span[text()='Discount on Bill']")
	public WebElement DiscountonBill;
	
	@FindBy(xpath="//mat-select[contains(@id,'mat-select-') and @placeholder='Type of discount']")
	public WebElement TypeofDiscount;
	
	@FindBy(xpath="//span[text()='Percent']")
	public WebElement Percent;
	
	@FindBy(xpath="//input[contains(@id,'mat-input-') and @placeholder='Discount %']")
	public WebElement Discount;
	
	@FindBy(xpath="//mat-select[contains(@id,'mat-select-') and @placeholder='Usage type']")
	public WebElement UsageType;
	
	@FindBy(xpath="//span[text()='Once']")
	public WebElement Once;
	
	@FindBy(xpath="//input[contains(@id,'mat-input-') and @placeholder='Minimum Bill']")
	public WebElement MinBill;
	
	@FindBy(xpath="//span[contains(text(),'SUBMIT')]")
	public WebElement Submit;
	
	@FindBy(xpath="//span[contains(text(),'YES')]")
	public WebElement OfferConfirm;
	
	@FindBy(xpath="//span[contains(text(),'YES')]")
	public WebElement Confirm;
	
	@FindBy(xpath="//span[contains(text(),'YES')]")
	public WebElement SendNotification;
	
	@FindBy(xpath="//mat-error[text()=' Promocode already exists. ']")
	public WebElement Promoerror;
	
	@FindBy(xpath="//textarea[contains(@id,'mat-input-') and @placeholder='Enter message']")
	public WebElement EnterMessage;
	
}

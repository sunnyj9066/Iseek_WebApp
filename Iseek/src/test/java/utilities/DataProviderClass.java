package utilities;

import org.testng.annotations.DataProvider;

import scripts.BaseClass;

public class DataProviderClass extends BaseClass{
	
	@DataProvider
	  public String getloginData() {
		 String data=ExcelReader.getTestData("Login", 1);
		 return data;
	  }

	@DataProvider
	  public String getCreateOffersData(){
		  String data=ExcelReader.getTestData("CreateOffers", 2);
			 return data;
	  }
}

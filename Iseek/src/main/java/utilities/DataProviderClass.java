package utilities;

import org.testng.annotations.DataProvider;

import scripts.BaseClass;

public class DataProviderClass extends BaseClass{
	
	@DataProvider
	  public Object[][] getloginData() {
		 Object data [][]=ExcelReader.getTestData("Login");
		 return data;
	  }

	@DataProvider
	  public Object[][] getCreateOffersData(){
		  Object data [][]=ExcelReader.getTestData("CreateOffers");
			 return data;
	  }
}

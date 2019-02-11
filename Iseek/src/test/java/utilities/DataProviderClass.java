package utilities;

import org.testng.annotations.DataProvider;

import scripts.BaseClass;

public class DataProviderClass extends BaseClass{
	
	@DataProvider
	  public Object[][] getloginData() {
		 Object data [][]=ExcelReader.getTestData("Login", 1);
		 return data;
	  }

	@DataProvider
	  public Object[][] getCreateOffersData(){
		  Object data [][]=ExcelReader.getTestData("CreatOffers", 2);
			 return data;
	  }
}

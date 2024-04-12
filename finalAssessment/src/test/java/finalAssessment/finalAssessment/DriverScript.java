package finalAssessment.finalAssessment;

public class DriverScript {
public static void main(String[] args) throws Exception {
	

	 String sPath = "d:\\Final Assessment.xlsx";
	 

	 ReadExcelData.setExcelFile(sPath, "Sheet1");
	 
	 for (int iRow=1;iRow<=6;iRow++)
	 {
	 String sActions = ReadExcelData.getCellData(iRow, 1); 
	 

	 if(sActions.equals("openBrowser"))
	 { 
	 AppTest.openBrowser();
	 }
	 else if(sActions.equals("login"))
	 {
		 AppTest.register_signup();
	 }
	 else if(sActions.equals("addProduct"))
	 {
		 AppTest.addToCart();
	 }
	 else if(sActions.equals("checkout"))
	 {
		 AppTest.click_Checkout();
	 }
	 else if(sActions.equals("logout"))
	 {
		 AppTest.logout();
	 }
	 else if(sActions.equals("closeBrowser"))
	 {
		 AppTest.closeBrowser();
	 } 
	 }
	 }
}
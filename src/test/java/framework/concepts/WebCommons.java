package framework.concepts;

public class WebCommons {
	
	public void startReporting() {
		System.out.println("Reporting option was started......");
	}
public void stopReporting() {
	System.out.println("Reporting option was Stopped......");
		
	}
public void launchBrowserAndApplication(String url, String browser) {
	System.out.println("Browser is launched  url : "+url);
	System.out.println("Browser is  browser : "+browser);
	
}
public void closeBrowser() {
	System.out.println("Browser is closed......");
}

}

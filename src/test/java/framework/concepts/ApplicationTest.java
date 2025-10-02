package framework.concepts;

public class ApplicationTest {

	public static void main(String[] args) {
		AppCommons app = new AppCommons();
		WebCommons web = new WebCommons();

		web.startReporting();
		web.launchBrowserAndApplication("http://google.com", "chrome");
		app.loginIntoApplication("vikram", "123123");
		app.verfitApplication();
		app.testcase1();
		app.logoutFromApplication();
		web.stopReporting();
		web.closeBrowser();
		System.out.println("****************");
		web.startReporting();
		web.launchBrowserAndApplication("http://google.com", "chrome");
		app.loginIntoApplication("vikram", "123123");
		app.verfitApplication();
		app.testcase2();
		app.logoutFromApplication();
		web.stopReporting();
		web.closeBrowser();
		System.out.println("****************");
		web.startReporting();
		web.launchBrowserAndApplication("http://google.com", "chrome");
		app.loginIntoApplication("vikram", "123123");
		app.verfitApplication();
		app.testcase3();
		app.logoutFromApplication();
		web.stopReporting();
		web.closeBrowser();

	}

}

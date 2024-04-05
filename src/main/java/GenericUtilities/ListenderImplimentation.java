package GenericUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenderImplimentation implements ITestListener{

	public void onTestFailedWithTimeout(ITestResult result) {
		String failed = result.getMethod().getMethodName();
		TakesScreenshot ss = (TakesScreenshot)BaseClass.sdriver;
		File scr=ss.getScreenshotAs(OutputType.FILE);
		File dst = new File("failed"+failed+".png");
		try {
			FileUtils.copyFile(scr, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

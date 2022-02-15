package utiltiy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportManager {
		// this are static because to avoid object creation where ever it is needed
		//public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports report;

		public static ExtentReports getReportInstance() {

			if (report == null) {
				ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
						System.getProperty("user.dir") + "\\report\\report1.html");
				report = new ExtentReports();
				report.attachReporter(htmlReporter);

				report.setSystemInfo("OS", "windows");
				report.setSystemInfo("Test", "UAT");
				report.setSystemInfo("Tester", "Shubham Lokare");
			}

			return report;
		}
	}

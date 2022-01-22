package factorypattern.controller;

public class ReportFactory {
	public Report getReport(String reportType) {
	    switch (reportType) {
	      case "DAILY":
	        return DailyReport.getDailyReport();
	      case "MONTHLY":
	        return MonthlyReport.getMonthlyReport();
	      case "ANNUAL":
	        return AnnualReport.getAnnualReport();
	    }

	    return null;
	  }
}

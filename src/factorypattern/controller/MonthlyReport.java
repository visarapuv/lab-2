package factorypattern.controller;

public class MonthlyReport extends Report{
	private static MonthlyReport mReport;

	  private MonthlyReport() {}

	  public static MonthlyReport getMonthlyReport() {
	    if (mReport == null) {
	      synchronized (MonthlyReport.class) {
	        if (mReport == null) {
	          mReport = new MonthlyReport(); // instance will be created at request time
	        }
	      }
	    }
	    return mReport;
	  }

	  @Override
	  protected void processReport() {
	    System.out.println("Monthy report being processing started");
	    for (int i = 1; i <= 12; i++) {
	      System.out.println("Month " + i);
	    }
	    System.out.println("Monthly report processing completed");
	  }
}

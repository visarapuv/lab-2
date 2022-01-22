package factorypattern.controller;

public class AnnualReport extends Report {

	  private static AnnualReport aReport;

	  private AnnualReport() {}

	  public static AnnualReport getAnnualReport() {
	    if (aReport == null) {
	      synchronized (AnnualReport.class) {
	        if (aReport == null) {
	          aReport = new AnnualReport(); // instance will be created at request time
	        }
	      }
	    }
	    return aReport;
	  }

	  @Override
	  protected void processReport() {
	    System.out.println("Annual report being processing started");
	    for (int i = 2021; i <= 2023; i++) {
	      System.out.println("Year " + i);
	    }
	    System.out.println("Annual report processing completed");
	  }
	}
package factorypattern.controller;

public abstract class Report {
	  protected abstract void processReport();

	  public void process() {
	   
	          System.out.println("Started process");
	          processReport();
	          System.out.println("Completed process");
	  }
}

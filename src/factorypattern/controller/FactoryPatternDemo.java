package factorypattern.controller;

public class FactoryPatternDemo {
	public static void main(String[] args) {
	    ReportFactory shapeFactory = new ReportFactory();

	    
	    Report shape1 = shapeFactory.getReport("DAILY");


	    shape1.processReport();


	    Report shape2 = shapeFactory.getReport("MONTHLY");


	    shape2.processReport();


	    Report shape3 = shapeFactory.getReport("ANNUAL");


	    shape3.processReport();
	  }
}

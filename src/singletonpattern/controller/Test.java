package singletonpattern.controller;

public class Test {
	 public static void main(String... args){
	     DailyReport d1= DailyReport.getDailyReport();
	     DailyReport d2= DailyReport.getDailyReport();
	     DailyReport d3= DailyReport.getDailyReport();
	 
	}
}	

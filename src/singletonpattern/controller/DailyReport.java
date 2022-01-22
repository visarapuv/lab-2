package singletonpattern.controller;

public class DailyReport {
	private static DailyReport obj;  
	 private DailyReport(){}  
	   
	 public static DailyReport getDailyReport(){  
	   if (obj == null){  
	      synchronized(Singleton.class){  
	        if (obj == null){  
	            obj = new Singleton();//instance will be created at request time  
	        }  
	      }              
	   }  
	  return obj;  
}
}

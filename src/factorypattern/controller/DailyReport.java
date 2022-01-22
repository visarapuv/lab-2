package factorypattern.controller;

public class DailyReport extends Report {
	private static DailyReport dReport;

	private DailyReport() {}

	public static DailyReport getDailyReport() {
		if (dReport == null) {
			synchronized (DailyReport.class) {
				if (dReport == null) {
					dReport = new DailyReport(); // instance will be created at request time
				}
			}
		}
		return dReport;
	}

	@Override
	protected void processReport() {
		System.out.println("Daily report being processing started");
		for (int i = 1; i <= 30; i++) {
			System.out.println("Day " + i);
		}
		System.out.println("Daily report processing completed");
	}
}

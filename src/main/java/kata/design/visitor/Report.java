package kata.design.visitor;

public class Report {

	private String report;

	public Report(int hours, float wage) {
		report = String.format("Hours: %d Pay: %.1f", hours, wage);
	}
	
	public String getDetail() {
		return report;
	}

}

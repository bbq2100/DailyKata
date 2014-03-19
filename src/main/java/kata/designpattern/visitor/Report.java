package kata.designpattern.visitor;

public class Report {

	private String report;

	public Report(String report) {
		this.report = report;
	}
	
	public String getDetail() {
		return report;
	}

}

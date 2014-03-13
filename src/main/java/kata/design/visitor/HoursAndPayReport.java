package kata.design.visitor;

public class HoursAndPayReport implements EmployeeVisitor {

	private Report report;

	public void visit(HourlyEmployee employee) {
		report = new Report(employee.getHours(),employee.getWage());
	}

	public void visit(SalariedEmployee employee) {
		throw new UnsupportedOperationException("This report is only applicable for HourlyEmployee");
	}
	
	public Report getReport() {
		return report;
	}

}

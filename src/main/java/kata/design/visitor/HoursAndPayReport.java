package kata.design.visitor;

public class HoursAndPayReport implements EmployeeVisitor {

	private Report report;

	@Override
	public void visit(HourlyEmployee employee) {
		report = new Report(String.format("Hours: %d Pay: %.1f $", employee.getHours(),employee.getWage()));
	}

	@Override
	public void visit(SalariedEmployee employee) {
		throw new UnsupportedOperationException("This report is only applicable for HourlyEmployee");
	}
	
	public Report getReport() {
		return report;
	}

}

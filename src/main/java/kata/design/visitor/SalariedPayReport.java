package kata.design.visitor;

public class SalariedPayReport implements EmployeeVisitor {

	private Report report;

	@Override
	public void visit(HourlyEmployee employee) {
		throw new UnsupportedOperationException("This is report is not applicable for a Hourly Employee");
	}

	@Override
	public void visit(SalariedEmployee employee) {
		this.report = new Report(String.format("Salary: %.2f $", employee.getSalary()));
	}

	public Report getReport() {
		return report;
	}
	
}

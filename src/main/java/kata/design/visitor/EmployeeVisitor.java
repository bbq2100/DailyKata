package kata.design.visitor;

public interface EmployeeVisitor {
	void visit(HourlyEmployee employee);
	void visit(SalariedEmployee employee);
}

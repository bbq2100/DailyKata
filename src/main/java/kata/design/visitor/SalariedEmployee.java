package kata.design.visitor;

public class SalariedEmployee extends Employee {

	@Override
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
	}

}

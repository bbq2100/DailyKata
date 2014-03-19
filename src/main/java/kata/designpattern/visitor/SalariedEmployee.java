package kata.designpattern.visitor;

public class SalariedEmployee extends Employee {

	private float salary;

	public SalariedEmployee(float salary) {
		this.salary = salary;
	}

	@Override
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
	}
	
	public float getSalary() {
		return salary;
	}

}

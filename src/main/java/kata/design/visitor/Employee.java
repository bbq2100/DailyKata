package kata.design.visitor;

public abstract class Employee {
	public abstract void accept(EmployeeVisitor visitor);
}

package kata.designpattern.visitor;

public abstract class Employee {
	public abstract void accept(EmployeeVisitor visitor);
}

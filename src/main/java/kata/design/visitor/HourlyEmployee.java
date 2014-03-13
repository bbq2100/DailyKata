package kata.design.visitor;

public class HourlyEmployee extends Employee {

	private int hours;
	private float wage;
	
	public HourlyEmployee(int hours, float wage) {
		this.hours = hours;
		this.wage = wage;
	}

	@Override
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
	}

	public int getHours() {
		return hours;
	}

	public float getWage() {
		return wage;
	}
	
}

package kata.design.visitor;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EmployeeVisitorTest {

	@Test
	public void testHourlyEmplyoeeReport() {
		Employee employee = new HourlyEmployee(8,17.5F);
		HoursAndPayReport reportVisitor = new HoursAndPayReport();
		employee.accept(reportVisitor);
		assertThat(reportVisitor.getReport().getDetail(), is(equalTo("Hours: 8 Pay: 17.5")));
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testSalariedEmployeeReport() {
		Employee salariedEmployee = new SalariedEmployee();
		HoursAndPayReport hoursAndPayReport = new HoursAndPayReport();
		salariedEmployee.accept(hoursAndPayReport);
	}
	
}

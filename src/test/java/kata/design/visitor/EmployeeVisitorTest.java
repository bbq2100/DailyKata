package kata.design.visitor;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EmployeeVisitorTest {

	@Test
	public void shouldGetHoursAndPayReportForHourlyEmployyee() {
		Employee employee = new HourlyEmployee(8,17.5F);
		HoursAndPayReport reportVisitor = new HoursAndPayReport();
		employee.accept(reportVisitor);
		assertThat(reportVisitor.getReport().getDetail(), is(equalTo("Hours: 8 Pay: 17.5 $" )));
	}

	@Test(expected=UnsupportedOperationException.class)
	public void shouldGetHoursAndPayReportForSalariedEmployee() {
		Employee salariedEmployee = new SalariedEmployee(1800F);
		HoursAndPayReport hoursAndPayReport = new HoursAndPayReport();
		salariedEmployee.accept(hoursAndPayReport);
	}
	
	@Test
	public void shouldGetSalariedPayReportForSalariedEmployee() {
		Employee salariedEmployee = new SalariedEmployee(11250.36F);
		SalariedPayReport reportVisitor = new SalariedPayReport();
		salariedEmployee.accept(reportVisitor);
		assertThat(reportVisitor.getReport().getDetail(), is(equalTo("Salary: 11250.36 $")));
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void shouldGetSalariedPayReportForHourlyEmployee() {
		Employee hourlyEmployee = new HourlyEmployee(51, 515F);
		hourlyEmployee.accept(new SalariedPayReport());
	}
}

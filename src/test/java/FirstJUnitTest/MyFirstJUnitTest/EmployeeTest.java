package FirstJUnitTest.MyFirstJUnitTest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import FirstJUnitTest.MyFirstJUnitTest.EmployeeEntity.Employee;
import FirstJUnitTest.MyFirstJUnitTest.EmployeeRepository.EmployeeRepository;

@SpringBootTest
public class EmployeeTest {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Test
	public void insertEmployee()
	{
		/*
		 * Employee emp=new Employee(); emp.setEmpName("Maharaja"); emp.setSal(20000);
		 * emp.setLocation("Dindigul"); Employee
		 * employeeValues=employeeRepository.save(emp);
		 * System.out.println(employeeValues.getEmpName());
		 * System.out.println(employeeValues.getid());
		 * System.out.println(employeeValues.getLocation());
		 * System.out.println(employeeValues.getSal());
		 */
	}
	@Test
	public void getByNameSal()
	{
	    List<Employee> employee1=employeeRepository.getByNameSal("Maharaja","Dindigul"); 
	    //employee1.forEach(n->System.out.println(n.getEmpName()));
	    System.out.println(employee1);
	}

}

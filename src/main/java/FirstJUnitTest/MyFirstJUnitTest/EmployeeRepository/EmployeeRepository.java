package FirstJUnitTest.MyFirstJUnitTest.EmployeeRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import FirstJUnitTest.MyFirstJUnitTest.EmployeeEntity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	@Query("select e from Employee e where e.empName=?1 and e.id=?2")
	public List<Employee> getByNameSal(String empName,String location);
	
	@Query("select e from Employee e where e.empName=:name or location=:emplocation")
	public List<Employee> getByNameLocationNamedParam(@Param("name") String empName,@Param("emplocation") String location);
	
}

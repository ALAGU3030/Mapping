package FirstJUnitTest.MyFirstJUnitTest.EmployeeController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import FirstJUnitTest.MyFirstJUnitTest.EmployeeEntity.Employee;
import FirstJUnitTest.MyFirstJUnitTest.EmployeeService.EmployeeService;
import FirstJUnitTest.MyFirstJUnitTest.dto.PostResponse;

@RestController
@RequestMapping("api")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;
@PostMapping("insertrow")
public Employee saveEmployee(@RequestBody Employee employee)
{
	return employeeService.saveEmployee(employee);
}


  @GetMapping("getemployee/{empName}/{location}") 
 // public List<Employee> GetEmployee(@RequestParam("empName") String name,@RequestParam("location") String location) 
  public List<Employee>GetEmployee(@PathVariable("empName")String name,@PathVariable("location")String location) 
  {
	  return employeeService.getEmployee(name, location);
  }
 
@GetMapping("getemployeeNamed")
public List<Employee> GetEmployeeUsingNamed(@RequestParam("empName") String name,@RequestParam("location") String location)
{
	return employeeService.getEmployeeUsingOr(name, location);
}

@GetMapping("getPage")
public PostResponse getAllEmployee(@RequestParam(name="pageNo",required=false,defaultValue="0") int pageNo,
								   @RequestParam(name="pageSize",required=false,defaultValue="5")int pageSize,
								   @RequestParam(name="sortBy",required=false,defaultValue="sal")String sortBy,
								   @RequestParam(name="sortDir",required=false,defaultValue="ASC") String sortDir
								   )
{
	PostResponse allEmployee=employeeService.getAllStudent(pageNo, pageSize,sortBy,sortDir);
	return allEmployee;
}
}

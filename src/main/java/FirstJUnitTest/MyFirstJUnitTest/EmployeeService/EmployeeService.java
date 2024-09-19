 package FirstJUnitTest.MyFirstJUnitTest.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import FirstJUnitTest.MyFirstJUnitTest.EmployeeEntity.Employee;
import FirstJUnitTest.MyFirstJUnitTest.EmployeeRepository.EmployeeRepository;
import FirstJUnitTest.MyFirstJUnitTest.dto.PostResponse;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;

public Employee saveEmployee(Employee employee)
{
	return employeeRepository.save(employee);
}

public List<Employee> getEmployee(String name,String location)
{
	return employeeRepository.getByNameSal(name, location);
}


public List<Employee> getEmployeeUsingOr(String name,String emplocation)
{
	return employeeRepository.getByNameLocationNamedParam(name, emplocation);
}

public PostResponse getAllStudent(int pageNo,int PageSize,String sortBy,String sortDir)
{
	Sort sort=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())
			?Sort.by(sortBy).ascending():
					Sort.by(sortBy).descending();
	
	Pageable pageable=PageRequest.of(pageNo, PageSize,sort);
	Page<Employee> employee=employeeRepository.findAll(pageable);
	List<Employee> listOfEmp=employee.getContent();
	PostResponse postresponse=new PostResponse();
	postresponse.setContent(listOfEmp);
	postresponse.setPageNo(employee.getNumber());
	postresponse.setPageSize(employee.getNumberOfElements());
	postresponse.setTotalElements(employee.getTotalElements());
	postresponse.setTotalPages(employee.getTotalPages());
	
	return postresponse;
	
	
}



}

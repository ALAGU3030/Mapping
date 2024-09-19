package FirstJUnitTest.MyFirstJUnitTest.EmployeeEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empName;
	private int sal;
	private String location;
	public Employee(int id, String empName, int sal, String location) {
		this.id = id;
		this.empName = empName;
		this.sal = sal;
		this.location = location;
	}
	public Employee() {
	
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", empName=" + empName + ", sal=" + sal + ", location=" + location + "]";
	}
	
	
	

}

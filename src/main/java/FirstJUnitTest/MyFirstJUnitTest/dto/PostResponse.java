package FirstJUnitTest.MyFirstJUnitTest.dto;
import java.util.List;
import FirstJUnitTest.MyFirstJUnitTest.EmployeeEntity.Employee;
public class PostResponse {
	private List<Employee> content;
	private int pageNo;
	private int pageSize;
	private long totalElements;
	private int totalPages;
	private Boolean last;
	public PostResponse(List<Employee> content, int pageNo, int pageSize, long totalElements, int totalPages,Boolean last) {
		this.content = content;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.last = last;
	}
	
	
	public PostResponse() {
		super();
	}


	public List<Employee> getContent() {
		return content;
	}
	public void setContent(List<Employee> content) {
		this.content = content;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public Boolean getLast() {
		return last;
	}
	public void setLast(Boolean last) {
		this.last = last;
	}
	
	
	

}

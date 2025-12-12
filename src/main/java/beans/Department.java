package beans;

import java.util.List;
import java.util.Objects;

public class Department {
	private int deptNo;
	private String deptName;
	private String loc;
	private List<Employee> empList;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptNo, String deptName, String loc, List<Employee> empList) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.loc = loc;
		this.empList = empList;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptName, deptNo, loc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(deptName, other.deptName) && deptNo == other.deptNo && Objects.equals(loc, other.loc);
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", location=" + loc + "]";
	}

}

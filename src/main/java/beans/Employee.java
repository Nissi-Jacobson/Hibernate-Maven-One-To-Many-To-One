package beans;

import java.util.Objects;

public class Employee {
	private int eid;
	private String ename;
	private double sal;
	private String desig;
	private Department dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double sal, String desig, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.desig = desig;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, desig, eid, ename, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(desig, other.desig) && eid == other.eid
				&& Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", desig=" + desig + ", dept=" + dept
				+ "]";
	}

}

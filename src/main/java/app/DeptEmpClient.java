package app;

import beans.Employee;
import beans.Department;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeptEmpClient {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		save(session);
	}
	
	public static void save(Session session) {

		Department d1 = new Department(0, "batch1", "ban1", null);
		
		Employee e1 = new Employee(0, "cdc", 30000.00, "e", d1);
		Employee e2 = new Employee(0, "bgb", 70000.00, "t", d1);
		Employee e3 = new Employee(0, "ads", 50000.00, "e", d1);
		Employee e4 = new Employee(0, "cgd", 40000.00, "d", d1);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		d1.setEmpList(empList);
		Transaction tx = session.beginTransaction();
		try {
			session.persist(d1);
			tx.commit();
			System.out.println("TX Success");
		} catch(Exception e) {
			tx.rollback();
			System.out.println("TX Failed");
			e.printStackTrace();
		}
	}
}

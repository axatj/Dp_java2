package com.containment;

class Employee {
	private int eid;
	private String ename;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public String getEanme() {
		return ename;
	}
}

public class Department {
	private int did;
	private String dname;
	private Employee emp;

	public void setDid(int did) {
		this.did = did;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public int getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

	public Employee getEmp() {
		return emp;
	}

	public static void main(String[] args) {
		Department dt = new Department();
		dt.setDid(101);
		dt.setDname("HR");
		dt.setEmp(new Employee());
		Employee e = dt.getEmp();
		e.setEid(1);
		e.setEname("Sonia");

		System.out.println(dt.getDid());
		System.out.println(dt.getDname());
		System.out.println(e.getEid());
		System.out.println(e.getEanme());
	}

}

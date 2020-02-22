package com.busyqa.coursework.wk2_meghana.ClassAndObjects;

public class Employee {
	
	//instance variables
	
	private int eid;
	private String ename;
	private double sal;
	private String job;
	
	//methods
	public void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(job);
	}
	
	public void bonus()
	{
		System.out.println((sal * 10)/100);
	}

	//default constructor
	public Employee() {
		this.eid = 1;
		this.ename = "Anonymous";
		this.sal = 0.0;
		this.job = "Staff";
	}
	
	//Constructor
	
	public Employee(int eid, String ename, double sal, String job) {
		
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.job = job;
	}

	

	//getters

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getSal() {
		return sal;
	}

	public String getJob() {
		return job;
	}
	
	//setters

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	//toString Override

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", job=" + job + "]";
	}
	
	

	
	
	
	
	
	
	

}

package com.busyqa.coursework.wk2_meghana.ClassAndObjects;

import com.busyqa.coursework.wk2_meghana.ClassAndObjects.Employee;

public class MainHandle {

	public static void main(String[] args) {
	
		Employee temp = new Employee();
		Employee emp1 = new Employee(1001,"Rocky DSouza",67000,"Marketing Rep");
		
		System.out.println(temp);
		System.out.println(emp1);
		
		temp.setEid(2000);
		temp.setEname("Malaka");
		temp.setJob("Freedom Fighter");
		temp.setSal(2000.0);

		System.out.println(temp);
	}

}

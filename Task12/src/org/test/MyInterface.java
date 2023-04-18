package org.test;

public interface MyInterface {
	void empName();
	
	  default void empId() {
		  System.out.println("Employee Id:1234");
	  }
    static void empPhno() {
  	  System.out.println("Employee Phno:8823145567");
    }

}

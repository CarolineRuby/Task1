package org.college;

public class Student {
	public void studentName() {
		System.out.println("Caroline Ruby");
	}
	public void studentDept() {
		System.out.println("ECE");
	}
	public void studentId() {
		System.out.println("212019");
	}
	
	public static void main(String[] args) {
		Student studentdetails = new Student();
		//College Collegedetails = new College();
		studentdetails.studentName();
		studentdetails.studentDept();
		studentdetails.studentId();
	}

}

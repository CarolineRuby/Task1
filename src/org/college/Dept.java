package org.college;

public class Dept {
	private void deptName() {
		System.out.println("ELectronics and Communication Engineering");
	}
	
	public static void main(String[] args) {
		Dept department = new Dept();
		College Collegedetails = new College();
		Student Studentdetails = new Student();
		Hostel1 Hostelname = new Hostel1();
		Collegedetails.collegeName();
		Collegedetails.collegeCode();
		Collegedetails.collegeRank();
		Studentdetails.studentName();
		Studentdetails.studentDept();
		Studentdetails.studentId();
		Hostelname.hostelName();
		department.deptName();
		}
	}

package org.college;

public class College {
	public void collegeName() {
		System.out.println("Saranathan College of Engineering");
	}
	public void collegeCode() {
		System.out.println("8138");
	}
	public void collegeRank() {
		System.out.println("8th");
	}
	
	public static void main(String[] args) {
		College collegedetails = new College();
		collegedetails.collegeName();
		collegedetails.collegeCode();
		collegedetails.collegeRank();
	}

}

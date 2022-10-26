//defining pacakage
package com.StudentFeesManagement;

//defining the class StudentDetails 
public class StudentDetails {
	
	//declaring private instance variables 
	private int id;
	private String name;
	private String courseName;
	private double fees;
	private String feesStatus;
	
	//declaring Constructors 
		//without parameter 
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//declaring Constructors 
	//using parameters
	public StudentDetails(int id, String name, String courseName, double fees, String feesStatus) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
		this.fees = fees;
		this.feesStatus = feesStatus;
	}
	
	//getter and setter method methods 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getFeesStatus() {
		return feesStatus;
	}
	public void setFeesStatus(String feesStatus) {
		this.feesStatus = feesStatus;
	}
	
	//toString method 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + ", fees=" + fees
				+ ", feesStatus=" + feesStatus + "]";
	}
	
	
}//end of class

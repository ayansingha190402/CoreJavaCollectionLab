//defining pacakage
package com.StudentFeesManagement;

//importing packages 
import java.util.HashMap;
import java.util.Scanner;

//declaring class StudentCollectionMap
public class StudentCollectionMap {

	//declaring main methods 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creating a hashmap 
		HashMap<String, StudentDetails> sDetails = new HashMap<>();
		
		//declaring String Variable
		String uniqueID;
		

		// creating object for scanner class 
		Scanner sc = new Scanner(System.in);
		
		// creating StudentDetails object
		StudentDetails sInfo = new StudentDetails();
		
		//adding students  details  
		sDetails.put("MIT1101", new StudentDetails(01, "AYAN SINGHA", "JAVA", 1500, "FULLY PAID"));
		sDetails.put("BCROY1102", new StudentDetails(02, "ANIRBAN BHUNIA", "BAISC PROGRAMMING IN C", 0, "NOT PAID"));
		sDetails.put("JIS1103", new StudentDetails(03, "SUBHADIP KUNDU", "PROGRAMMING IN C++", 1000, "FULLY PAID"));
		sDetails.put("NITK1104", new StudentDetails(04, "JAYANTA CAHTTERJEE", "AI IN PYTHON", 3000, "PARTIALLY  PAID"));
		sDetails.put("HIT1105", new StudentDetails(05, "UDAY MAHATO", "PROGRAMMING IN C", 1300, "FULLY PAID"));
		sDetails.put("BPPIMT1106", new StudentDetails(06, "AVIK GHOSH", "JAVA", 1200, "PARTIALLY PAID"));
		sDetails.put("GNIT1107", new StudentDetails(07, "MD KAIF MANZAR", "DSA USING C++", 0, "NOT PAID"));
		
		//printing 
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("----STUDENT  FEES  MANAGEMENT------");
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		
		System.out.println("Enter the student UNIQUE ID :");
		
		//taking input
		uniqueID = sc.next();
		
		// check : Student Details  is present in the database or not 
		boolean status = sDetails.containsKey(uniqueID);

		// displaying the information

		if (status) 
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("----------------STUDENT  DETAILS AS PER DATABASE-------------");
			System.out.println("-------------------------------------------------------------");
			sInfo = sDetails.get(uniqueID);
			System.out.println(sInfo);

		}

		else 
		{
			System.out.println("-------------------------------------------------------------------");
			System.out.println("----------------STUDENT  DETAILS NOT FOUND IN DATABASE-------------");
			System.out.println("-------------------------------------------------------------------");
		}
		
		//closing class 
		sc.close();


	}//end of main method

}//end of class 

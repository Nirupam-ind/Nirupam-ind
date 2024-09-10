package com;

import java.util.Scanner;

public class EmployeeApp {
	
	public static void main(String[] args) {
		EmployeeService e1=new EmployeeServiceImpl(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("=====Welcome to Employee DB=====");
		while(true) {
			System.out.println("====Menu====");
			System.out.println("1.Create Employee Db \n2.Available Index \n3.Add Employee \n4.Display all \n5.Display Emp Details by ID ");
			System.out.println("\n6.Delete Emp Details By ID \n7.Exit");
			System.out.println("Enter your Option");
			int op=sc.nextInt();
			switch(op) {
			case 1: System.out.println("Enter the size of Db");
					int size=sc.nextInt();
					e1.createEmployeeDb(size);break;
					
			case 2: e1.AvailableIndex();
					break;
					
			case 3: System.out.println("Enter the index value");
			 		int in=sc.nextInt();
			 		e1.addEmployee(in);
			 		break;
			case 4: e1.displayAllEmp();
					break;
			case 5:System.out.println("Enter the Emp ID");
			 	   int eid=sc.nextInt();
			 	   e1.getEmpbyId(eid);
			 	   break;
			case 6: System.out.println("Enter the Emp ID");
			 	    int id=sc.nextInt();
			        e1.deleteEmpbyID(id);
			        break;
			
			case 7:System.out.println("===Thank You Visit Again===");
					System.exit(0);
			default:
					System.out.println("Invalid Option");
			
			}
		}
	}
}

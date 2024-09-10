
package com;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

	Employee[] eDb;
	Scanner sc=new Scanner(System.in);
	@Override
	public void createEmployeeDb(int size) {
		eDb=new Employee[size];
		System.out.println("Employee Db has been  created with size "+ size);
		
	}
	
	@Override
	public void AvailableIndex() {
		int c=0;
		System.out.println("=====Available Indexes are=========");
		for(int i=0;i<eDb.length;i++) {
			if(eDb[i]==null) {
				System.out.print(i+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.print("Database is Full...!!!");
		}
		System.out.println();
	}

	@Override
	public void addEmployee(int index) {
			if(index>=eDb.length) {
				System.out.println("Invalid Index no");
			}
			else if(eDb[index]!=null) {
				System.out.println("Index Already Occupied...!");
			}
			else {
				System.out.println("Enter Emp Id");
				int eid=sc.nextInt();
				System.out.println("Enter Emp Name");
				String ename=sc.next();
				System.out.println("Enter the Designation");
				String desgn=sc.next();
				System.out.println("Enter the Salary");
				double sal=sc.nextDouble();
				
				eDb[index]=new Employee(eid, ename, desgn, sal);
				System.out.println("Employee has been added Successfully...!!");
			}
	}

	@Override
	public void displayAllEmp() {
		int c=0;
		System.out.println("=====Employees Details====");
		for(Employee ele:eDb) {
			if(ele!=null) {
				System.out.println(ele);
				c++;
			}
		}
		if(c==0) {
			System.out.println("Database is Empty");
		}
	}

	@Override
	public void getEmpbyId(int eid) {
		int c=0;
		for(Employee ele:eDb) {
			if(ele!=null) {
				if(ele.getEid()==eid) {
					System.out.println(ele);
					c++;
				}
			}
		}
		if(c==0) {
			System.out.println("Emp ID not Found");
		}
		
	}

	@Override
	public void deleteEmpbyID(int eid) {
		int c=0;
	    for (int i = 0; i < eDb.length; i++) {
	        if (eDb[i] != null && eDb[i].getEid() == eid) {
	            eDb[i] = null; 
	            System.out.println("Emp Details deleted Successfully!!!");
	            c++;
	            break; 
	        }
	        
	    }
	    if(c==0) {
	    	System.out.println("Employee Record Not Found....");
	    }
	}


}

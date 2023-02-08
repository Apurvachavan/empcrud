package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import com.pojo.Employee;

public class Empcrud {

	public static void main(String[] args) {
	 
		Collection<Employee> c=new ArrayList<Employee>();
     Scanner sc= new Scanner(System.in);
     Scanner sc1= new Scanner(System.in);
     boolean exit = false;
   while(!exit) {
    	 System.out.println("1.Insert 2.Display 3.Search 4.Delete 100.Exit" );
    	 System.out.println("enter your choice");
    
    	 switch (sc.nextInt()) {
    	 
    	 case 1:
    		 System.out.println("Enter Empno: ");
    		 int eno= sc.nextInt();
    		 System.out.println("Enter Ename: ");
    		 String name=sc1.nextLine();
    		 System.out.println("Enter salary: ");
    		 int salary=sc.nextInt();
    		 c.add(new Employee(eno, name, salary));
    		 
    		 break;
    	  
    	 case 2:
    		 System.out.println("----------------------------");
    		 Iterator<Employee> i= c.iterator();
    		 while(i.hasNext()) {
    			 Employee e=i.next();
    			 System.out.println(e);
    		 }
    		 System.out.println("---------------------");
    	 break;
    	 
    	 case 3:
    		 boolean found= false;
   
    		 System.out.println("enter empno to search");
    		  int empno= sc.nextInt();
    	 		 i=c.iterator();
    	 		while(i.hasNext()) {
       			 Employee e=i.next();
       			 if(e.getEmpno()==empno) {
       				System.out.println(e);
       				 found=true; }
       			 }
    	 		if(!found) {
    	 			System.out.println("not found");
    	 		}
    	 		System.out.println("-------------");
    		 break;
    		 
    			 
    	 case 4:
    		 found= false;
    		   
    		 System.out.println("enter empno to delete");
    		   empno= sc.nextInt();
    	 		 i=c.iterator();
    	 		while(i.hasNext()) {
       			 Employee e=i.next();
       			 if(e.getEmpno()==empno) {
       				i.remove();
       				 found=true; 
       				 }
       			 }
    	 		if(!found) {
    	 			System.out.println("not found");
    	 		}else {
    	 			System.out.println("deleted succsefully");
    	 		}
    	 		System.out.println("-------------");
    		 break;
    		 
    		 
    	
    	 case 100:
    		 exit = true;
			break;
    	 
    	 }
    	 
     
    	 
    	 
    	 
   }
		
		
	}

}

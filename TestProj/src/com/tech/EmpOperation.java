package com.tech;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Emp{
	
	public Emp() {
		super();
	}
	
	private String ename;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", dept=" + dept + ", salary=" + salary + ", age=" + age + "]";
	}
	private String dept;
	private double salary;
	private int age;
}





public class EmpOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		List<Emp> empList=new ArrayList<Emp>();
		// creating employee object to store values in list
		for(int i=0 ; i<7 ;i++) {
		Emp emp=new Emp();
		emp.setAge(((i+1)*38)%10);
		if(i == 0) {
		emp.setDept("CSE");
		}else if( i == 1 ) {
			emp.setDept("MEC");
		}else {
			emp.setDept("IT");	
		}
		emp.setSalary((Math.random()*100000));
		emp.setEname("Krishn"+i);
		empList.add(emp);
		}
		
		empList.forEach( e -> System.out.println("name : "+e.getEname() +",  Salary : "+e.getSalary() +",  dept : "+e.getDept()));
		
		// group by emp in each dept 
		
	Map<String,Long>	groupByDept=empList.stream().collect(Collectors.groupingBy(Emp :: getDept,Collectors.counting()));
	
	groupByDept.forEach( ( k , v) -> System.out.println(" Dept : "+ k  + " List of Employees Count :  "+v ) );

	// sort by salary
 List<Emp>	sortedBySalary=empList.stream().sorted( 
			(e1 , e2) -> 
			{ return (e1.getSalary() > e2.getSalary()) ? -1 : (e1.getSalary() < e2.getSalary()) ? 1 : 0 ;})
	        				.collect(Collectors.toList());
	    sortedBySalary.forEach( e  -> System.out.println( e.getEname() +" : "+e.getSalary() ));
	    
	  // sort salary with another way 
	    List<Emp> elist = empList.stream().sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
	    
	    elist.forEach(System.out :: println);
	    // compare salary 
	Map<String , Double> maxSalaryByDept =empList.stream().collect(Collectors.groupingBy(Emp :: getDept ,
			                                              Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Emp :: getSalary)),     
			                                                                            		 v -> v.get().getSalary())));
	
                  System.out.println(empList.stream().collect(Collectors.groupingBy(Emp :: getDept , Collectors.maxBy(Comparator.comparing(Emp :: getSalary)))).entrySet());
	System.out.println(" employee  max salry by each dept : "+maxSalaryByDept);
	  
	  
	// avg salary by each dept
 Set<Entry<String, Long>>	 avgSalEachDept=empList.stream().collect(Collectors.groupingBy(Emp :: getDept ,
			 Collectors.collectingAndThen(Collectors.averagingDouble(Emp :: getSalary), e -> e.longValue())
			 )).entrySet();
 
 avgSalEachDept.forEach(l -> System.out.println(" key : "+l.getKey() +" value : " + l.getValue()));
           
 
 // sort employee by salary
List<Emp>  sortEmpBySal =empList.stream().sorted((e1 , e2 ) -> {return (e1.getSalary() > e2.getSalary()) ? -1 : (e1.getSalary() < e2.getSalary()) ? 1 : 0 ;} ).collect(Collectors.toList());
  System.out.println(empList.stream().sorted((e1,e2) -> {return -e1.getEname().compareTo(e2.getEname()) ;}).collect(Collectors.toList()));
 System.out.println("=====================================");
sortEmpBySal.forEach(System.out :: println);

List<Emp> li = empList.stream().sorted((e1 ,e2) -> 
                     {
                    	if(e1.getSalary() == e2.getSalary()) {
                    	return -e1.getEname().compareTo(e2.getEname()) ;
                    	} else {
                    	return (e1.getSalary() > e2.getSalary()) ? -1 : (e1.getSalary() > e2.getSalary()) ? 1 : 0 ;
                    	}
                     }
		         ).collect(Collectors.toList());

// create map and then sorting based on id
Map<String , Emp> emap=new HashMap<>();
   
emap=empList.stream().sorted((e1,e2) -> {return (e2.getEname().compareTo(e1.getEname()));})
											.collect(Collectors.toMap(Emp :: getEname, Function.identity()));

//Set<Entry<String,Emp>> setOfEntry=emap.entrySet();
// Set<Entry<String,Emp>> newSetOfEntry=setOfEntry.stream().sorted((e1,e2) -> {return e1.getKey().compareTo(e2.getKey()) ;}).collect(Collectors.toSet());

   System.out.println("sorted by empName : "+emap);
     System.out.println("employee  "+li);
     
     String name = "naveen";
     
     HashMap<String, String> input=new HashMap<>();
     input.put("a", "1");
     input.put("b", "5");
     input.put("c", "2");
     input.put("d", "4");
     HashMap<String,Integer> output=new HashMap<>();
     input.forEach((k,v)->{
    	 int i = Integer.parseInt(v);
    	 if(i%2 ==0 ) 
    		 output.put(k, i);
    	 });
    System.out.println("output : "+output);
 // number is prime or not 
 	int number =11;
 	 boolean flagg=false;
 	 for(int i=2; i <= number/2;i++) {
         if(number%i == 0) {
        	flagg=true; 
         } 
 	 }
 	if(flagg == false) {
 		System.out.println("number is prime : ");
 	}else {
 		System.out.println("number is not prime : ");;
 	}
 	
 	
	}		  
}

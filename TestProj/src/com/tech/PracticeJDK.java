package com.tech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee5{
	
	private int empId;
	@Override
	public String toString() {
		return "EmployeeLatest [empId=" + empId + ", name=" + name + ", deptName=" + deptName + ", empSalary="
				+ empSalary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	private String name;
	private String deptName;
	private double empSalary;
	
	public Employee5(int empId, String name,String deptName,double empSalary) {
		this.empId = empId;
		this.deptName = deptName;
		this.empSalary = empSalary;
		this.name = name;		
	}
	
}

public class PracticeJDK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee5 emp1 = new Employee5(1, "Krishn", "IT", 20000);
		Employee5 emp2 = new Employee5(2, "Krishn", "AI", 10000);
		Employee5 emp3 = new Employee5(3, "Krishn", "AI", 25000);
		Employee5 emp4 = new Employee5(4, "Krishn", "IT", 43000);
		
       // store list of emp
		List<Employee5> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		empList.forEach(elist -> System.out.println("employee deatils : "+elist));
		
		
		// sort employee in desc order by salary 
		List<Employee5> sortedEmpListBySalary = empList.stream().sorted((e1,e2) ->  { 
			return e1.getEmpSalary() > e2.getEmpSalary() ? -1 : e1.getEmpSalary() < e2.getEmpSalary() ? 1 : 0 ; }).collect(Collectors.toList());
		
		sortedEmpListBySalary.forEach(System.out :: println);
		
		// print employee name and employee salary one by one 
		
		sortedEmpListBySalary.forEach(employee -> {System.out.println("employee name "+employee.getName() + "Employee Salary " +employee.getEmpSalary());});
		
		// count of employee from each specific dept 
		
		Map<String,Long> empCountByDept = empList.stream().collect(Collectors.groupingBy(Employee5 :: getDeptName , Collectors.counting()));
		
		// iterate map 
		empCountByDept.entrySet().forEach(entry -> System.out.println("Employee Dept Name : "+entry.getKey() + " Number Of Employee Count : "+entry.getValue()));
		
		// maximum salary by each dept
	 Map<String, Employee5> employeeMaxSalaryByDeptName = empList.stream().collect(Collectors.groupingBy(Employee5 :: getDeptName , Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee5 :: getEmpSalary)), value -> value.get())));

	 employeeMaxSalaryByDeptName.entrySet().forEach(entry -> {System.out.println("Employee Dept Name : "+entry.getKey() +" : Employee Max Salary Employee Detail :  "+entry.getValue());});
	 
	 
	 // do some filter operation on emp list 
	 List<Employee5> employee = empList.stream().filter(emp -> emp.getEmpSalary() > 20000).collect(Collectors.toList());
	 System.out.println("employee : "+employee);
	 
	 // insert Employee in map using stream       employee id will be the key and value will be the employee object
	 
	    Map<Integer, Employee5> empMap = empList.stream().collect(Collectors.toMap(Employee5 :: getEmpId, Function.identity()));
	    System.out.println("Employee object inserted in map : "+empMap);
	    
	    // normal traditional way to get entry from map
	    for(Map.Entry entry : empMap.entrySet()) {
	    	System.out.println("Key : "+entry.getKey() + " : Value : "+entry.getValue());
	    }
	    // map collection views 
	   Set<Entry<Integer, Employee5>> setOfEntry = empMap.entrySet();
	   // iterate each entry from the map
	    for(Map.Entry  entry : setOfEntry) {
	    	System.out.println("get entry one by one from set : "+entry);
	    }
	}

}

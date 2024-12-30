package com.tech;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee1{
	
	private String name;
	private float esalary;
	private Long id;
	private int deptID;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = (long) id;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	public Employee1(String name, float esalary, Long id, int deptID) {
		super();
		this.name = name;
		this.esalary = esalary;
		this.id = id;
		this.deptID = deptID;
	}

	public Employee1(String name,float esalary) {
		this.name=name;
		this.esalary=esalary;
	}
	public Employee1() {
		
	}

	public String getName() {
		return name;
	}

	

	public float getEsalary() {
		return esalary;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", esalary=" + esalary + ",id=" + id +" ,deptID=" + deptID +",]";
	}

 
	
	
}


public class SortByEmployeeSalary {

	
	
	public static void main(String[] p) {
		
		List<Employee1> list=new ArrayList<Employee1>();
		list.add(new Employee1("Krishn", 4000.99f));
		list.add(new Employee1("ram", 2910.99f));
		list.add(new Employee1("radha", 3600.99f));
		list.add(new Employee1("Bhagwat", 3800.99f));
		
		list.add(new Employee1("Bhagwat", 3800.99f,101l,102));
		list.add(new Employee1("Bhagwat2", 3800.99f,102l,103));
		list.add(new Employee1("Bhagwat3", 3800.99f,103l,102));
		list.add(new Employee1("Bhagwat5", 3700.99f,104l,103));
		list.add(new Employee1("Bhagwat7", 3800.99f,105l,102));
		
	 List<Employee1> le=list.stream().sorted((e1,e2) -> {return (e1.getEsalary()>e2.getEsalary())?-1:(e1.getEsalary()<e2.getEsalary())?1:0 ;}).collect(Collectors.toList());
	 
	 System.out.println("Sorted by employee salary : "+le);
	 
	    Map<Integer, List<Employee1>> groupBydeptID=list.stream().collect(Collectors.groupingBy(Employee1::getDeptID,Collectors.toList()));
	 
	    groupBydeptID.entrySet().forEach( entry ->System.out.println(entry.getKey() +  " :: " +entry.getValue()));
	 
	   List<Employee1> emp1 =list.stream().filter(emp -> emp.getEsalary()>2000 || emp.getEsalary()>3333).collect(Collectors.toList());
	 
		emp1.forEach(System.out::println);
		                     
		 Employee1 maxSalary =list.stream().max(Comparator.comparing(Employee1::getEsalary)).get();
		
		 System.out.println(maxSalary.getEsalary());
		 
		 // Nullable condition checks logic by using Optional
		Optional<Employee1> optionalEmp=list.stream().max(Comparator.comparing(Employee1::getEsalary));
		           if(optionalEmp.isPresent()) {
		        	   System.out.println(optionalEmp.get().getDeptID());
		           }
		           
		// average salary
		   double empAvgSal=list.stream().collect(Collectors.averagingDouble(Employee1 :: getEsalary));  
		   System.out.println("avg salary of emp "+empAvgSal);
		   
	  // sum salary  of emp
		   System.out.println(list.stream().collect(Collectors.summarizingDouble(Employee1 :: getEsalary)));;
	  // get Max salary of emplyee by dept wise
		   
	Map<Integer,Employee1>	maxEmpSalaryByDept = list.stream().collect(Collectors.groupingBy(Employee1 :: getDeptID , Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee1 :: getEsalary)), value -> value.get())));
	maxEmpSalaryByDept.entrySet().forEach(entry -> System.out.println("Dept ID "+entry.getKey() +" Employee Detail "+entry.getValue()));
   
		 // employee count working in each dept
	Map<Integer,Long> lmap= list.stream().collect(Collectors.groupingBy(Employee1::getDeptID,Collectors.counting()));
		 
	lmap.forEach((k,v) -> {System.out.println("key DeptId :  "+k + "  value Count : "+v);} );
	// employee descending order by eid
		
 List<Employee1> listofEmpSortedByID=list.stream() .sorted( (l1,l2) -> 
                        {
                        	if(l1.getId()!=null && l2.getId()!=null) 
                        	{
                        	return	(l1.getId() > l2.getId())?-1 : (l1.getId() <l2.getId())?1 : 0;
                        	}
							return 0;
                         } 
                        
		       ).collect(Collectors.toList());
		 
 //   listofEmpSortedByID.forEach(emp -> System.out.println("Employee sorted by Id : "+emp.getId() +" : "+emp.getName()));
	// join each employee name 
    String concatEmpName =  list.stream().map(emp -> emp.getName()).collect(Collectors.joining(" , "));
    System.out.println(concatEmpName);
    List<String> ll1 = new ArrayList<>();
    ll1.add("Ram"); ll1.add("Krishn");
    List<String> ll2 = new ArrayList<>();
    ll1.add("radha"); 
    List<List<String>> ll3 = new ArrayList<>();
    ll3.add(ll1);ll3.add(ll2);
    // list of list iteration
    ll3.forEach(lword -> {
    	lword.forEach(string -> {System.out.println("string from list of list : "+string);});
    });
    // same can be achieve by flat map
  List<String> listOfWord = ll3.stream().flatMap(lString -> lString.stream()).collect(Collectors.toList());
  System.out.println("list of word : "+listOfWord);
    
		 List<Integer> li=new ArrayList(Arrays.asList(10,15,8,49,25,98,32));

				 List<String> ll =li.stream().map(l -> l+"").filter( l -> l.startsWith("1") ).collect(Collectors.toList());


				 List<Integer> l2=new ArrayList(Arrays.asList(10,15,8,49,25,98,32));

						 List<String> l1 =l2.stream().map(l -> l+"").filter( l -> l.startsWith("1") ).collect(Collectors.toList());
						 
						 System.out.println(l1);
						
					List<Integer> lcon = l1.stream().map(lin -> Integer.parseInt(lin)).collect(Collectors.toList());
					
					System.out.println("converted to integer"+lcon);
					
						 int [] nums= {1,2,3};
						 Integer value;
						 String s=new String();
						 for(int i=0;i<nums.length;i++) {
						 s=s.concat(String.valueOf(nums[i]));
						 } 
						// System.out.println(s);
						  value=Integer.parseInt(s);

						   value=value+1;
						  // System.out.println(value);
						    String s1=String.valueOf(value);
						    System.out.println(s1);
		/*
		 * int [] ar=new int [s1.length()]; int count=0; for(int i=0;i<s1.length();i++){
		 * 
		 * System.out.println(s1.charAt(i)); ar[count]=s1.charAt(i); count=count+1;
		 * 
		 * }            
		 */
						int[] num1=new int[s1.length()];
						    List<Integer> intli=new ArrayList<>();
						    //Integer in=0;
						    String st[]=new String[s1.length()];
						    for(int i=0;i<s1.length();i++) {
						    	st[i]=String.valueOf(s1.charAt(i));
						        num1[i]=Integer.parseInt((st[i]));
						    	System.out.println(intli.add(Integer.parseInt(st[i])));
						    }
						    System.out.println(" Added in list :  "+intli +" modified int array :  "+Arrays.toString(num1));
						    
						    
						    // insert Employee in map using stream
						    
						    List<Employee1> employeeList = new ArrayList<>(Arrays.asList(
		                            new Employee1("Bhagwat", 3800.99f,101l,102),
		                            new Employee1("Bhagwat1", 3800.99f,102l,102),
		                            new Employee1("Bhagwat2", 3800.99f,103l,102),
		                            new Employee1("Bhagwat3", 3800.99f,104l,102),
		                            new Employee1("Bhagwat4", 3800.99f,105l,102)
		                            ));
		         
		        Map<Long, Employee1> employeesMap = employeeList.stream()
		                                .collect(Collectors.toMap(Employee1 :: getId, 
		                                        Function.identity()));
		        
		        System.out.println( " map "+employeesMap);
		        
		        
		       String name = "abcabcadca";
		       List<String> lstr=new ArrayList<>();
     for(int i=0 ; i<name.length()-1 ;i++ ){
      String outString=String.valueOf(name.charAt(i)).concat(String.valueOf(name.charAt(i+1))) ;
        lstr.add(outString);
}
System.out.println(" out string "+lstr);
   
  Map<String , Long> freq=lstr.stream().collect(Collectors.groupingBy(l -> l , Collectors.counting()));
 Map.Entry<String, Long> maxValue=freq.entrySet().stream().max(Comparator.comparing(Map.Entry :: getValue)).get();
 
    for(Map.Entry<String , Long> entry : freq.entrySet()) {
    	System.out.println(entry.getKey()) ;
    }
 
   System.out.println(" frequency of each pair "+freq);
   System.out.println("frequency of max value pair : "+maxValue);
   
   // filter by bc 
   freq.entrySet().stream().filter(entry -> entry.getKey().equals("bc")).collect(Collectors.toList()).forEach(entry1 ->{
	   System.out.println("filtered "+entry1.getKey());
   });
  // System.out.println("listttt "+listtt);
		/*
		 * int i ; int j ; for(int k =0 ; k<j ;k++ ) { for( int n=j ;n<j-1;n++) {
		 * System.out.println(" "); } System.out.println("*"); }
		 */
   int n = 6; int i , j;
   
   // outer loop to handle rows
   for (i = n; i >= 1; i--) {

       // inner loop to print spaces.
       for (j = 1; j <= i; j++) {
              System.out.print(" ");   
       }
       // inner loop to print stars.
			
			  for (j = 0; j <= n - i; j++) { 
				  System.out.print("*"); 
				  }
       // printing new line for each row
       System.out.println();
   }
   
   for(int q=0 ; q < 5 ; q++) {
	   
      for(int r= 0 ; r<=q ;r++ ) {
    	  System.out.print("*");
      }
      System.out.println();
   }
   List<Integer> inte1=new ArrayList<>();
   inte1.add(1);
   inte1.add(2);
  	        					  
  List<List<Integer>> inte=new ArrayList<>();
   inte.add(inte1);
   inte.forEach(listi -> listi.forEach(in -> {
	  System.out.println(" list of list "+in); 
   } ));
   
   for(int f=0 ;f<5;f++) {
	   
	   for(int g=f ; g < 5 ; g++) {
		   System.out.print("*");
	   }
	   System.out.println("");
   }
   
	}
	
}

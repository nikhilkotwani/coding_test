package mysimplecode;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {  
public static void main(String[] args) {  
    Set<Employee> set=new TreeSet<Employee>();  
    //Creating Employee Records 
    Employee e1=new Employee(28,"John","Cage");  
    Employee e2=new Employee(26,"Edward","Chen");
    Employee e3=new Employee(30,"Jack","Daniels");
    //Adding Employee records to TreeSet  
    set.add(e1);  
    set.add(e2);  
    set.add(e3); 
    //traversing the treeset
     for(Employee e:set){  
    System.out.println(e.age+" "+e.firstName+" "+e.lastName);  
    }  
}  
} 
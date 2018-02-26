package mysimplecode;

class Employee implements Comparable<Employee>{  
int age;  
String firstName,lastName;  
 public Employee(int age, String firstName, String lastName) {  
    this.age = age;  
    this.firstName = firstName;  
    this.lastName = lastName;  
}  
public int compareTo(Employee e) {  
    if(age>e.age){  
        return 1;  
    }else if(age<e.age){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}



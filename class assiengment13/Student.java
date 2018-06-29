import java.util.*;
import java.io.*;

class Student{
	String name;
	int age;
	
Student(String name,int age)
    {
	 this.name=name;
     this.age=age;
	 
	 }
}


class AgeComparator implements Comparator<Student>{
           public int compare(Student s1,Student s2){
	if(s1.age==s2.age)
	
	  return 0;
	else if(s1.age>s2.age)
      return 1;
    else
      return -1;
    
  }
}

class NameComparator implements Comparator<Student>{
           public int compare(Student s1,Student s2){
	  return s1.name.compareTo(s2.name);
	  }
	 }

	 class SortList{
	 public static void main(String args[]){
	 
	 ArrayList<Student> a=new ArrayList<Student>();
     
      a.add(new Student("kirat",19));
	  a.add(new Student("rohit",20));
	  a.add(new Student("vivek",18));
	  a.add(new Student("sandy",15));
	  a.add(new Student("mandeep",19));
      a.add(new Student("pratap",16));
		  
      	  System.out.println("Sort by name = " );
		  
	Collections.sort(a,new NameComparator());
	for(Student sr : a)
	{
		System.out.println(sr.name +" " + sr.age);
	}
	
	System.out.println("Sort by age = ");
	
	Collections.sort(a,new AgeComparator());
	for(Student sr : a)
	{
		System.out.println(sr.name +" " + sr.age);
	}
	
	 }
	 }

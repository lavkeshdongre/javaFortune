import java.io.*;
import java.util.*;
import java.lang.*;

class Student{
	private int age ;
	
	public void insAge(int a){
	  age  = a ;
	  
	}
	public int taketAge(){
	return age ;
	
	}
	
}

public class Maine{
	public static void main(String[]args){
		Student s1= new Student();
		
		s1.insAge(45);
		
		System.out.println("Age of the student is :-"+ s1.taketAge());
	}
}
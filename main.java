import java.io.*;
import java.util.*;
import java.lang.*;

class Stu{
	
	String name;
	int age;
	String course;
	int Duration;
	
	void show(){
		System.out.println("Name of Student :> " + name);
		System.out.println("age of Student :> " + age);
		System.out.println("Course Select by Student :> " + course);
		System.out.println("Duration :> " + Duration);
		
	}
	
	
}


public class main{
	public static void main(String[]args){
		Stu s1 = new Stu();
		
		s1.name="lavkesh";
		s1.age=22;
		s1.course="software testing";
		s1.Duration=5;
		
		
		s1.show();
		
		Stu s2 = new Stu();
		
		s2.name="kunal";
		s2.age=21;
		s2.course="cdac";
		s2.Duration=6;
		
		
		s2.show();
		
		
	}
	
	
}
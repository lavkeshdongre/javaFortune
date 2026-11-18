import java.io.*;
import java.util.*;
import java.lang.*;


	
	class good_morning{
		int a = 10;
	public	void good_morning(){
		
	
	
		System.out.println("hello this is parent cclass");
  }
	}
  
  
  class good_neight extends good_morning{
	  void good_neight(){
		  
		  int b = 20;
	  
	  System.out.println(super.a);
  }
  }
	
	class calling{
	
		public static void main(String[]args){
		  good_neight s1 = new good_neight();
			s1.good_neight();
			System.out.println("Inheritance concept Applioed here ");
			/*s1.good_morning(); */
		
	
	}

}


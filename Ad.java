import java.io.*;
import java.util.*;
import java.lang.*;

class Ad{
	public static void main (String[]args){
		int a[] ;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array:- ");
		int n = sc.nextInt();
		
		a= new int[n];
		
		System.out.println("Enter num To add in  Arrray:-");
		
		for(int i = 0 ; i< a.length;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i = 0 ; i< a.length;i++){
		 count = count+a[i];
			
		}
		System.out.println("The Sum of all Array is :-" + count);
		
	
	}
	
}
import java.io.*;
import java.lang.*;
import java.util.*;

class Ar{
public static void main(String args[]){
	int sum=0;
	Scanner a1 = new Scanner(System.in);
	int a[] = new int[5];
	
	System.out.println("Enter Array:-");
	for(int i=0;i<a.length;i++){
		a[i] = a1.nextInt();
	}
	
	System.out.println("Display Array");
	
	for(int i = 0 ; i<a.length;i++){
		System.out.println(a[i]);
		
		sum = sum + a[i];
	}
	
	System.out.println("Sum of all Array:- "+ sum);
	
}
}
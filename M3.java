import java.io.*;
import java.lang.*;
import java.util.*;


class M3{
public static void main (String [] args){

Scanner sc =new Scanner(System.in);
int i,j;

System.out.println("Enter the value to check the factorial of each :- ");
int n =  sc.nextInt();
 int factorial = 1;
 
 for(i= 1;i<=n;i++){
	 factorial = factorial * i;
 }
 
 
 System.out.println("Factorial of the number is " + factorial); 
/*
for(i=1;i<=100;i++){
	if(i%5==0){
		count++;
}
}

System.out.println("The number count of divisible 5 is :- " + count );

/*
for(i=1;i<=10;i++){
	System.out.println("table of " + i);
	for(j=1;j<=10;j++){
		System.out.println( i + "*" + j + "=" + (i * j));
	}
}
*/
/*
System.out.println("Enter the n number = ");
int n = sc.nextInt
int sum = 0 ;

for(int i = 0;i<=n;i++){
	sum = sum + i;
}

System.out.println("sum of n number is:-  " + sum );

*/	
	
/*
int count = 0, i =0;

while(i<=10){
count= count+i;
i++;
}
System.out.println("The sum of num is "+ count);
*/
}
}
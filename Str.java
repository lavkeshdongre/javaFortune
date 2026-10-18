import java.io.*;
import java.lang.*;
import java.util.*;

class Str{
public static void main(String []args){
	
	
	String str = new String("Programming");
	
	int count_volwel = 0,constant = 0;
	
	for(int i = 0;i<str.length();i++){
		char ch = str.charAt(i);
		
		if(ch == 'a'||ch == 'A'||ch == 'e'||ch == 'E'||ch == 'i'||ch == 'I'||ch == 'o'||ch == 'O'||ch == 'u'||ch == 'U'){
			count_volwel++;
		}
		else{
			constant++;
		}
	}
	System.out.println("total count of vowel:- " + count_volwel );
	
	System.out.println("total count of Constant:- " +  constant);
	
	
}
}
/*
String ch = new String("Java");
int len = 0;

for(int i=0;i<ch.length();i++){
	
	 len++;
}
System.out.println("length of string is:- " + len);

String rev = "";

for(int i=ch.length()-1;i>=0;i--){
	rev = rev + ch.charAt(i);
}

System.out.println("Reverse String Is:- " + rev); 
}
}
*/
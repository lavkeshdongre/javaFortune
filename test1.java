import java .io.*;
import java.util.*;
import java.lang.*;

abstract class check{
	public abstract void sound();
     }
	 
	 
class speaker extends check{
	public void sound(){
		System.out.println("The speaker volumn is high ");
	}
}

class spekerloud extends check{
	public void sound(){
		System.out.println("sound volumne is low ");
	}
}
	 public class test1{
	 public static void main(String[]args){
		 
		 check c = new speaker();
		 spekerloud s = new spekerloud();
		 
		 c.sound();
		 s.sound();
		 
	 }
	 }
import java.io.*;
import java.util.*;
import java.lang.*;

class Animal{

void sound(){
 System.out.println("Animal Are sleeping");
 }
}

class Dog extends Animal{
	void sound(){
		System.out.println("Dog Are sleeping");
	}

}


class cat extends Animal{
	void sound(){
		System.out.println("cat Are sleeping");
	}

}

public class MainP{
	public static void main(String[]args){
		Dog d = new Dog();
		cat c = new cat();
		
		d.sound();
		c.sound();
	}
}
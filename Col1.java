import java.io.*;
import java.util.*;
import java.lang.*;

class Col1{
	public static void main(String[]args){
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(24);
		list.add(5);
		list.add(26);
		list.add(89);
		list.add(02);
		list.add(1);
		list.add(-5);
		Collections.sort(list);
		
		System.out.println("Sorted list is :-" + list);
		
		Collections.reverse(list);
		System.out.println("Sorted list is :-" + list);
		
		int max = Collections.max(list);
		System.out.println("maximum integer is  :-" + max);
		
		int min = Collections.min(list);
		System.out.println("MINIMUN  integer is  :-" + min);
		
		
	}
}
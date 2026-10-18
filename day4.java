import java.io.*;
import java.lang.*;
import java.util.*;

class Day4{
           public static void main(String args[]){
                    
              String username ,password;

             Scanner s1 = new Scanner(System.in);
             
             System.out.println("=============Welcome=========\n");
    
             System.out.println("Enter Username:- \n");
             username=s1.next();

              System.out.println("Enter password:- \n");
             password =s1.next();

             if(username.equals("Lavkesh") && password.equals("Lavkesh@123")){

              System.out.println("=================Login Successfully===============");
}
         else{
	System.out.println("=================Invalid User===============");

       }
            


    }
}
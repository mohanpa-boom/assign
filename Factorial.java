package assign;

import java.util.Scanner;

public class Factorial{  
	
	 public static void main(String args[]){  
	  int i,fact=1;  
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  scan.close();
	  if(n>1 && n<18)
	  {
	  for(i=1;i<=n;i++){    
	      fact=fact*i;    
	  }
	 
	  System.out.println("factorial of "+n+" is: "+fact);    
	 }
	  else
	  {
		  System.out.println("invalid input");
	  }
	 }
	}  

package assign;

import java.util.*;
public class RetailWebsite {
    public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   double amount;
    double damount;
    String user="";
   String ans;
   System.out.println("Enter the bill amount");
   amount = sc.nextDouble();
   damount=amount;
   System.out.println("Are you an employee of the store");
   System.out.println("Enter yes or no");
   ans = sc.next();
   if(ans.equals("yes") || ans.equals("YES"))
        user = "employee";
    System.out.println("Are you an affiliate of	the store");
    System.out.println("Enter yes or no");
   ans = sc.next();
   if(ans.equals("yes") || ans.equals("YES"))
        {
            if(user.isEmpty())
                user = "affiliate";
        }
    System.out.println("Are you a customer for for over 2 years");
    System.out.println("Enter yes or no");
   ans = sc.next();
   if(ans.equals("yes") || ans.equals("YES"))
   {
     if(user.isEmpty())
        user = "customer";
   }
   System.out.println("Did you buy groceries");
   System.out.println("Enter yes or no");
   ans = sc.next();
   if(ans.equals("yes") || ans.equals("YES"))
   {
        user = "groceries";
   }
   
   switch(user)
   {
       case "employee":
           amount = amount*.6;
           break;
        case "affiliate":
            amount = amount*.8;
            break;
        case "customer":
            amount = amount*.92;
            break;
        case "groceries":
            break;
   }
   if(damount>100){
       amount = amount*.92; 
   }
   System.out.println(amount);
   
}  
}
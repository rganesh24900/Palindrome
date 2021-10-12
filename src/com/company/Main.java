package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
     System.out.println("Enter a number:");
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     if (n<0 || (n%10==0 && n!=0)){
         System.out.println("Enter a valid number");
     }
     else{
         int i;
         for( i=0 ; i<n ; ){
             int pop = n%10;
             i= i*10+pop;
             n=n/10;



         }
         boolean b = (n==i || n==i/10) ;
         if (b==true){
             System.out.println("It is a Palindrome");

         }
         else {
             System.out.println("It is not a Palindrome");
         }


     }
    }
}

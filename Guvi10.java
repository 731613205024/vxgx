/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi10;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Guvi10 {

    public static int dot(int upper,int lower){
	int sum=0;
int temp=0;
for(int i=1;i<upper;i++)
	temp+=i;
for(int j=1;j<lower;j++)
	sum+=temp*j;
return sum;
    }
    public static void main(String[] args) 
    {
      Scanner scr=new Scanner(System.in);
System.out.println("Enter number of dots at upper row");
int upper=scr.nextInt();
System.out.println("Enter the number of dots at lower row");
int lower=scr.nextInt();
System.out.println(dot(upper,lower));
}
    }


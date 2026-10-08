package practice;

import java.net.NetPermission;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		try {
//			System.out.println("enter 2 numbers:");
//			int a=Sc.nextInt();
//			int b=Sc.nextInt();
//			int c=a/b;
//			System.out.println("quoitent value:"+c);
			System.out.println("enter the array size");
			int size=Sc.nextInt();
			int[]arr=new int[size];
			System.out.println("array is accepted");
			
			}
		catch(NegativeArraySizeException e) {
			System.out.println("error");
			
		}
		
		

	}

}

package progs;
import java.util.Scanner;
public class Triangle {
	
	
	
	
	

	
	public void T(){

	int n,b,num=1,d;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter no of rows");
	n=sc.nextInt();
	for(b=1;b<=n;b++)
	{
	for(d=1;d<=b;d++)
	{
	System.out.print(num+" ");
	num++;
	}
	System.out.println();
	}
	}
	public static void main(String a[])
	{
	Triangle L = new Triangle();
	L.T();
	}
	}
	 
	
	
	
	
	



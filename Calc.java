package Assignment;

import java.util.Scanner;

public class Calc {
	int a[] = new int [5];
	
	int i,count =0;
	
	void calc() {
		
	
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the values of array");
		
		a[0]=s.nextInt();
		a[1]=s.nextInt();
		a[2]=s.nextInt();
		a[3]=s.nextInt();
		a[4]=s.nextInt();
		for( i=0;i<=4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate elemens are"+a[j]);
				}
			}
			
		}
		System.out.println("The elements are ");
		for( i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		
		s.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

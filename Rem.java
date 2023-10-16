package Assignment;

import java.util.Scanner;

public class Rem {
int a[] = new int [5];
	
	int i,count =0;
	
	void remove() {
		
	
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the values of array atmost 5");
		
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
						for(int k=j;k<=4-1;k++)
						{
							a[k] = a [k + 1];  
						}
				}
			}
			
		}
		System.out.println("After removing  elements are ");
		for( i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		
		s.close();
	}
	

}

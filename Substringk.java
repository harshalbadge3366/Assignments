package Assignment;

public class Substringk {

	public static void main(String[] args) {
		Sub ob2 = new Sub();
			int k=0;
			int arr1[]= new int[6];
			int arr2[]= new int [5];
			System.out.println("Enter the elements of array first atmost 6;");
			for(int i =0;i<=5;i++)
			{
				arr1[i]=Integer.parseInt(args[k]);
				k++;
			}
			System.out.println("Enter the elements of array second atmost 5;");
			for(int i =0;i<=4;i++)
			{
				arr1[i]=Integer.parseInt(args[k]);
				k++;
			}
			System.out.println("the first array");
			for(int i =0;i<=5;i++)
			{
				System.out.println(arr1[i]);
			}
			System.out.println("the Second array");
			for(int i =0;i<=4;i++)
			{
				System.out.println(arr2[i]);
			}
			
			
	        int m = arr1.length;
	        int n = arr2.length;
	 
	        if (ob2.isSubset(arr1, arr2, m, n))
	            System.out.print("arr2[] is subset of arr1[] ");
	        else
	            System.out.print("arr2[] is not subset of arr1[] ");
	 
	    }

}




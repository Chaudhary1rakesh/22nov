package first_java_programe;
import java.util.Scanner;

public class nov_23 {
	public static void main(String[] args) {
		int n;
		int sum=0;
		System.out.print("Enter oyur Numbers:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
		}
		System.out.println("Total sum of Given Array:"+ sum);
		sc.close();
		
	}

}

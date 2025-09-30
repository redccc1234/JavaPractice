package workbook;

public class Array {

	public static void ex1() {
		
		int arr[] = {1,2,3,4,5};
		int sum = 0;  
		for(int i = 0 ; i <5 ; i++) {
	
			sum+=arr[i];
		}
		System.out.println("합계:"+ sum);
		
	}
	
	public static void ex2() {
		int arr[] = {10,25,7,30,15};
		int max = 7;
		
		for(int i =0 ; i < arr.length ; i++) {
				
			if( max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
}

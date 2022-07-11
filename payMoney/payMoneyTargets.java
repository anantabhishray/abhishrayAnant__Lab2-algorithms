package payMoney;

import java.util.Scanner;

public class payMoneyTargets {

	public static void main(String[] args) throws Exception {
		
		try (Scanner sc = new Scanner (System.in)) {
			
			System.out.println("Please enter the total Count of Transactions -");
			int Size = sc.nextInt();
			int arr[] = new int[Size];
			
			System.out.println("Please enter the Values of the Transactions -");
			for(int i=0;i<Size;i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Please enter the total number of targets that needs to be achieved -");
			int targetNo = sc.nextInt();
			
			while(targetNo-- !=0) {
				int flag = 0;
				long target;
				
				System.out.println("Please enter the value of the target -");
				target = sc.nextInt();
				
				long sum = 0;
				
				for(int i=0;i<Size;i++) {
					
					sum += arr[i];
					
					if(sum >= target) {
						System.out.println("Target achieved after " + (i+1) + " transaction/s");
						flag =1;
						break;
					}				
				
				}
				
				if(flag == 0) {
				System.out.println("Given target is not achieved");
				}		
			
			}
		
		}
	
	}

}

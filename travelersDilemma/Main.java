package travelersDilemma;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		NotesCount notesCount = new NotesCount();
		
		System.out.println("Please enter the size of the Currency Denominations -");
		
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int currency[] = new int[size];
			
			System.out.println("Please enter the Currency Denominations -");
			
			for(int i=0;i<size;i++) {
				currency[i] = sc.nextInt();
			}
			
			System.out.println("Please enter the you wish to pay -");	
			int amount = sc.nextInt();
			
			MergeSort sort = new MergeSort();
			sort.sort(currency, 0, currency.length-1);	

			notesCount.notesCountImplementation(currency, amount);
		}
		
	}

}

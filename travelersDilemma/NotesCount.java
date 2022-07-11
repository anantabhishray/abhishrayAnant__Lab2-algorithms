package travelersDilemma;

public class NotesCount {
	
	public void notesCountImplementation(int currency[], int amount) {
		
		int noteCounter[] = new int[currency.length];
		
		try {
			for(int i=0;i<currency.length;i++) {
				
				if(amount >= currency[i]) {
					noteCounter[i] = amount / currency[i];
					amount = amount % currency[i];
				}
			}
			if(amount>0) {
				System.out.println("You are short of " + amount + "! You will need additional denomination/s for this transaction.");
				return;
			}
			
			else {
				System.out.println("Your payment approach in order to give min no of notes will be -");
			}
			
			for(int i=0;i<currency.length;i++) {
				if(noteCounter[i] != 0) {
					System.out.println(currency[i] + ":" + noteCounter[i]);
				}
			}
			
		}
		
		catch (Exception ex) {
			System.out.println("Exception " + ex);
		}
	}

}
